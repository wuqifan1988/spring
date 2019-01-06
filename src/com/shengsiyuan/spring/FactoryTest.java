package com.shengsiyuan.spring;

/**
 * @author huaishi
 */
public class FactoryTest {

    public static void main(String[] args) {
        Person person = PersonFactory.getPerson("chinese");
        person.sayHello("zhangsan");
        person.sayGoodbye("zhangsan");

        person = PersonFactory.getPerson("american");
        person.sayHello("zhangsan");
        person.sayGoodbye("zhangsan");
    }

}
