package xyz.lihang.utils.job.test;

import com.alibaba.fastjson.JSONArray;
import org.apache.commons.io.IOUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;
import xyz.lihang.utils.job.tool.XMLUtil;

public class Test1 {
    Logger logger = LogManager.getLogger();

    @Test
    public void test()throws Exception{

        String [] names = {"cosize.xml","degree.xml","issuedate.xml","saltype.xml","workyear.xml","cotype.xml"};

        for(String name :names){
            json("/apixml/"  + name);
        }
    }


    public void json(String name)throws Exception{
        Responsemessage responsemessage = XMLUtil.convertXmlStrToObject(
                Responsemessage.class,
                IOUtils.toString(
                        getClass().getResourceAsStream(name), "utf-8")
        );
        logger.info("==========="+name+"============");
        logger.info(JSONArray.toJSONString(responsemessage.getResultbody().getList()));
        logger.info("==========="+name+"============");
    }

}
