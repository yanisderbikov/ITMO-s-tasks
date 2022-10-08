package com.company.trash;

public abstract class GoHome {

    void goHome(){
        eat();
        hi();
        name();
        walk();
    }

    abstract void eat();
    abstract void walk();
    void hi(){
        System.out.print("hi ");
    }
    abstract void name();

}
