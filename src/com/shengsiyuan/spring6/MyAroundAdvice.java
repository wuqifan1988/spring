/*
 * Copyright (C) 2009-2018 Hangzhou 2Dfire Technology Co., Ltd. All rights reserved
 */
package com.shengsiyuan.spring6;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

/**
 * MyAroundAdvice
 *
 * @author huaishi
 * @since 2019-01-30
 */

public class MyAroundAdvice  implements MethodInterceptor{

    @Override
    public Object invoke(MethodInvocation invocation) throws Throwable {
        System.out.println("进入到invoke方法" + invocation);
        Object object = invocation.proceed();
        System.out.println("invoke方法执行完毕");

        return object;
    }
}