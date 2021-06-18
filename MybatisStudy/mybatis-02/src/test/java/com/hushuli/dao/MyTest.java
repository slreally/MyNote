package com.hushuli.dao;

import com.hushuli.entity.User;
import com.hushuli.utils.MybatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.*;
import java.util.stream.Collectors;


public class MyTest {

    @Test
    public void test1(){
        SqlSession session = MybatisUtil.getSqlSession();
        UserMapper userMapper = session.getMapper(UserMapper.class);
        List<User> userList = userMapper.findAll();
        System.out.println(userList);
    }
    @Test
    public void test2(){
        SqlSession session = MybatisUtil.getSqlSession();
        UserMapper userMapper = session.getMapper(UserMapper.class);
        User user = userMapper.findById(1);
        System.out.println(user);
    }
    @Test
    public void test3(){
        SqlSession session = MybatisUtil.getSqlSession();
        UserMapper userMapper = session.getMapper(UserMapper.class);
        int k = userMapper.insert(new User(1,"lisi","ddddd",12));
        session.commit();
        System.out.println(k);
    }
    //分页
    @Test
    public void test4(){
        SqlSession session = MybatisUtil.getSqlSession();
        UserMapper userMapper = session.getMapper(UserMapper.class);
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        map.put("startIndex", 1);
        map.put("pageSize", 2);
        List<User> userList = userMapper.findLimit(map);
        for (User user : userList) {
            System.out.println(user);
        }
    }

    @Test
    public void test5(){
        int[] nums = {2,7,11,15};
        Arrays.stream(nums).asLongStream().forEach(System.out::println);
        //throw new IllegalArgumentException("没有");
        List<String> list = Arrays.asList("a1", "a2", "b3", "b4", "c5", "c6");
        list
                .stream()
                .filter(s -> s.startsWith("a"))
                .sorted()
                .forEach(System.out::println);

        Person person1 = new Person("zhangsan", 11, "man");
        Person person2 = new Person("lisi", 17, "man");
        Person person3 = new Person("wangwu", 14, "man");
        Person person4 = new Person("daqiao", 19, "woman");
        Person person5 = new Person("zhouyu", 20, "man");
        Person person6 = new Person("xiaoqiao", 9, "woman");
        List<Person> people = new ArrayList<>();
        people.add(person1);
        people.add(person2);
        people.add(person3);
        people.add(person4);
        people.add(person5);
        people.add(person6);
        for (Person person : people) {
            System.out.println(person);
        }

        List<String> collect = people
                .stream()
                .filter(person -> "man".equals(person.getSex()))
                .sorted((p1, p2) -> p2.getAge() - p1.getAge())
                .limit(3)
                .map(person -> person.getName())
                .collect(Collectors.toList());
        for (String s : collect) {
            System.out.println(s);
        }
        System.out.println("=======================");
    }
    @Test
    public void test6(){
        HashMap map = new HashMap<>();
        //map.put("name", "曹贼");
        //map.put("password", "123");
        map.put("age", 12);
        SqlSession session = MybatisUtil.getSqlSession();
        UserMapper userMapper = session.getMapper(UserMapper.class);
        List<User> users = userMapper.findDynamic(map);
        users.forEach(System.out::println);
        session.close();
    }

    @Test
    public void test7(){
        SqlSession session = MybatisUtil.getSqlSession();
        UserMapper userMapper = session.getMapper(UserMapper.class);
        User user = userMapper.findResultMap(1);
        System.out.println(user);
        session.close();
    }
}
