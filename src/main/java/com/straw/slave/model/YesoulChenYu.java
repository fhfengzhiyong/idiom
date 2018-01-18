package com.straw.slave.model;

public class YesoulChenYu {
    private String id;

    private String context;

    private String pingYin;

    private String shiYi;

    private String chuChu;

    private String liZi;

    private String spingYin;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getContext() {
        return context;
    }

    public void setContext(String context) {
        this.context = context == null ? null : context.trim();
    }

    public String getPingYin() {
        return pingYin;
    }

    public void setPingYin(String pingYin) {
        this.pingYin = pingYin == null ? null : pingYin.trim();
    }

    public String getShiYi() {
        return shiYi;
    }

    public void setShiYi(String shiYi) {
        this.shiYi = shiYi == null ? null : shiYi.trim();
    }

    public String getChuChu() {
        return chuChu;
    }

    public void setChuChu(String chuChu) {
        this.chuChu = chuChu == null ? null : chuChu.trim();
    }

    public String getLiZi() {
        return liZi;
    }

    public void setLiZi(String liZi) {
        this.liZi = liZi == null ? null : liZi.trim();
    }

    public String getSpingYin() {
        return spingYin;
    }

    public void setSpingYin(String spingYin) {
        this.spingYin = spingYin == null ? null : spingYin.trim();
    }
}