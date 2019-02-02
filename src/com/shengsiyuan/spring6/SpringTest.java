/*
 * Copyright (C) 2009-2018 Hangzhou 2Dfire Technology Co., Ltd. All rights reserved
 */
package com.shengsiyuan.spring6;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

/**
 * SpringTest
 *
 * @author huaishi
 * @since 2019-01-30
 */

public class SpringTest {
    public static void main(String[] args) {
        XmlBeanFactory factory = new XmlBeanFactory(new ClassPathResource("applicationContext.xml"));
        Person person = (Person) factory.getBean("person");

        person.study();
    }
}