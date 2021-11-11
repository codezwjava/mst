package com.xxxx.singleton_pattern.others;

/**
 * 静态内部类
 *  该类中有一个静态的内部属性
 */
public class SingletonTest {

    public static void main(String[] args) {

    }

}

/**
 * 今天内部类完成
 */
class Singleton{

    //构造器私有化
    private Singleton(){};

    //今天内部类完成  该类中有一个静态属性  在第一次调用getInstance方法是 会进行SingletonInstance类装载
    private static class SingletonInstance{

        private static final Singleton INSTANCE = new Singleton();
    }

    //提供静态方 法
    public static synchronized Singleton getInstance(){
        return SingletonInstance.INSTANCE;
    }
}