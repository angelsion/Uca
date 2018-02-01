package com.uca.entity;

import java.util.Date;

/**
 * @author puyijun
 * @ClassName Faq
 * @date 2018-01-24
 * @time 11:43
 * @Description 问题
 **/

public class Faq {
    private Integer id;
    private String issue;
    private Integer faqTypeId;
    private Date createTime;
    private Date modifyTime;
    private Long modifier;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getIssue() {
        return issue;
    }

    public void setIssue(String issue) {
        this.issue = issue;
    }

    public Integer getFaqTypeId() {
        return faqTypeId;
    }

    public void setFaqTypeId(Integer faqTypeId) {
        this.faqTypeId = faqTypeId;
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

    public Long getModifier() {
        return modifier;
    }

    public void setModifier(Long modifier) {
        this.modifier = modifier;
    }

    @Override
    public String toString() {
        return "Faq{" +
                "id=" + id +
                ", issue='" + issue + '\'' +
                ", faqTypeId=" + faqTypeId +
                ", createTime=" + createTime +
                ", modifyTime=" + modifyTime +
                ", modifier=" + modifier +
                '}';
    }
}
