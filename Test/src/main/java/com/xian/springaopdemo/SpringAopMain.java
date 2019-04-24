package com.xian.springaopdemo;

import com.xian.springaopdemo.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringAopMain {
    public static void main(String[] agrs) {
       ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-ioc.xml");
        UserService userService = applicationContext.getBean(UserService.class);
        userService.addUser();
    }
}
