package com.pojo;

public class UserAddress {
    private Integer id;

    private Integer userId;

    private String address;

    private Boolean hasdelete;

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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public Boolean getHasdelete() {
        return hasdelete;
    }

    public void setHasdelete(Boolean hasdelete) {
        this.hasdelete = hasdelete;
    }
}