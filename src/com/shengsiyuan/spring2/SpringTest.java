package com.shengsiyuan.spring2;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

/**
 * @author huaishi
 */
public class SpringTest {

    public static void main(String[] args) {
        ClassPathResource resource = new ClassPathResource("applicationContext.xml");
        XmlBeanFactory factory = new XmlBeanFactory(resource);

        Person chinese = (Person) factory.getBean("chinese");
        chinese.sayHello("zhangsan");
        chinese.sayGoodbye("zhangsan");

        chinese.work();

        Person american = (Person) factory.getBean("american");
        american.work();
    }
}
