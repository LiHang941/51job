package xyz.lihang.utils.job.db;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.InputStream;

public class DbFactory {


    private DbFactory(){}

    static  class Instance{
        private static DbFactory instance = null;
        private static SqlSessionFactory sqlSessionFactory;
        static {
            try {
                instance = new DbFactory();
                String xmlResource = "mybatis/mybatis-config.xml";
                InputStream inputStream = Resources.getResourceAsStream(xmlResource);
                sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
            }catch (Exception e){
                throw new RuntimeException();
            }
        }
    }

    public static DbFactory getDbFactoryInstance(){
        return Instance.instance;
    }

    public SqlSessionFactory getSessionFactory(){
        return Instance.sqlSessionFactory;
    }



}
