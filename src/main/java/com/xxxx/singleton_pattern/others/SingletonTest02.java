package com.xxxx.singleton_pattern.others;


public class SingletonTest02 {
    public static void main(String[] args) {
        SingletonEnum instance1 = SingletonEnum.INSTANCE;
        SingletonEnum instance2 = SingletonEnum.INSTANCE;

        System.out.println(instance1.hashCode() == instance2.hashCode());

        instance1.method();

    }
}

enum SingletonEnum{
    INSTANCE;
    public void method(){
        System.out.println("hello world");
    }
}
