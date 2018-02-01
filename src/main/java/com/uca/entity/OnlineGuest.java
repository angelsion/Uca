package com.uca.entity;

import java.util.Date;

/**
 * @author puyijun
 * @ClassName OnlineGuest
 * @date 2018-01-12
 * @time 15:57
 * @Description
 **/

public class OnlineGuest {
    private Long guestId;

    private String inboundId;

    private Long userId;

    private String userName;

    private String sessionId;

    private String remark;

    private Date createTime;

    private Date modifyTime;

    public Long getGuestId() {
        return guestId;
    }

    public void setGuestId(Long guestId) {
        this.guestId = guestId;
    }

    public String getInboundId() {
        return inboundId;
    }

    public void setInboundId(String inboundId) {
        this.inboundId = inboundId;
    }

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

    public String getSessionId() {
        return sessionId;
    }

    public void setSessionId(String sessionId) {
        this.sessionId = sessionId;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getModifyTime() {
        return modifyTime;
    }

    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }

    @Override
    public String toString() {
        return "OnlineGuest{" +
                "guestId=" + guestId +
                ", inboundId='" + inboundId + '\'' +
                ", userId=" + userId +
                ", userName='" + userName + '\'' +
                ", sessionId='" + sessionId + '\'' +
                ", remark='" + remark + '\'' +
                ", createTime=" + createTime +
                ", modifyTime=" + modifyTime +
                '}';
    }
}
