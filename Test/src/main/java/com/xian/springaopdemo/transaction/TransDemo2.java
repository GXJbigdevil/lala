package com.xian.springaopdemo.transaction;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class TransDemo2 {
    @Pointcut(value = "execution(* com.xian.springaopdemo.*.*.*(..))")
    public void point(){

    }
    @Before(value = "point()")
    public void before(){
        System.out.println("事物提交之前");
    }
    @AfterReturning(value = "point()")
    public void after(){
        System.out.println("事物提交之后");
    }

    public void around(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("环绕开始");
        joinPoint.proceed();
        System.out.println("环绕结束");
    }

}
