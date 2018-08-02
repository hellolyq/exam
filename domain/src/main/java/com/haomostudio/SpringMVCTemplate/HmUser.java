package com.haomostudio.SpringMVCTemplate;

import java.util.Date;
import java.util.List;

public class HmUser {
    private String id;

    private String username;

    private String loginid;

    private String password;

    private String mobile;

    private String email;

    private String avatar;

    private Date createTime;

    private Date lastUpdateTime;

    private Date lastLoginTime;

    private String departmentCode;

    private String roleId;

    private Integer meetingRemindingTime;

    private String jobTitle;

    private String phoneNumber;

    private String phoneNumberSpare;

    private Integer rank;

    private String community;

    private String enable;

    private String hide;

    private String departmentId;

    private String code;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getLoginid() {
        return loginid;
    }

    public void setLoginid(String loginid) {
        this.loginid = loginid;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getLastUpdateTime() {
        return lastUpdateTime;
    }

    public void setLastUpdateTime(Date lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
    }

    public Date getLastLoginTime() {
        return lastLoginTime;
    }

    public void setLastLoginTime(Date lastLoginTime) {
        this.lastLoginTime = lastLoginTime;
    }

    public String getDepartmentCode() {
        return departmentCode;
    }

    public void setDepartmentCode(String departmentCode) {
        this.departmentCode = departmentCode;
    }

    public String getRoleId() {
        return roleId;
    }

    public void setRoleId(String roleId) {
        this.roleId = roleId;
    }

    public Integer getMeetingRemindingTime() {
        return meetingRemindingTime;
    }

    public void setMeetingRemindingTime(Integer meetingRemindingTime) {
        this.meetingRemindingTime = meetingRemindingTime;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPhoneNumberSpare() {
        return phoneNumberSpare;
    }

    public void setPhoneNumberSpare(String phoneNumberSpare) {
        this.phoneNumberSpare = phoneNumberSpare;
    }

    public Integer getRank() {
        return rank;
    }

    public void setRank(Integer rank) {
        this.rank = rank;
    }

    public String getCommunity() {
        return community;
    }

    public void setCommunity(String community) {
        this.community = community;
    }

    public String getEnable() {
        return enable;
    }

    public void setEnable(String enable) {
        this.enable = enable;
    }

    public String getHide() {
        return hide;
    }

    public void setHide(String hide) {
        this.hide = hide;
    }

    public String getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(String departmentId) {
        this.departmentId = departmentId;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", username=").append(username);
        sb.append(", loginid=").append(loginid);
        sb.append(", password=").append(password);
        sb.append(", mobile=").append(mobile);
        sb.append(", email=").append(email);
        sb.append(", avatar=").append(avatar);
        sb.append(", createTime=").append(createTime);
        sb.append(", lastUpdateTime=").append(lastUpdateTime);
        sb.append(", lastLoginTime=").append(lastLoginTime);
        sb.append(", departmentCode=").append(departmentCode);
        sb.append(", roleId=").append(roleId);
        sb.append(", meetingRemindingTime=").append(meetingRemindingTime);
        sb.append(", jobTitle=").append(jobTitle);
        sb.append(", phoneNumber=").append(phoneNumber);
        sb.append(", phoneNumberSpare=").append(phoneNumberSpare);
        sb.append(", rank=").append(rank);
        sb.append(", community=").append(community);
        sb.append(", enable=").append(enable);
        sb.append(", hide=").append(hide);
        sb.append(", departmentId=").append(departmentId);
        sb.append(", code=").append(code);
        sb.append("]");
        return sb.toString();
    }

    /**
     * @Description :用户管理
     * @author: gongbin
     * @date: 2018/8/2 19:32
     */
    public static interface HmUserService {
        /**
         * @Description :创建用户
         * @author: gongbin
         * @date: 2018/8/2 19:31
        */
        int create(HmUser item);

        /**
        * @Description :更新用户
        * @author: gongbin
        * @date: 2018/8/2 19:32
        */
        int update(HmUser item);

        HmUser get(String id);

        /**
        * 获取列表
        * @param pageNo 整数,如1
        * @param pageSize 整数,如10
        * @param sortItem 格式为"id, name"
        * @param sortOrder 格式为"asc, desc"
        * @param filters JSON字符串,格式为
        * @return 列表
        */
        List<HmUser> getListWithPagingAndFilter(Integer pageNo, Integer pageSize,
                                                String sortItem, String sortOrder,
                                                String filters);



    }
}