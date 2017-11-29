package xyz.lihang.utils.job.db.entity;

import java.util.Date;

/**
 * no comment
 */
public class Job {
    /**
     * 本值对应的数据列为 job.id
     */
    private Integer id;

    /**
     * 公司id
     * 本值对应的数据列为 job.coid
     */
    private Long coid;

    /**
     * 公司地点
     * 本值对应的数据列为 job.cddr
     */
    private String cddr;

    /**
     * 公司名称
     * 本值对应的数据列为 job.coname
     */
    private String coname;

    /**
     * 公司类型
     * 本值对应的数据列为 job.cotype
     */
    private String cotype;

    /**
     * 工作id
     * 本值对应的数据列为 job.jobid
     */
    private Long jobid;

    /**
     * 工作区域位置
     * 本值对应的数据列为 job.jobarea
     */
    private String jobarea;

    /**
     * 工作需求信息
     * 本值对应的数据列为 job.jobinfo
     */
    private String jobinfo;

    /**
     * 工作名称
     * 本值对应的数据列为 job.jobname
     */
    private String jobname;

    /**
     * 工作类型
     * 本值对应的数据列为 job.jobtype
     */
    private String jobtype;

    /**
     * 要求学历
     * 本值对应的数据列为 job.degree
     */
    private String degree;

    /**
     * 工作经验
     * 本值对应的数据列为 job.workyear
     */
    private String workyear;

    /**
     * 工资预计
     * 本值对应的数据列为 job.providesalary
     */
    private String providesalary;

    /**
     * 最后更新时间
     * 本值对应的数据列为 job.lastupdate
     */
    private Date lastupdate;

    /**
     * 发行日期
     * 本值对应的数据列为 job.issuedate
     */
    private Date issuedate;

    /**
     * 是否是实习
     * 本值对应的数据列为 job.isintern
     */
    private Integer isintern;

    /**
     * 是否沟通？没看懂什么意思....
     * 本值对应的数据列为 job.iscommunicate
     */
    private Integer iscommunicate;

    /**
     * 是否紧急
     * 本值对应的数据列为 job.isurgency
     */
    private Integer isurgency;

    /**
     * 是否置顶
     * 本值对应的数据列为 job.istop
     */
    private Integer istop;

    /**
     * 插入分类,不用理会
     * 本值对应的数据列为 job.insert_flag_uuid
     */
    private String insertFlagUuid;

    /**
     * 本方法获取数据列 job.id 中的值
     * 
     * @return the value of job.id
     */
    public Integer getId() {
        return id;
    }

    /**
     * 本方法更改数据列 job.id 中的值
     * 
     * @param id the value for job.id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取 公司id
     * 本方法获取数据列 job.coid 中的值
     * 
     * @return the value of job.coid
     */
    public Long getCoid() {
        return coid;
    }

    /**
     * 设置 公司id
     * 本方法更改数据列 job.coid 中的值
     * 
     * @param coid the value for job.coid
     */
    public void setCoid(Long coid) {
        this.coid = coid;
    }

    /**
     * 获取 公司地点
     * 本方法获取数据列 job.cddr 中的值
     * 
     * @return the value of job.cddr
     */
    public String getCddr() {
        return cddr;
    }

    /**
     * 设置 公司地点
     * 本方法更改数据列 job.cddr 中的值
     * 
     * @param cddr the value for job.cddr
     */
    public void setCddr(String cddr) {
        this.cddr = cddr;
    }

    /**
     * 获取 公司名称
     * 本方法获取数据列 job.coname 中的值
     * 
     * @return the value of job.coname
     */
    public String getConame() {
        return coname;
    }

    /**
     * 设置 公司名称
     * 本方法更改数据列 job.coname 中的值
     * 
     * @param coname the value for job.coname
     */
    public void setConame(String coname) {
        this.coname = coname;
    }

    /**
     * 获取 公司类型
     * 本方法获取数据列 job.cotype 中的值
     * 
     * @return the value of job.cotype
     */
    public String getCotype() {
        return cotype;
    }

    /**
     * 设置 公司类型
     * 本方法更改数据列 job.cotype 中的值
     * 
     * @param cotype the value for job.cotype
     */
    public void setCotype(String cotype) {
        this.cotype = cotype;
    }

    /**
     * 获取 工作id
     * 本方法获取数据列 job.jobid 中的值
     * 
     * @return the value of job.jobid
     */
    public Long getJobid() {
        return jobid;
    }

    /**
     * 设置 工作id
     * 本方法更改数据列 job.jobid 中的值
     * 
     * @param jobid the value for job.jobid
     */
    public void setJobid(Long jobid) {
        this.jobid = jobid;
    }

    /**
     * 获取 工作区域位置
     * 本方法获取数据列 job.jobarea 中的值
     * 
     * @return the value of job.jobarea
     */
    public String getJobarea() {
        return jobarea;
    }

    /**
     * 设置 工作区域位置
     * 本方法更改数据列 job.jobarea 中的值
     * 
     * @param jobarea the value for job.jobarea
     */
    public void setJobarea(String jobarea) {
        this.jobarea = jobarea;
    }

    /**
     * 获取 工作需求信息
     * 本方法获取数据列 job.jobinfo 中的值
     * 
     * @return the value of job.jobinfo
     */
    public String getJobinfo() {
        return jobinfo;
    }

    /**
     * 设置 工作需求信息
     * 本方法更改数据列 job.jobinfo 中的值
     * 
     * @param jobinfo the value for job.jobinfo
     */
    public void setJobinfo(String jobinfo) {
        this.jobinfo = jobinfo;
    }

    /**
     * 获取 工作名称
     * 本方法获取数据列 job.jobname 中的值
     * 
     * @return the value of job.jobname
     */
    public String getJobname() {
        return jobname;
    }

    /**
     * 设置 工作名称
     * 本方法更改数据列 job.jobname 中的值
     * 
     * @param jobname the value for job.jobname
     */
    public void setJobname(String jobname) {
        this.jobname = jobname;
    }

    /**
     * 获取 工作类型
     * 本方法获取数据列 job.jobtype 中的值
     * 
     * @return the value of job.jobtype
     */
    public String getJobtype() {
        return jobtype;
    }

    /**
     * 设置 工作类型
     * 本方法更改数据列 job.jobtype 中的值
     * 
     * @param jobtype the value for job.jobtype
     */
    public void setJobtype(String jobtype) {
        this.jobtype = jobtype;
    }

    /**
     * 获取 要求学历
     * 本方法获取数据列 job.degree 中的值
     * 
     * @return the value of job.degree
     */
    public String getDegree() {
        return degree;
    }

    /**
     * 设置 要求学历
     * 本方法更改数据列 job.degree 中的值
     * 
     * @param degree the value for job.degree
     */
    public void setDegree(String degree) {
        this.degree = degree;
    }

    /**
     * 获取 工作经验
     * 本方法获取数据列 job.workyear 中的值
     * 
     * @return the value of job.workyear
     */
    public String getWorkyear() {
        return workyear;
    }

    /**
     * 设置 工作经验
     * 本方法更改数据列 job.workyear 中的值
     * 
     * @param workyear the value for job.workyear
     */
    public void setWorkyear(String workyear) {
        this.workyear = workyear;
    }

    /**
     * 获取 工资预计
     * 本方法获取数据列 job.providesalary 中的值
     * 
     * @return the value of job.providesalary
     */
    public String getProvidesalary() {
        return providesalary;
    }

    /**
     * 设置 工资预计
     * 本方法更改数据列 job.providesalary 中的值
     * 
     * @param providesalary the value for job.providesalary
     */
    public void setProvidesalary(String providesalary) {
        this.providesalary = providesalary;
    }

    /**
     * 获取 最后更新时间
     * 本方法获取数据列 job.lastupdate 中的值
     * 
     * @return the value of job.lastupdate
     */
    public Date getLastupdate() {
        return lastupdate;
    }

    /**
     * 设置 最后更新时间
     * 本方法更改数据列 job.lastupdate 中的值
     * 
     * @param lastupdate the value for job.lastupdate
     */
    public void setLastupdate(Date lastupdate) {
        this.lastupdate = lastupdate;
    }

    /**
     * 获取 发行日期
     * 本方法获取数据列 job.issuedate 中的值
     * 
     * @return the value of job.issuedate
     */
    public Date getIssuedate() {
        return issuedate;
    }

    /**
     * 设置 发行日期
     * 本方法更改数据列 job.issuedate 中的值
     * 
     * @param issuedate the value for job.issuedate
     */
    public void setIssuedate(Date issuedate) {
        this.issuedate = issuedate;
    }

    /**
     * 获取 是否是实习
     * 本方法获取数据列 job.isintern 中的值
     * 
     * @return the value of job.isintern
     */
    public Integer getIsintern() {
        return isintern;
    }

    /**
     * 设置 是否是实习
     * 本方法更改数据列 job.isintern 中的值
     * 
     * @param isintern the value for job.isintern
     */
    public void setIsintern(Integer isintern) {
        this.isintern = isintern;
    }

    /**
     * 获取 是否沟通？没看懂什么意思....
     * 本方法获取数据列 job.iscommunicate 中的值
     * 
     * @return the value of job.iscommunicate
     */
    public Integer getIscommunicate() {
        return iscommunicate;
    }

    /**
     * 设置 是否沟通？没看懂什么意思....
     * 本方法更改数据列 job.iscommunicate 中的值
     * 
     * @param iscommunicate the value for job.iscommunicate
     */
    public void setIscommunicate(Integer iscommunicate) {
        this.iscommunicate = iscommunicate;
    }

    /**
     * 获取 是否紧急
     * 本方法获取数据列 job.isurgency 中的值
     * 
     * @return the value of job.isurgency
     */
    public Integer getIsurgency() {
        return isurgency;
    }

    /**
     * 设置 是否紧急
     * 本方法更改数据列 job.isurgency 中的值
     * 
     * @param isurgency the value for job.isurgency
     */
    public void setIsurgency(Integer isurgency) {
        this.isurgency = isurgency;
    }

    /**
     * 获取 是否置顶
     * 本方法获取数据列 job.istop 中的值
     * 
     * @return the value of job.istop
     */
    public Integer getIstop() {
        return istop;
    }

    /**
     * 设置 是否置顶
     * 本方法更改数据列 job.istop 中的值
     * 
     * @param istop the value for job.istop
     */
    public void setIstop(Integer istop) {
        this.istop = istop;
    }

    /**
     * 获取 插入分类,不用理会
     * 本方法获取数据列 job.insert_flag_uuid 中的值
     * 
     * @return the value of job.insert_flag_uuid
     */
    public String getInsertFlagUuid() {
        return insertFlagUuid;
    }

    /**
     * 设置 插入分类,不用理会
     * 本方法更改数据列 job.insert_flag_uuid 中的值
     * 
     * @param insertFlagUuid the value for job.insert_flag_uuid
     */
    public void setInsertFlagUuid(String insertFlagUuid) {
        this.insertFlagUuid = insertFlagUuid;
    }


    @Override
    public String toString() {
        return "Job{" +
                "coname='" + coname + '\'' +
                ", jobid=" + jobid +
                ", jobarea='" + jobarea + '\'' +
                ", jobname='" + jobname + '\'' +
                ", degree='" + degree + '\'' +
                ", workyear='" + workyear + '\'' +
                '}';
    }
}