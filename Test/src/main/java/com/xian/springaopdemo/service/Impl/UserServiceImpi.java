package com.xian.springaopdemo.service.Impl;

import com.alibaba.druid.filter.AutoLoad;
import com.xian.springaopdemo.dao.Impl.UserDaoImpl;
import com.xian.springaopdemo.dao.UserDao;
import com.xian.springaopdemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserServiceImpi implements UserService {
@Autowired
    UserDao userDao ;
    public void addUser() {
        userDao.addUser();
    }

    public void deleteUser() {
        userDao.deleteUser();
    }

    public void updateUser() {
        userDao.updateUser();
    }

    public void selectUser() {
        userDao.selectUser();
    }
}
