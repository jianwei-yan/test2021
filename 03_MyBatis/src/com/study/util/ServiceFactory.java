package com.study.util;


/*
* 便于取得代理类对象
* */
public class ServiceFactory {


    //传递工厂对象（目标对象），得到淘宝对象（代理对象）的过程

    public static Object getService(Object service){

        return new TransactionInvocationHandler(service).getProxy();

    }
}
