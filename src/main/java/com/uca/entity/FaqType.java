package com.uca.entity;

import java.util.Date;
import java.util.List;

/**
 * @author puyijun
 * @ClassName FaqType
 * @date 2018-01-23
 * @time 17:22
 * @Description
 **/

public class FaqType {
    private Integer id;
    private String typeName;
    private Integer level;
    private Integer parentId;
    private Date createTime;
    private Date modifyTime;
    private Long modifier;
    private List<FaqType> faqTypeTwo;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
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

    public List<FaqType> getFaqTypeTwo() {
        return faqTypeTwo;
    }

    public void setFaqTypeTwo(List<FaqType> faqTypeTwo) {
        this.faqTypeTwo = faqTypeTwo;
    }

    @Override
    public String toString() {
        return "FaqType{" +
                "id=" + id +
                ", typeName='" + typeName + '\'' +
                ", level=" + level +
                ", parentId=" + parentId +
                ", createTime=" + createTime +
                ", modifyTime=" + modifyTime +
                ", modifier=" + modifier +
                '}';
    }
}
