package com.hushuli.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class MyLog {
    @Before("execution(* com.hushuli.service.UserServiceImpl.*(..))")
    public void before(){
        System.out.println("====方法执行开始====");
    }

    @After("execution(* com.hushuli.service.UserServiceImpl.*(..))")
    public void after(){
        System.out.println("====方法执行结束====");
    }

    @Around("execution(* com.hushuli.service.UserServiceImpl.*(..))")
    public void around(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("=========环绕执行开始========");
        System.out.println(joinPoint.getSignature());
        Object proceed = joinPoint.proceed();
        System.out.println("=========环绕执行结束========");
        System.out.println(proceed);
    }
}
