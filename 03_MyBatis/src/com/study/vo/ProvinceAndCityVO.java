package com.study.vo;

public class ProvinceAndCityVO {

    //所有的省份属性
    private Integer pid;
    private String pname;
    private String pjiancheng;
    private String pshenghui;

    //所有的城市属性
    private Integer cid;
    private String cname;


    public ProvinceAndCityVO() {
    }

    public ProvinceAndCityVO(Integer pid, String pname, String pjiancheng, String pshenghui, Integer cid, String cname) {
        this.pid = pid;
        this.pname = pname;
        this.pjiancheng = pjiancheng;
        this.pshenghui = pshenghui;
        this.cid = cid;
        this.cname = cname;
    }

    @Override
    public String toString() {
        return "ProvinceAndCityVO{" +
                "pid=" + pid +
                ", pname='" + pname + '\'' +
                ", pjiancheng='" + pjiancheng + '\'' +
                ", pshenghui='" + pshenghui + '\'' +
                ", cid=" + cid +
                ", cname='" + cname + '\'' +
                '}';
    }

    public Integer getPid() {
        return pid;
    }

    public String getPname() {
        return pname;
    }

    public String getPjiancheng() {
        return pjiancheng;
    }

    public String getPshenghui() {
        return pshenghui;
    }

    public Integer getCid() {
        return cid;
    }

    public String getCname() {
        return cname;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public void setPjiancheng(String pjiancheng) {
        this.pjiancheng = pjiancheng;
    }

    public void setPshenghui(String pshenghui) {
        this.pshenghui = pshenghui;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }
}
