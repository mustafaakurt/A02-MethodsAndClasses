package com.mustafakurt.methodsandclasses;

public class Musicians {
    String name;
    int age;
    String insturment;

    public Musicians(String name, int age, String insturment) {
        this.name = name;
        this.age = age;
        this.insturment = insturment;
        System.out.println("constructor called");
    }
}
