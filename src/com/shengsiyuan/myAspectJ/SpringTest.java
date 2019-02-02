/*
 * Copyright (C) 2009-2018 Hangzhou 2Dfire Technology Co., Ltd. All rights reserved
 */
package com.shengsiyuan.myAspectJ;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * SpringTest
 *
 * @author huaishi
 * @since 2019-02-02
 */

public class SpringTest {
    public static void main(String[] args) {
        ApplicationContext context = new FileSystemXmlApplicationContext("src/com/shengsiyuan/myAspectJ/applicationContext.xml");

        Person person = (Person) context.getBean("person");

        person.execute();
    }
}