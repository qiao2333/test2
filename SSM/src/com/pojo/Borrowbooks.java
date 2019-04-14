package com.pojo;

import java.util.Date;

public class Borrowbooks {
    private Long id;

    private Long bookno;

    private Long cardno;

    private Date bdate;

    private Date rdate;

    private Boolean cd;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getBookno() {
        return bookno;
    }

    public void setBookno(Long bookno) {
        this.bookno = bookno;
    }

    public Long getCardno() {
        return cardno;
    }

    public void setCardno(Long cardno) {
        this.cardno = cardno;
    }

    public Date getBdate() {
        return bdate;
    }

    public void setBdate(Date bdate) {
        this.bdate = bdate;
    }

    public Date getRdate() {
        return rdate;
    }

    public void setRdate(Date rdate) {
        this.rdate = rdate;
    }

    public Boolean getCd() {
        return cd;
    }

    public void setCd(Boolean cd) {
        this.cd = cd;
    }
}