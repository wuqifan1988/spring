/*
 * Copyright (C) 2009-2018 Hangzhou 2Dfire Technology Co., Ltd. All rights reserved
 */
package com.shengsiyuan.myAspectJ;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;

/**
 * MyAspectJ
 *
 * @author huaishijar
 * @since 2019-02-02
 */

@Aspect
public class MyAspectJ {


    @Pointcut("execution(public * *(..)) && target(com.shengsiyuan.myAspectJ.Person)")
    public void pointcut() {

    }

    @Before("pointcut()")
    public void beforeExecute(JoinPoint joinPoint) {
        System.out.println("before execute");

    }

    @Around("pointcut()")
    public Object myOperation(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {

        return proceedingJoinPoint.proceed();
    }

    @After("pointcut()")
    public void afterExecute(JoinPoint joinPoint){
        System.out.println("after execute ");
    }

}