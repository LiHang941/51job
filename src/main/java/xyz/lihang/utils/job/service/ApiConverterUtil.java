package xyz.lihang.utils.job.service;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import retrofit2.Call;
import retrofit2.Response;
import xyz.lihang.utils.job.db.dto.BaseDto;
import xyz.lihang.utils.job.db.dto.JobInfo;

import java.io.IOException;
import java.util.List;
import java.util.Map;

public final class ApiConverterUtil {

    private static final Logger logger = LogManager.getLogger();

    public static Integer getTotalcount(Map<String,Object> query){
        try {
            Call<BaseDto> call = RetrofitServiceFactory.JOB_API_SERVICE.jobhtml(query, 0, 1);
            logger.info("url:" + call.request().url());
            Response<BaseDto> execute = call.execute();
            BaseDto body = execute.body();
            logger.info("code:" + execute.code());
            return body.getResultbody().getTotalcount();
        }catch (IOException e){
            throw new RuntimeException(e);
        }
    }

    public static List<JobInfo> getByPage (Map<String,Object> query ,Integer pageno , Integer pageSize){
        try {
            Call<BaseDto> call = RetrofitServiceFactory.JOB_API_SERVICE.jobhtml(query, pageno, pageSize);
            logger.info("url:" + call.request().url());
            Response<BaseDto> execute = call.execute();
            BaseDto body = execute.body();
            logger.info("code:" + execute.code());
            return body.getResultbody().getItem();
        }catch (IOException e){
            throw new RuntimeException(e);
        }
    }
}
