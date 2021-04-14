package com.study.domain;

public class Province {
    private Integer id;
    private String name;
    private String jiancheng;
    private String shenghui;

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getJiancheng() {
        return jiancheng;
    }

    public String getShenghui() {
        return shenghui;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setJiancheng(String jiancheng) {
        this.jiancheng = jiancheng;
    }

    public void setShenghui(String shenghui) {
        this.shenghui = shenghui;
    }

    public Province() {
    }

    public Province(Integer id, String name, String jiancheng, String shenghui) {
        this.id = id;
        this.name = name;
        this.jiancheng = jiancheng;
        this.shenghui = shenghui;
    }

    @Override
    public String toString() {
        return "Province{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", jiancheng='" + jiancheng + '\'' +
                ", shenghui='" + shenghui + '\'' +
                '}';
    }
}
