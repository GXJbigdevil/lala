package com.xian.demojdkTime;

import java.lang.reflect.Proxy;

public class DaoProxyDemo {
    public static void main(String[] args){
        //创建业务类，此时它没有被代理
        UserDao userDaoImpl = new UserDaoImpl();
        //创建检控类
        MonitorHelper helper = new MonitorHelper(userDaoImpl);
        //通过JDK动态代理，将业务类和检控类绑定在一起              类加载器
        UserDao userDao =(UserDao) Proxy.newProxyInstance(userDaoImpl.getClass().getClassLoader(),userDaoImpl.getClass().getInterfaces(),helper);
        userDao.add();
        userDao.delete();
    }
}
