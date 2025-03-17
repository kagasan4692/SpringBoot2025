package com.kagasan.spring;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ScopeTest {
    private static final Log log = LogFactory.getLog(ScopeTest.class);

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext2.xml");
        Dog meDog = context.getBean("dogBean", Dog.class);
        meDog.say();

        context.close();

    }
}
