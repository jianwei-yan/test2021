package com.study.util;

import org.apache.ibatis.session.SqlSession;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/*
动态代理(需要背下来)：以Spring的形式面试，Spring底层
* */
public class TransactionInvocationHandler implements InvocationHandler {

    //目标对象
    private Object target;
    //动态代理：目标对象是不固定的，传入参数的是谁，就给谁创建代理
    public TransactionInvocationHandler(Object target){
        this.target=target;
    }


    //代理类的业务方法(调用目标方法：连接数据库  功能增强：事务)
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        SqlSession session = null;
        Object obj = null;

        try{

            session = SqlSessionUtil.getSession();

            //处理真正业务层的业务逻辑（调用目标方法）
            obj = method.invoke(target,args);
            //处理业务逻辑后，提交事务 (功能增强)
            session.commit();

        } catch (Exception e){
            //处理业务逻辑的时候出现问题，回滚事务
            session.rollback();
            e.printStackTrace();
        } finally{
            SqlSessionUtil.myClose(session);
        }
        return obj;
    }


    //取得代理类对象
    public Object getProxy(){
        return Proxy.newProxyInstance(target.getClass().getClassLoader(),target.getClass().getInterfaces(),this);
    }
}
