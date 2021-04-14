package com.study.dao;

import com.study.domain.Province;
import com.study.vo.ProvinceAndCityVO;

import java.util.List;
import java.util.Map;

public interface ProvinceDao {

    //根据ID查询一条数据
    public Province getById(Integer id);

    //添加一条数据
    public void save(Province province);

    List<Province> getAll();

    List<Province> selectlike(String z);

    List<Map<String, Object>> select1();

    List<ProvinceAndCityVO> select2();

    List<ProvinceAndCityVO> select3(String name);
}
