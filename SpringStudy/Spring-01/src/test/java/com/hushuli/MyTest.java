package com.hushuli;

import com.hushuli.entity.People;
import com.hushuli.entity.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {

    @Test
    public void test(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        User user = (User) context.getBean("User");
        User user1 = (User) context.getBean("User");
        System.out.println(user == user1);
        System.out.println(user);

        User user2 = new User();
        User user3 = new User();
        System.out.println(user2 == user3);
    }

    @Test
    public void test2(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        People people = (People) context.getBean("people3");
        people.getCat().shut();
        people.getDog().shut();
    }
}
