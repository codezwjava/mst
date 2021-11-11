package com.xxxx.singleton_pattern.hungry;

/**
 *  饿汉式（在静态代码块中实现类的初始化）
 * 1 构造器私有化
 * 2 类的内部创建对象
 * 3 在静态代码块中实现类的初始化
 * 4 代码实现
 *
 * 如果从始至终没有使用这个类 就会造成内存浪费
 */
public class SingletonHungry02 {

    public static void main(String[] args) {
        Singleton02 instance1 = Singleton02.getInstance();
        Singleton02 instance2 = Singleton02.getInstance();

        System.out.println(instance1.equals(instance2));
        System.out.println(instance1.hashCode());
        System.out.println(instance2.hashCode());
    }

}

class Singleton02{
    //构造器私有化
    private Singleton02(){};
    //类的内部创建对象
    private final static Singleton02 instance;

    static {
        instance = new Singleton02();
    }
    //向外暴露一个静态的公共方法 getIntance
    public static Singleton02 getInstance(){
        return instance;
    }
}

