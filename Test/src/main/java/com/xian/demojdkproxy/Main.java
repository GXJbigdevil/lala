package com.xian.demojdkproxy;

import java.lang.reflect.Proxy;

public class Main {
    public static void main(String[] args){
        Task task  = new Person();
        Helper helper = new Helper(task);
        Task supertask = (Task) Proxy.newProxyInstance(task.getClass().getClassLoader(),task.getClass().getInterfaces(),helper);
        supertask.add();
    }
}
