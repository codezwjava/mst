package com.xxxx.singleton_pattern.lazy;

public class SingletonLazy02 {
    public static void main(String[] args) {
        Singleton02 instance1 = Singleton02.getInstance();
        Singleton02 instance2 = Singleton02.getInstance();

        System.out.println(instance1.hashCode() == instance2.hashCode());
    }
}
class Singleton02{

    private static Singleton02 instance;

    private Singleton02(){};

    /**
     * 同步安全  效率太低
     * 每次调用getIntance 都会同步  多线程情况下
     * @return
     */
    public static synchronized Singleton02 getInstance(){
        if (instance == null){
            instance = new Singleton02();
        }
        return instance;
    }
}
