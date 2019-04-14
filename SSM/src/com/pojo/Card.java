package com.pojo;

import java.util.Date;

public class Card {
    private Long cardno;

    private String cardname;

    private Integer borrownumber;

    private Date adate;

    private String phone;

    private String mail;

    public Long getCardno() {
        return cardno;
    }

    public void setCardno(Long cardno) {
        this.cardno = cardno;
    }

    public String getCardname() {
        return cardname;
    }

    public void setCardname(String cardname) {
        this.cardname = cardname == null ? null : cardname.trim();
    }

    public Integer getBorrownumber() {
        return borrownumber;
    }

    public void setBorrownumber(Integer borrownumber) {
        this.borrownumber = borrownumber;
    }

    public Date getAdate() {
        return adate;
    }

    public void setAdate(Date adate) {
        this.adate = adate;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail == null ? null : mail.trim();
    }
}