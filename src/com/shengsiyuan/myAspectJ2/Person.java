/*
 * Copyright (C) 2009-2018 Hangzhou 2Dfire Technology Co., Ltd. All rights reserved
 */
package com.shengsiyuan.myAspectJ2;

/**
 * Person
 *
 * @author huaishi
 * @since 2019-02-02
 */

public class Person {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void execute(){
        System.out.println("hello: " + this.getName());
    }
}