package com.example.zack.weekonetest;

/**
 * Created by Zack on 9/1/2017.
 * Create a singleton class and make it thread safe
 * -  can only create one instance of the class only one object of that class.
 * Make an empty constructor to be private.
 */

class Singleton {
    private static final Singleton ourInstance = new Singleton();

    static Singleton getInstance() {
        return ourInstance;
    }

    private Singleton() {
    }
}
