package com.kagasan.spring;

import org.springframework.context.annotation.*;

@Configuration
@PropertySource("classpath:myApp.properties")
public class MyConfig {
    @Bean
    @Scope("singleton")
    public Pet catBean() {
        System.out.println("!!!!!");
        return new Cat();
    }
    @Bean
    public Person personBean() {
        System.out.println("++++");
        return new Person(catBean());
    }
}
