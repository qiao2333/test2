package com.pojo;

import java.util.Date;

public class UserComments {
    private Integer id;

    private Integer userId;

    private Integer lightId;

    private String comments;

    private Boolean hasdelete;

    private Date createDate;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getLightId() {
        return lightId;
    }

    public void setLightId(Integer lightId) {
        this.lightId = lightId;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments == null ? null : comments.trim();
    }

    public Boolean getHasdelete() {
        return hasdelete;
    }

    public void setHasdelete(Boolean hasdelete) {
        this.hasdelete = hasdelete;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }
}