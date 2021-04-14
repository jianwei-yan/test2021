package com.study.domain;

public class City {
    private Integer id;
    private String name;
    private Integer provinceId;

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Integer getProvinceId() {
        return provinceId;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setProvinceId(Integer provinceId) {
        this.provinceId = provinceId;
    }

    public City() {
    }

    public City(Integer id, String name, Integer provinceId) {
        this.id = id;
        this.name = name;
        this.provinceId = provinceId;
    }

    @Override
    public String toString() {
        return "City{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", provinceId=" + provinceId +
                '}';
    }
}
