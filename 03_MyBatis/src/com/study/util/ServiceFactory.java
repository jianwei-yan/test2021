package com.study.util;


/*
* 便于取得代理类对象
* */
public class ServiceFactory {


    //传递张三对象（目标对象），得到李四对象（代理对象）的过程

    public static Object getService(Object service){

        return new TransactionInvocationHandler(service).getProxy();

    }
}
