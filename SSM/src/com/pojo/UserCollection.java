package com.pojo;

import java.util.Date;

public class UserCollection {
    private Integer id;

    private Integer userId;

    private Integer lightId;

    private Boolean hasdelete;

    private Date collectionDate;

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

    public Boolean getHasdelete() {
        return hasdelete;
    }

    public void setHasdelete(Boolean hasdelete) {
        this.hasdelete = hasdelete;
    }

    public Date getCollectionDate() {
        return collectionDate;
    }

    public void setCollectionDate(Date collectionDate) {
        this.collectionDate = collectionDate;
    }
}