package com.xian.democglibTime;

public class CglibProxyDemo {
    public static void main(String[] agrs){
       CglibMonitorHelper cglibMonitorHelper = new CglibMonitorHelper();
       UserDaoImpl userDao = (UserDaoImpl) cglibMonitorHelper.getProxy(UserDaoImpl.class);
       userDao.add();
       userDao.delete();
    }
}
