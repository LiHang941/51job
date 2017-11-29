package xyz.lihang.utils.job.test;


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
