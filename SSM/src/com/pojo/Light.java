package com.pojo;

import java.util.Date;

public class Light {
    private Integer id;

    private Integer lightType;

    private Integer lightBrand;

    private Integer lightStyle;

    private Integer lightStuff;

    private String lightColor;

    private Integer lightLocate;

    private Double lightPrice;

    private Integer lightQuantity;

    private String lightDescript;

    private String lightImage;

    private Boolean hasdelete;

    private Date createDate;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getLightType() {
        return lightType;
    }

    public void setLightType(Integer lightType) {
        this.lightType = lightType;
    }

    public Integer getLightBrand() {
        return lightBrand;
    }

    public void setLightBrand(Integer lightBrand) {
        this.lightBrand = lightBrand;
    }

    public Integer getLightStyle() {
        return lightStyle;
    }

    public void setLightStyle(Integer lightStyle) {
        this.lightStyle = lightStyle;
    }

    public Integer getLightStuff() {
        return lightStuff;
    }

    public void setLightStuff(Integer lightStuff) {
        this.lightStuff = lightStuff;
    }

    public String getLightColor() {
        return lightColor;
    }

    public void setLightColor(String lightColor) {
        this.lightColor = lightColor == null ? null : lightColor.trim();
    }

    public Integer getLightLocate() {
        return lightLocate;
    }

    public void setLightLocate(Integer lightLocate) {
        this.lightLocate = lightLocate;
    }

    public Double getLightPrice() {
        return lightPrice;
    }

    public void setLightPrice(Double lightPrice) {
        this.lightPrice = lightPrice;
    }

    public Integer getLightQuantity() {
        return lightQuantity;
    }

    public void setLightQuantity(Integer lightQuantity) {
        this.lightQuantity = lightQuantity;
    }

    public String getLightDescript() {
        return lightDescript;
    }

    public void setLightDescript(String lightDescript) {
        this.lightDescript = lightDescript == null ? null : lightDescript.trim();
    }

    public String getLightImage() {
        return lightImage;
    }

    public void setLightImage(String lightImage) {
        this.lightImage = lightImage == null ? null : lightImage.trim();
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