package com.uca.entity;

import java.util.Date;

/**
 * @author puyijun
 * @ClassName User
 * @date 2018-01-12
 * @time 14:47
 * @Description
 **/

public class User {

    //用户id
    private Long userId;
    //名字
    private String userName;
    //账号
    private String account;
    //密码
    private String password;

    private Date createTime;

    private String email;

    private String phone;

    private String sex;

    private String picture;

    private Long weixinUserId;

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public Long getWeixinUserId() {
        return weixinUserId;
    }

    public void setWeixinUserId(Long weixinUserId) {
        this.weixinUserId = weixinUserId;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", userName='" + userName + '\'' +
                ", account='" + account + '\'' +
                ", password='" + password + '\'' +
                ", createTime=" + createTime +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", sex='" + sex + '\'' +
                ", picture='" + picture + '\'' +
                ", weixinUserId=" + weixinUserId +
                '}';
    }
}
