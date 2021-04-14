package com.study.service.impl;

import com.study.dao.ProvinceDao;
import com.study.domain.Province;
import com.study.service.ProvinceService;
import com.study.util.SqlSessionUtil;

import java.util.List;

public class ProvinceServiceImpl implements ProvinceService {

    private ProvinceDao provinceDao = SqlSessionUtil.getSession().getMapper(ProvinceDao.class);

    @Override
    public Province getById(Integer id) {

        Province p = provinceDao.getById(id);
        return p;
    }

    @Override
    public void save(Province province) {

        provinceDao.save(province);
    }

    @Override
    public List<Province> getAll() {

        List<Province> slist = provinceDao.getAll();
        return slist;
    }

    @Override
    public List<Province> selectlike(String s) {
        List<Province> slist = provinceDao.selectlike(s);
        return slist;
    }
}
