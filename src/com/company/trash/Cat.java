package com.company.trash;

public class Cat extends GoHome {

    String name;

    public Cat(String name){
        this.name = name;
    }
    @Override
    void eat() {
        System.out.println("im like meat");
    }

    @Override
    void walk() {
        System.out.println("Im ranning");
    }

    @Override
    void name() {
        System.out.printf("my name is %s\n", name);
    }
}