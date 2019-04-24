package com.xian.democglibTime;

public class UserDaoImpl {
    public void add() {
        System.out.println("新增用户信息");
        try {
            Thread.sleep(400);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void delete() {
        System.out.println("删除用户信息");
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
