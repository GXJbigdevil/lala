package com.xian.demojdkproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class Helper implements InvocationHandler {
   private  Object target;

   public Helper(Object target){
       this.target=target;
   }
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
       System.out.println("帮吗送花");
       //调用方法
       Object result = method.invoke(target,args);
       System.out.println("帮吗123");
       return result;
    }
}
