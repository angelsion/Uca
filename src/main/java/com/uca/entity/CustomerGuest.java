package com.uca.entity;

import java.util.Date;

/**
 * @author puyijun
 * @ClassName CustomerGuest
 * @date 2018-01-12
 * @time 16:11
 * @Description
 **/

public class CustomerGuest {

    private Long customerGuestId;
    private String cInboundId;
    private String gInboundId;
    private Long customerId;
    private Long userId;
    private Date createTime;
    private Date modifyTime;

    public Long getCustomerGuestId() {
        return customerGuestId;
    }

    public void setCustomerGuestId(Long customerGuestId) {
        this.customerGuestId = customerGuestId;
    }

    public String getcInboundId() {
        return cInboundId;
    }

    public void setcInboundId(String cInboundId) {
        this.cInboundId = cInboundId;
    }

    public String getgInboundId() {
        return gInboundId;
    }

    public void setgInboundId(String gInboundId) {
        this.gInboundId = gInboundId;
    }

    public Long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
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
        return "CustomerGuest{" +
                "customerGuestId=" + customerGuestId +
                ", cInboundId='" + cInboundId + '\'' +
                ", gInboundId='" + gInboundId + '\'' +
                ", customerId=" + customerId +
                ", userId=" + userId +
                ", createTime=" + createTime +
                ", modifyTime=" + modifyTime +
                '}';
    }
}
