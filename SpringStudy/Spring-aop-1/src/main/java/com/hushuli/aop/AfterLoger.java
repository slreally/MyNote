package com.hushuli.aop;

import org.springframework.aop.AfterReturningAdvice;

import java.lang.reflect.Method;

public class AfterLoger implements AfterReturningAdvice {
    /**
     * 后置日志
     * @param returnVal     方法返回值
     * @param method        目标对象的方法
     * @param objects       方法的参数
     * @param target        目标对象
     * @throws Throwable
     */
    @Override
    public void afterReturning(Object returnVal, Method method, Object[] objects, Object target) throws Throwable {
        System.out.println(target.getClass().getName() + " 的 " + method.getName() + "执行结束，返回值是：" + returnVal);
    }
}
