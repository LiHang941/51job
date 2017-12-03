

## 前程无忧数据抓取到本地工具
* 抓取前程无忧网站的招聘信息到本地数据库
* 方便数据二次筛选(培训机构/坑)    
## 使用Demo
1. 初始配置导入/src/main/resources/mybatis/CreateTable.sql   
2. 配置数据库连接 /src/main/resources/mybatis/db.properties
3. 配置数据查询参数/src/main/resources/config.properties，见下方

```
#Api条件筛选

#多个条件使用参数1,参数2,参数3...依次类推的方式

#/src/main/resources/apixml/筛选参数数据见该目录

api.keyword=java  #搜索名称

api.jobarea=090200 #地区代码

api.issuedate=3 #...

api.degree=

api.saltype=

api.cosize=

api.workyear=

```

```java

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import xyz.lihang.utils.job.ConfigUtils;
import xyz.lihang.utils.job.db.DbFactory;
import xyz.lihang.utils.job.db.dto.JobInfo;
import xyz.lihang.utils.job.db.entity.Job;
import xyz.lihang.utils.job.db.mapper.JobMapper;
import xyz.lihang.utils.job.service.ApiConverterUtil;
import xyz.lihang.utils.job.tool.BeanCopyUtil;

import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.UUID;
public class Main {
    private static final Logger logger = LogManager.getLogger();

    /**
     * Api限制 最多30条记录
     */
    private static Integer pageSize = 30;
    public static void main(String[] args){
        long startTime = new Date().getTime();
        String uuidFlag = UUID.randomUUID().toString();
        SqlSessionFactory sessionFactory = DbFactory.getDbFactoryInstance().getSessionFactory();
        SqlSession sqlSession = sessionFactory.openSession();
        JobMapper mapper = sqlSession.getMapper(JobMapper.class);
        Map<String, Object> apiQueryMap = ConfigUtils.getApiQueryMap();

        logger.info("开始查询....." );
        Integer totalcount = ApiConverterUtil.getTotalcount(apiQueryMap);
        //计算总页数
        int pageCount = totalcount%pageSize == 0 ?  totalcount/ pageSize: totalcount/ pageSize +1 ;
        logger.info("查询到总记录数:" + totalcount);
        logger.info("总页数：" + pageCount);
        int inserCount = 0;
        for(int p = 1 ;p<= pageCount;p++){
            List<JobInfo> jobInfoAllList =  ApiConverterUtil.getByPage(apiQueryMap,p,pageSize);
            logger.info("当前查询第" + p + "页");
            for(int i=0;i<jobInfoAllList.size();i++){
                JobInfo jobInfo = jobInfoAllList.get(i);
                Job job = BeanCopyUtil.copyJobDto(jobInfo,uuidFlag);
                logger.info("当前插入第" +inserCount+  "个:"  + job.toString());
                mapper.insert(job);
                sqlSession.commit();
                inserCount++;
            }
        }
        sqlSession.close();
        logger.info("成功插入数据:" + inserCount);
        logger.info("耗时:" + (new Date().getTime() - startTime)/1000 + "s");
        logger.info("查询标记:" + uuidFlag);
    }
}


```

*  ## 资源说明

```
    \---src
    +---main
    |   +---java
    |   |   \---xyz
    |   |       \---lihang
    |   |           \---utils
    |   |               \---job
    |   |                   |   ConfigUtils.java         配置读取类
    |   |                   |   Main.java                    启动
    |   |                   |
    |   |                   +---db
    |   |                   |   |   DbFactory.java            
    |   |                   |   |
    |   |                   |   +---dto
    |   |                   |   |       BaseDto.java
    |   |                   |   |       JobInfo.java
    |   |                   |   |       Resultbody.java
    |   |                   |   |
    |   |                   |   +---entity
    |   |                   |   |       Job.java
    |   |                   |   |       Position.java
    |   |                   |   |
    |   |                   |   \---mapper
    |   |                   |           JobMapper.java
    |   |                   |           PositionMapper.java
    |   |                   |
    |   |                   +---service
    |   |                   |       ApiConverterUtil.java
    |   |                   |       JobApiService.java
    |   |                   |       JobHtmlService.java
    |   |                   |       ParseHtmlConverterUtil.java
    |   |                   |       RetrofitServiceFactory.java
    |   |                   |
    |   |                   \---tool
    |   |                           BeanCopyUtil.java
    |   |                           XMLUtil.java
    |   |
    |   \---resources
    |       |   config.properties
    |       |   Log4j2.xml
    |       |   regex.txt
    |       |
    |       +---apixml                 	``Api筛选条件数据
    |       |       cosize.xml
    |       |       degree.xml
    |       |       issuedate.xml
    |       |       saltype.xml
    |       |       workyear.xml
    |       |
    |       \---mybatis
    |           |   CreateTable.sql     ``开始务必执行CreateTable.sql
    |           |   db.properties	``务必配置数据库连接配置
    |           |   mybatis-config.xml
    |           |   select.sql
    |           |
    |           \---mapper
    |                   JobMapper.xml
    |                   PositionMapper.xml
    |
    \---test
        \---java
            \---xyz
                \---lihang
                    \---utils
                        \---job
                            \---test
                                    MyBatisTest.java
XmlParseTest.java
    
```

******

*   关于
    * [交流群](https://jq.qq.com/?_wv=1027&k=4EPZ3Xr)  
    * [小航博客](http://lihang.xyz)
    * 微信公众号
    * <img src="http://www.lihang.xyz/images/weixin.jpg" width = "150" height = "150" alt="公众二维码" align=center />

