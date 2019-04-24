package com.xian.demojdkTime;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.Date;

public class MonitorHelper implements InvocationHandler {
    Object object;

    public MonitorHelper(Object object){
        this.object=object;
    }


    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
       //起始时间
        Date startDate = new Date();
        //调用方法
        Object obj = method.invoke(object,args);
        //结束时间
        Date endDate = new Date();
        //耗时
        Long time = endDate.getTime()-startDate.getTime();
        System.out.println("耗时"+time+"秒");
        return obj;
    }
}
