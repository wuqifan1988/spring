/*
 * Copyright (C) 2009-2018 Hangzhou 2Dfire Technology Co., Ltd. All rights reserved
 */
package com.shengsiyuan.spring6;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;
import java.util.Arrays;

/**
 * MyMethodBeforeAdvice
 *
 * @author huaishi
 * @since 2019-01-30
 */

public class MyMethodBeforeAdvice implements MethodBeforeAdvice{

    @Override
    public void before(Method method, Object[] objects, Object o) throws Throwable {
        System.out.println("进入到before方法");

        System.out.println("执行的方法是" + method);

        System.out.println("方法的参数是" + Arrays.toString(objects));

        System.out.println("目标对象是" + o);


    }
}