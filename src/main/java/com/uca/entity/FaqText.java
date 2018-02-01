package com.uca.entity;

import java.util.Date;

/**
 * @author puyijun
 * @ClassName FaqText
 * @date 2018-01-24
 * @time 10:51
 * @Description 帮助中心富文本
 **/

public class FaqText {
    //富文本id
    private Integer richTextId;
    //富文本描述信息
    private String textDesc;
    //富文本内容
    private String textContent;
    //问题id
    private Integer faqId;
    //帮助分类id
    private Integer faqTypeId;
    private Integer valid;
    private Date createTime;
    private Date modifyTime;
    private Long modifier;

    public Integer getFaqId() {
        return faqId;
    }

    public void setFaqId(Integer faqId) {
        this.faqId = faqId;
    }

    public Integer getRichTextId() {
        return richTextId;
    }

    public void setRichTextId(Integer richTextId) {
        this.richTextId = richTextId;
    }

    public String getTextDesc() {
        return textDesc;
    }

    public void setTextDesc(String textDesc) {
        this.textDesc = textDesc;
    }

    public String getTextContent() {
        return textContent;
    }

    public void setTextContent(String textContent) {
        this.textContent = textContent;
    }

    public Integer getFaqTypeId() {
        return faqTypeId;
    }

    public void setFaqTypeId(Integer faqTypeId) {
        this.faqTypeId = faqTypeId;
    }

    public Integer getValid() {
        return valid;
    }

    public void setValid(Integer valid) {
        this.valid = valid;
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
        return "FaqText{" +
                "richTextId=" + richTextId +
                ", textDesc='" + textDesc + '\'' +
                ", textContent='" + textContent + '\'' +
                ", faqId=" + faqId +
                ", faqTypeId=" + faqTypeId +
                ", valid=" + valid +
                ", createTime=" + createTime +
                ", modifyTime=" + modifyTime +
                ", modifier=" + modifier +
                '}';
    }
}
