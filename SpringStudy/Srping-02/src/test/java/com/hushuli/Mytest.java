package com.hushuli;

import com.hushuli.entity.User;
import com.hushuli.service.UserService;
import com.hushuli.service.UserServiceImpl;
import com.hushuli.service.UserServiceProxy;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.bind.annotation.RequestMapping;

public class Mytest {

    @Test
    public void test(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        User user = (User) context.getBean("user");
        System.out.println(user);
    }

    @Test
    public void test1(){
        UserService userService = new UserServiceImpl();
        UserServiceProxy proxy = new UserServiceProxy();
        proxy.setUserService(userService);
        proxy.findAll();
        proxy.delete();
    }
}
