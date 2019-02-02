/*
 * Copyright (C) 2009-2018 Hangzhou 2Dfire Technology Co., Ltd. All rights reserved
 */
package com.shengsiyuan.spring6;

/**
 * PersonImpl
 *
 * @author huaishi
 * @since 2019-01-30
 */

public class PersonImpl implements Person {

    private String name;

    private String address;

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public void eat() {
        System.out.println(this.name + " 在吃饭");
    }

    @Override
    public void sleep() {
        System.out.println(this.name + " 在睡觉");
    }

    @Override
    public void study() {
        System.out.println(this.name + " 在" + this.address + "学习");
    }
}