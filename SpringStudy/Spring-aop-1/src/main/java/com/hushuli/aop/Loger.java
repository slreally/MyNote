package com.hushuli.aop;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

public class Loger implements MethodBeforeAdvice {
    /**
     * 前置
     * @param method    目标对象的方法
     * @param objects   方法的参数
     * @param target    目标对象
     * @throws Throwable
     */
    @Override
    public void before(Method method, Object[] objects, Object target) throws Throwable {
        System.out.println(target.getClass().getName() + "的" + method.getName() + "方法执行开始");
    }
}
