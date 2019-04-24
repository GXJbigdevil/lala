package com.xian.springaopdemo.dao.Impl;

import com.xian.springaopdemo.dao.UserDao;
import org.springframework.stereotype.Component;
//声明被Spring容器托管，@Component
@Component
public class UserDaoImpl implements UserDao {

    public void addUser() {
        System.out.println("添加用户");
    }

    public void deleteUser() {
        System.out.println("删除用户");
    }

    public void updateUser() {
        System.out.println("修改用户");
    }

    public void selectUser() {
        System.out.println("查询用户");
    }
}
