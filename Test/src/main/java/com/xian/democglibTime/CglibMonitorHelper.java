package com.xian.democglibTime;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;
import java.util.Date;

public class CglibMonitorHelper implements MethodInterceptor {
    public Object getProxy(Class<?> clzss) {
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(clzss);
        // 设置回调方法
        enhancer.setCallback(this);
        // 创建代理对象
        return enhancer.create();
    }


    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        //起始时间
        Date startDate = new Date();
        //调用方法
        Object object = methodProxy.invokeSuper(o,objects);
        //结束时间
        Date endDate = new Date();
        //耗时
        Long time = endDate.getTime()-startDate.getTime();
        System.out.println("耗时"+time+"秒");

        return object;
    }
}
