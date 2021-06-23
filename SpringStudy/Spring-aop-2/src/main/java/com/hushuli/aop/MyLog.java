package com.hushuli.aop;

public class MyLog {
    public void before(){
        System.out.println("执行方法开始");
    }
    public void after(){
        System.out.println("执行方法结束");
    }
}
