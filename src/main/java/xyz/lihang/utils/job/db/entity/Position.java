package xyz.lihang.utils.job.db.entity;

import java.util.Date;

/**
 * no comment
 */
public class Position {
    /**
     * id
     * 本值对应的数据列为 position.id
     */
    private Long id;

    /**
     * 职位名称
     * 本值对应的数据列为 position.position_name
     */
    private String positionName;

    /**
     * 工作细节url地址
     * 本值对应的数据列为 position.job_details_url
     */
    private String jobDetailsUrl;

    /**
     * 公司名称
     * 本值对应的数据列为 position.company_name
     */
    private String companyName;

    /**
     * 工作地点
     * 本值对应的数据列为 position.working_place
     */
    private String workingPlace;

    /**
     * 工资
     * 本值对应的数据列为 position.salary
     */
    private String salary;

    /**
     * 发布时间
     * 本值对应的数据列为 position.release_ime
     */
    private Date releaseIme;

    /**
     * 创建时间
     * 本值对应的数据列为 position.create_time
     */
    private Date createTime;

    /**
     * 该公司的所有职位介绍
     * 本值对应的数据列为 position.all_positions_url
     */
    private String allPositionsUrl;

    /**
     * 获取 id
     * 本方法获取数据列 position.id 中的值
     * 
     * @return the value of position.id
     */
    public Long getId() {
        return id;
    }

    /**
     * 设置 id
     * 本方法更改数据列 position.id 中的值
     * 
     * @param id the value for position.id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 获取 职位名称
     * 本方法获取数据列 position.position_name 中的值
     * 
     * @return the value of position.position_name
     */
    public String getPositionName() {
        return positionName;
    }

    /**
     * 设置 职位名称
     * 本方法更改数据列 position.position_name 中的值
     * 
     * @param positionName the value for position.position_name
     */
    public void setPositionName(String positionName) {
        this.positionName = positionName;
    }

    /**
     * 获取 工作细节url地址
     * 本方法获取数据列 position.job_details_url 中的值
     * 
     * @return the value of position.job_details_url
     */
    public String getJobDetailsUrl() {
        return jobDetailsUrl;
    }

    /**
     * 设置 工作细节url地址
     * 本方法更改数据列 position.job_details_url 中的值
     * 
     * @param jobDetailsUrl the value for position.job_details_url
     */
    public void setJobDetailsUrl(String jobDetailsUrl) {
        this.jobDetailsUrl = jobDetailsUrl;
    }

    /**
     * 获取 公司名称
     * 本方法获取数据列 position.company_name 中的值
     * 
     * @return the value of position.company_name
     */
    public String getCompanyName() {
        return companyName;
    }

    /**
     * 设置 公司名称
     * 本方法更改数据列 position.company_name 中的值
     * 
     * @param companyName the value for position.company_name
     */
    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    /**
     * 获取 工作地点
     * 本方法获取数据列 position.working_place 中的值
     * 
     * @return the value of position.working_place
     */
    public String getWorkingPlace() {
        return workingPlace;
    }

    /**
     * 设置 工作地点
     * 本方法更改数据列 position.working_place 中的值
     * 
     * @param workingPlace the value for position.working_place
     */
    public void setWorkingPlace(String workingPlace) {
        this.workingPlace = workingPlace;
    }

    /**
     * 获取 工资
     * 本方法获取数据列 position.salary 中的值
     * 
     * @return the value of position.salary
     */
    public String getSalary() {
        return salary;
    }

    /**
     * 设置 工资
     * 本方法更改数据列 position.salary 中的值
     * 
     * @param salary the value for position.salary
     */
    public void setSalary(String salary) {
        this.salary = salary;
    }

    /**
     * 获取 发布时间
     * 本方法获取数据列 position.release_ime 中的值
     * 
     * @return the value of position.release_ime
     */
    public Date getReleaseIme() {
        return releaseIme;
    }

    /**
     * 设置 发布时间
     * 本方法更改数据列 position.release_ime 中的值
     * 
     * @param releaseIme the value for position.release_ime
     */
    public void setReleaseIme(Date releaseIme) {
        this.releaseIme = releaseIme;
    }

    /**
     * 获取 创建时间
     * 本方法获取数据列 position.create_time 中的值
     * 
     * @return the value of position.create_time
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置 创建时间
     * 本方法更改数据列 position.create_time 中的值
     * 
     * @param createTime the value for position.create_time
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 获取 该公司的所有职位介绍
     * 本方法获取数据列 position.all_positions_url 中的值
     * 
     * @return the value of position.all_positions_url
     */
    public String getAllPositionsUrl() {
        return allPositionsUrl;
    }

    /**
     * 设置 该公司的所有职位介绍
     * 本方法更改数据列 position.all_positions_url 中的值
     * 
     * @param allPositionsUrl the value for position.all_positions_url
     */
    public void setAllPositionsUrl(String allPositionsUrl) {
        this.allPositionsUrl = allPositionsUrl;
    }
}