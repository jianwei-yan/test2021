package com.study.util;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

/*
类似于之前的DBUtil，操作数据库
* */
public class SqlSessionUtil {

    /*构造方法私有化：防止创建对象来调用方法*/
    private SqlSessionUtil(){
    }

    //公用的sqlSessionFactory，用来创建SqlSession对象session
    private static SqlSessionFactory sqlSessionFactory;
    static {
        //连接主配置文件
        String resource = "mybatis-config.xml";
        //创建输入流
        InputStream inputStream = null;
        try {
            inputStream = Resources.getResourceAsStream(resource);
        } catch (IOException e) {
            e.printStackTrace();
        }

        //创建sqlSessionFactory，用于创建sqlSession对象
        sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

    }


    //保证使用的是同一个Sqlsession对象session，便于事务操作
    //如果存在直接取用，如果不存在创建一个
    private static ThreadLocal<SqlSession> t = new ThreadLocal<>();

    //取得SqlSession对象
    public static SqlSession getSession(){
        SqlSession session = t.get();
        if(session == null){
            session = sqlSessionFactory.openSession();
            t.set(session);
        }
        return session;
    }

    //关闭SqlSession对象
    public static void myClose(SqlSession session){
        if(session != null){
            session.close();

            //将ThreadLocal中保存的Sqlsession对象剥离掉
            t.remove();
        }
    }
}
