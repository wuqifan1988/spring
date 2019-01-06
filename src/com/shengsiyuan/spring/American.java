package com.shengsiyuan.spring;

/**
 * @author huaishi
 */
public class American implements Person {
    @Override
    public void sayHello(String name) {
        System.out.println("hello: " + name);
    }

    @Override
    public void sayGoodbye(String name) {
        System.out.println("goodbye: " + name);
    }
}
