package com.xian.springaopdemo.transaction;

import org.aspectj.lang.ProceedingJoinPoint;

public class TransDemo {
    public void begin(){
        System.out.println("前置处理");
    }
    public void end(){
        System.out.println("后置处理");
    }
    public void around(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("环绕开始");
        joinPoint.proceed();
        System.out.println("环绕处理");
    }
    public void throwExption() throws Exception {
        throw new Exception("制造一个异常");
    }
}
