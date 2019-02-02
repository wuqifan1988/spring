/*
 * Copyright (C) 2009-2018 Hangzhou 2Dfire Technology Co., Ltd. All rights reserved
 */
package com.shengsiyuan.spring6;

import org.springframework.aop.AfterReturningAdvice;

import java.lang.reflect.Method;
import java.util.Arrays;

/**
 * MyAfterReturningAdvice
 *
 * @author huaishi
 * @since 2019-01-30
 */

public class MyAfterReturningAdvice implements AfterReturningAdvice {

    @Override
    public void afterReturning(Object returnValue, Method method, Object[] args, Object target) throws Throwable {
        System.out.println("方法调用结束");
        System.out.println("返回值:" + returnValue);
        System.out.println("目标方法:" + method);
        System.out.println("目标方法参数:" + Arrays.toString(args));
        System.out.println("目标对象:" + target);
    }
}