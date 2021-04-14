package com.study.service;

import com.study.domain.Province;

import java.util.List;

public interface ProvinceService {
    //根据ID查询一条数据
    public Province getById(Integer id);

    //添加一条数据
    public void save(Province province);

    List<Province> getAll();

    List<Province> selectlike(String s);
}
