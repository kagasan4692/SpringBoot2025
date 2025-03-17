package com.kagasan.spring;

import org.springframework.stereotype.Component;

@Component("catBean")
public class Cat implements Pet{
    Cat(){
        System.out.println("Create Cat");
    }
    @Override
    public void say() {
        System.out.println("May-May");
    }
}
