package com.kagasan.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.sound.midi.Soundbank;

@Component("personBean")
public class Person {
    @Autowired
    @Qualifier("catBean")
    private Pet pet;
    private String surname;
    private int age;

//    @Autowired
    public Person(Pet pet) {
        this.pet = pet;
        System.out.println("Create Person");
    }

    public Person() {
        System.out.println("Create Person");
    }

    public void setPet(Pet pet){
        System.out.println("Class Person: set pet");
        this.pet = pet;
    }
    @Value("${person.surname}")
    public void setSurname(String surname) {
        this.surname = surname;
    }

    @Value("${person.age}")
    public void setAge(int age) {
        this.age = age;
    }

    public Pet getPet() {
        return pet;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public void callYourPet(){
        System.out.println("Hello, my lovely Pet");
        pet.say();
    }
}
