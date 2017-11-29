package xyz.lihang.utils.job.db.mapper;

import java.util.List;
import xyz.lihang.utils.job.db.entity.Job;

public interface JobMapper {
    /**
     * 本方法对应的数据表为 job
     * @param id id
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * 本方法对应的数据表为 job
     * @param record record
     */
    int insert(Job record);

    /**
     * 本方法对应的数据表为 job
     * @param id id
     */
    Job selectByPrimaryKey(Integer id);

    /**
     * 本方法对应的数据表为 job
     */
    List<Job> selectAll();

    /**
     * 本方法对应的数据表为 job
     * @param record record
     */
    int updateByPrimaryKey(Job record);
}