package xyz.lihang.utils.job;

import com.alibaba.fastjson.JSON;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

/**
 * 读取Config.properties文件并解析
 */
public final class ConfigUtils{

    private static Map<String,Object> htmlQueryMap= new HashMap<>();

    private static Map<String,Object> apiQueryMap = new HashMap<>();

    public static Map<String, Object> getHtmlQueryMap() {
        log.info("htmlQueryMap==>" + JSON.toJSONString(htmlQueryMap));
        return htmlQueryMap;
    }

    public static Map<String, Object> getApiQueryMap() {
        log.info("apiQueryMap==>" + JSON.toJSONString(apiQueryMap));
        return apiQueryMap;
    }

    private static final Logger log = LogManager.getLogger(ConfigUtils.class);

    static {
        try {
            Properties properties = new Properties();
            properties.load(new InputStreamReader(ConfigUtils.class.getResourceAsStream("/config.properties"),"utf-8"));
            htmlQueryMap.put(HtmlQueryEnum.jobarea.name() , properties.getProperty(HtmlQueryEnum.jobarea.value));
            htmlQueryMap.put(HtmlQueryEnum.keyword.name() , properties.getProperty(HtmlQueryEnum.keyword.value));
            htmlQueryMap.put(HtmlQueryEnum.issuedate.name() , properties.getProperty(HtmlQueryEnum.issuedate.value));
            apiQueryMap.put(ApiQueryEnum.jobarea.name() , properties.getProperty(ApiQueryEnum.jobarea.value));
            apiQueryMap.put(ApiQueryEnum.keyword.name() , properties.getProperty(ApiQueryEnum.keyword.value));
            apiQueryMap.put(ApiQueryEnum.issuedate.name() , properties.getProperty(ApiQueryEnum.issuedate.value));
            apiQueryMap.put(ApiQueryEnum.degree.name() , properties.getProperty(ApiQueryEnum.degree.value));
            apiQueryMap.put(ApiQueryEnum.saltype.name() , properties.getProperty(ApiQueryEnum.saltype.value));
            apiQueryMap.put(ApiQueryEnum.cosize.name() , properties.getProperty(ApiQueryEnum.cosize.value));
            apiQueryMap.put(ApiQueryEnum.workyear.name() , properties.getProperty(ApiQueryEnum.workyear.value));
        }catch (IOException e){
            throw new RuntimeException(e);
        }
    }

    private ConfigUtils(){}

    /**
     * htmlQuery配置枚举
     */
    public static enum HtmlQueryEnum {

        jobarea("html.jobarea"),keyword("html.keyword"),issuedate("html.issuedate");

        HtmlQueryEnum(String value) {
            this.value = value;
        }

        private String value ;

        public String getValue() {
            return value;
        }

        public void setValue(String value) {
            this.value = value;
        }
    }

    /**
     * ApiQuery配置枚举
     */
    public static enum ApiQueryEnum {

        jobarea("api.jobarea"), keyword("api.keyword"), issuedate("api.issuedate"),
        degree("api.degree"), saltype("api.saltype"), cosize("api.cosize"),
        workyear("api.workyear");

        ApiQueryEnum(String value) {
            this.value = value;
        }

        private String value ;

        public String getValue() {
            return value;
        }

        public void setValue(String value) {
            this.value = value;
        }
    }

}
