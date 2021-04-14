package com.study.test;

import com.study.dao.ProvinceDao;
import com.study.domain.Province;
import com.study.service.ProvinceService;
import com.study.service.impl.ProvinceServiceImpl;
import com.study.util.ServiceFactory;
import com.study.util.SqlSessionUtil;
import com.study.vo.ProvinceAndCityVO;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Test001 {
    public static void main(String[] args) {

        //使用动态代理
        //创建业务层对象（目标对象:new ProvinceServiceImpl());
        //通过动态代理处理业务（ps:代理对象）
        ProvinceService ps = (ProvinceService)ServiceFactory.getService(new ProvinceServiceImpl());


        //添加测试
        /*Province p = new Province(10,"测试","测","添加测试");
        ps.save(p);*/

        //查询测试
        /*Province province = ps.getById(10);
        System.out.println(province);
*/
        //查询所有的记录
        /*List<Province> provinceList = ps.getAll();
        for( Province province1 : provinceList){
            System.out.println(province1);
        }*/


        //不使用动态代理
        ProvinceDao provinceDao = SqlSessionUtil.getSession().getMapper(ProvinceDao.class);

        //测试模糊查询
        /*List<Province> plist = provinceDao.selectlike("西");
        for (Province province:plist){
            System.out.println(province);
        }*/

        //测试多表联查1：查询出城市名称和省份名称
        /*List<Map<String,Object>> mapList = provinceDao.select1();
        for (Map<String,Object> map : mapList){
            //遍历出每一条记录对应的map集合
            Set<String> keys = map.keySet();
            for (String key : keys){
                System.out.println("key:"+key);
                System.out.println("value:"+map.get(key));
            }
            System.out.println("-------------");
        }*/

        //测试多表联查2：查询出城市和省份所有信息，加VO
       /* List<ProvinceAndCityVO> voList = provinceDao.select2();
        for (ProvinceAndCityVO pvo : voList){
            System.out.println(pvo);
        }*/


        //测试多表联查3：查询出带有“市”字的城市和省份的所有信息
        List<ProvinceAndCityVO> voList = provinceDao.select3("市");
        for (ProvinceAndCityVO pvo : voList){
            System.out.println(pvo);
        }


    }
}
