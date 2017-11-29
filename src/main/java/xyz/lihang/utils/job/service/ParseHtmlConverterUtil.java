package xyz.lihang.utils.job.service;

import com.alibaba.fastjson.JSON;
import okhttp3.ResponseBody;
import org.apache.commons.io.IOUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import retrofit2.Call;
import retrofit2.Response;
import xyz.lihang.utils.job.ConfigUtils;
import xyz.lihang.utils.job.db.entity.Position;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * html解析工具类
 * 使用Api查询
 */
@Deprecated
public final class ParseHtmlConverterUtil {

   private ParseHtmlConverterUtil(){}

   private static String htmlRegex = null;

   private static final Logger log = LogManager.getLogger(ParseHtmlConverterUtil.class);

   static {
       try {
           htmlRegex = IOUtils.toString(ParseHtmlConverterUtil.class.getResourceAsStream("/regex.txt")).replaceAll("\\s+","");
       }catch (IOException e){
           throw new RuntimeException(e.getMessage());
       }
   }


   public static List<Position> getPosition(){
       try {
           JobHtmlService JOB_HTML_SERVICE = RetrofitServiceFactory.JOB_HTML_SERVICE;
           Call<ResponseBody> call = JOB_HTML_SERVICE.jobhtml(ConfigUtils.getHtmlQueryMap(), 1);
           log.info("url:" +  call.request().url().toString() );
           Response<ResponseBody> response = call.execute();
           String html =  IOUtils.toString(response.body().byteStream(),"gb2312");
           List<Position> list = ParseHtmlConverterUtil.parseHtmlToPosition(html);
           for (Position p:list){
               log.info(JSON.toJSONString(p));
           }
           return list;
       }catch (IOException e){
           throw new RuntimeException(e);
       }
   }

   public static List<Position> parseHtmlToPosition(String html){
       List<Position> list = new ArrayList<>();
       Pattern pat = Pattern.compile(htmlRegex);
       Matcher mat = pat.matcher(html);
       SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
       String year = Integer.toString(Calendar.getInstance().getWeekYear())+"-";
       while(mat.find()){
           Position position = new Position();
           position.setPositionName( mat.group(1));
           position.setJobDetailsUrl(mat.group(2));
           position.setCompanyName(mat.group(4));
           position.setAllPositionsUrl(mat.group(5));
           position.setWorkingPlace(mat.group(7));
           position.setSalary(mat.group(8));
           try {
               position.setReleaseIme(simpleDateFormat.parse(year + mat.group(9)));
           }catch (ParseException e){
               log.info("SimpleDateFormat parse Exception: " + year + mat.group(9));
           }
           position.setCreateTime(new Date());
           list.add(position);
       }
       return list;
   }

}