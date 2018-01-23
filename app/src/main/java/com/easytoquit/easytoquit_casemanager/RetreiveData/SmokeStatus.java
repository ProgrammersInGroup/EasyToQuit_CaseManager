package com.easytoquit.easytoquit_casemanager.RetreiveData;

/**
 * Created by Polaris0712 on 13/01/2018.
 */

public class SmokeStatus {
    private String smokeage ;
    private String smokehowmuchday ;
    private String smokehowmuchweek;
    private String smokequitday;
    private String smokemoney;
    public SmokeStatus() {
    }
    public SmokeStatus(String smokeage, String smokehowmuchday,String smokehowmuchweek,String smokequitday,String smokemoney) {
        this.smokeage = smokeage;
        this.smokehowmuchday = smokehowmuchday;
        this.smokehowmuchweek=smokehowmuchweek;
        this.smokequitday=smokequitday;
        this.smokemoney=smokemoney;
    }
    public String getsmokeage() {
        return smokeage;
    }
    public void setsmokeage(String smokeage) {
        this.smokeage = smokeage;
    }
    public String getsmokehowmuchday() {
        return smokehowmuchday;
    }
    public void setsmokehowmuchday(String smokehowmuchday) {
        this.smokehowmuchday = smokehowmuchday;
    }
    public String getsmokehowmuchweek() {
        return smokehowmuchweek;
    }
    public void setsmokehowmuchweek(String smokehowmuchweek) {
        this.smokehowmuchweek = smokehowmuchweek;
    }
    public String getsmokequitday() {
        return smokequitday;
    }
    public void setsmokequitday(String smokequitday) {
        this.smokequitday = smokequitday;
    }
    public String getsmokemoney() {
        return smokemoney;
    }
    public void setsmokemoney(String smokemoney) {
        this.smokemoney = smokemoney;
    }
}
