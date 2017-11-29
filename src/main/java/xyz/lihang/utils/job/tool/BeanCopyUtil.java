package xyz.lihang.utils.job.tool;

import org.apache.commons.beanutils.BeanUtils;
import xyz.lihang.utils.job.db.dto.JobInfo;
import xyz.lihang.utils.job.db.entity.Job;
import java.util.Date;

public final class BeanCopyUtil {

    private BeanCopyUtil(){}

    /**
     *
     * @param jobInfo
     * @return
     */
    public static Job copyJobDto (JobInfo jobInfo,String uuid){
        try {
            Job job = new Job();
            BeanUtils.copyProperties(job,jobInfo);
            //*1000 php时间戳于java不同  php是10位  java 是13位
            job.setLastupdate(new Date(jobInfo.getLastupdate() * 1000));
            job.setInsertFlagUuid(uuid);
            return job;
        }catch (Exception e){
            return null;
        }
    }
}
