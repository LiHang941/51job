package xyz.lihang.utils.job.service;

import okhttp3.ResponseBody;
import org.apache.commons.io.IOUtils;
import retrofit2.Converter;
import retrofit2.Retrofit;
import xyz.lihang.utils.job.db.dto.BaseDto;
import xyz.lihang.utils.job.tool.XMLUtil;

import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;

public class RetrofitServiceFactory {

    @Deprecated
    public static final JobHtmlService JOB_HTML_SERVICE =  new Retrofit.Builder()
            .baseUrl("http://search.51job.com/")
            .build()
            .create(JobHtmlService.class);


    /**
     * Api查询Service
     */
    public static final JobApiService JOB_API_SERVICE  = new Retrofit.Builder()
            .baseUrl("http://api.51job.com/")
            .addConverterFactory(new BaseDtoConverterFactory())
            .build()
            .create(JobApiService.class);



    private static class BaseDtoConverterFactory extends Converter.Factory{
        @Override
        public Converter<ResponseBody, ?> responseBodyConverter(Type type, Annotation[] annotations, Retrofit retrofit) {
            return new Converter<ResponseBody,Object>() {
                @Override
                public BaseDto convert(ResponseBody body) throws IOException {
                    String xmlString = IOUtils.toString(body.byteStream(),"utf-8");
                    BaseDto baseDto = XMLUtil.convertXmlStrToObject(BaseDto.class, xmlString);
                    return baseDto;
                }
            };
        }
    }

}
