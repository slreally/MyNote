package com.hushuli.service;

public class UserServiceImpl implements UserService{
    @Override
    public void add() {
        System.out.println("执行了add方法");
    }

    @Override
    public void delete() {
        System.out.println("执行了delete方法");
    }

    @Override
    public void update() {
        System.out.println("执行了update方法");
    }

    @Override
    public void find() {
        System.out.println("执行了find方法");
    }
}
