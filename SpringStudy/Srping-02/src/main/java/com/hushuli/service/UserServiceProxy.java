package com.hushuli.service;

import com.hushuli.entity.User;

import java.util.List;

/**
 * 这是UserService的代理类
 * 静态代理
 *  实现类和代理类都继承了同一个接口
 *  好处：
 *      可以使真实角色的操作更加纯粹，不用关注一些公共的业务
 *      公共业务交给代理角色，实现了业务的分工
 *      公共业务发生扩展的时候，方便集中管理
 *  缺点：
 *      一个真实角色会产生一个代理角色，代码量会翻倍，开发效率变低
 */
public class UserServiceProxy implements UserService{

    UserService userService = new UserServiceImpl();

    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    @Override
    public List<User> findAll() {
        log("findAll");
        return userService.findAll();
    }

    @Override
    public void add() {
        log("add");
        userService.add();
    }

    @Override
    public void delete() {
        log("delete");
        userService.delete();
    }

    @Override
    public void update() {
        log("update");
        userService.update();
    }

    public void log(String msg){
        System.out.println("执行了" + msg + "方法");
    }
}
