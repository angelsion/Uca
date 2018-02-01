package com.uca.entity;

import java.io.Serializable;
import java.util.Date;

public class Resource implements Serializable {

    private Integer resourceid;

    private String resourcename;

    private String resourcepath;

    private Date resourcedate;

    private String resourcedesc;

    private Integer resourcetypeid;

    private Byte valid;

    private Date createtime;

    private Date modifytime;

    private Long modifier;

    private static final long serialVersionUID = 1L;

    public Integer getResourceid() {
        return resourceid;
    }

    public void setResourceid(Integer resourceid) {
        this.resourceid = resourceid;
    }

    public String getResourcename() {
        return resourcename;
    }

    public void setResourcename(String resourcename) {
        this.resourcename = resourcename;
    }

    public String getResourcepath() {
        return resourcepath;
    }

    public void setResourcepath(String resourcepath) {
        this.resourcepath = resourcepath;
    }

    public Date getResourcedate() {
        return resourcedate;
    }

    public void setResourcedate(Date resourcedate) {
        this.resourcedate = resourcedate;
    }

    public String getResourcedesc() {
        return resourcedesc;
    }

    public void setResourcedesc(String resourcedesc) {
        this.resourcedesc = resourcedesc;
    }

    public Integer getResourcetypeid() {
        return resourcetypeid;
    }

    public void setResourcetypeid(Integer resourcetypeid) {
        this.resourcetypeid = resourcetypeid;
    }

    public Byte getValid() {
        return valid;
    }

    public void setValid(Byte valid) {
        this.valid = valid;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public Date getModifytime() {
        return modifytime;
    }

    public void setModifytime(Date modifytime) {
        this.modifytime = modifytime;
    }

    public Long getModifier() {
        return modifier;
    }

    public void setModifier(Long modifier) {
        this.modifier = modifier;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        Resource other = (Resource) that;
        return (this.getResourceid() == null ? other.getResourceid() == null : this.getResourceid().equals(other.getResourceid()))
            && (this.getResourcename() == null ? other.getResourcename() == null : this.getResourcename().equals(other.getResourcename()))
            && (this.getResourcepath() == null ? other.getResourcepath() == null : this.getResourcepath().equals(other.getResourcepath()))
            && (this.getResourcedate() == null ? other.getResourcedate() == null : this.getResourcedate().equals(other.getResourcedate()))
            && (this.getResourcedesc() == null ? other.getResourcedesc() == null : this.getResourcedesc().equals(other.getResourcedesc()))
            && (this.getResourcetypeid() == null ? other.getResourcetypeid() == null : this.getResourcetypeid().equals(other.getResourcetypeid()))
            && (this.getValid() == null ? other.getValid() == null : this.getValid().equals(other.getValid()))
            && (this.getCreatetime() == null ? other.getCreatetime() == null : this.getCreatetime().equals(other.getCreatetime()))
            && (this.getModifytime() == null ? other.getModifytime() == null : this.getModifytime().equals(other.getModifytime()))
            && (this.getModifier() == null ? other.getModifier() == null : this.getModifier().equals(other.getModifier()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getResourceid() == null) ? 0 : getResourceid().hashCode());
        result = prime * result + ((getResourcename() == null) ? 0 : getResourcename().hashCode());
        result = prime * result + ((getResourcepath() == null) ? 0 : getResourcepath().hashCode());
        result = prime * result + ((getResourcedate() == null) ? 0 : getResourcedate().hashCode());
        result = prime * result + ((getResourcedesc() == null) ? 0 : getResourcedesc().hashCode());
        result = prime * result + ((getResourcetypeid() == null) ? 0 : getResourcetypeid().hashCode());
        result = prime * result + ((getValid() == null) ? 0 : getValid().hashCode());
        result = prime * result + ((getCreatetime() == null) ? 0 : getCreatetime().hashCode());
        result = prime * result + ((getModifytime() == null) ? 0 : getModifytime().hashCode());
        result = prime * result + ((getModifier() == null) ? 0 : getModifier().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", resourceid=").append(resourceid);
        sb.append(", resourcename=").append(resourcename);
        sb.append(", resourcepath=").append(resourcepath);
        sb.append(", resourcedate=").append(resourcedate);
        sb.append(", resourcedesc=").append(resourcedesc);
        sb.append(", resourcetypeid=").append(resourcetypeid);
        sb.append(", valid=").append(valid);
        sb.append(", createtime=").append(createtime);
        sb.append(", modifytime=").append(modifytime);
        sb.append(", modifier=").append(modifier);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}