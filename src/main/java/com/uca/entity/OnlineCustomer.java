package com.uca.entity;

import java.util.Date;

/**
 * @author puyijun
 * @ClassName OnlineCustomer
 * @date 2018-01-12
 * @time 15:24
 * @Description
 **/

public class OnlineCustomer {

    private Long customerId;

    private String inboundId;

    private Long userId;

    private String sessionId;

    private String remark;

    private Date createTime;

    private Date modifyTime;

    public Long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
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
        return "OnlineCustomer{" +
                "customerId=" + customerId +
                ", inboundId='" + inboundId + '\'' +
                ", userId=" + userId +
                ", sessionId='" + sessionId + '\'' +
                ", remark='" + remark + '\'' +
                ", createTime=" + createTime +
                ", modifyTime=" + modifyTime +
                '}';
    }
}
