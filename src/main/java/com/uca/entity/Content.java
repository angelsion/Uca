package com.uca.entity;

import java.io.Serializable;

/**
 * @author puyijun
 * @ClassName Content
 * @date 2018-01-11
 * @time 17:30
 * @Description 聊天记录
 **/

public class Content implements Serializable{
    private static final long serialVersionUID = 9050245881031124425L;
    private Integer contentId;

    private String contentName;

    private String content;

    private String createTime;

    public Content() {
    }

    public Content(Integer contentId, String contentName, String content) {
        this.contentId = contentId;
        this.contentName = contentName;
        this.content = content;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Integer getContentId() {
        return contentId;
    }

    public void setContentId(Integer contentId) {
        this.contentId = contentId;
    }

    public String getContentName() {
        return contentName;
    }

    public void setContentName(String contentName) {
        this.contentName = contentName;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "Content{" +
                "contentId=" + contentId +
                ", contentName='" + contentName + '\'' +
                ", content='" + content + '\'' +
                ", createTime='" + createTime + '\'' +
                '}';
    }
}