package com.shengsiyuan.spring;

/**
 * @author huaishi
 */
public class Chinese implements Person
{
    @Override
    public void sayHello(String name) {
        System.out.println("你好：" + name);
    }

    @Override
    public void sayGoodbye(String name) {
        System.out.println("再见：" + name);
    }
}
