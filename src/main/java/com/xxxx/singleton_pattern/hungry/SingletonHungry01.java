package com.xxxx.singleton_pattern.hungry;

/**
 *  饿汉式（静态常量）
 * 1 构造器私有化
 * 2 类的内部创建对象
 * 3 向外暴露一个静态的公共方法 getIntance
 * 4 代码实现
 *
 * 如果从始至终没有使用这个类 就会造成内存浪费
 */
public class SingletonHungry01 {

    public static void main(String[] args) {
        Singleton instance1 = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();

        System.out.println(instance1.equals(instance2));
        System.out.println(instance1.hashCode());
        System.out.println(instance2.hashCode());
    }

}

class Singleton{
    //构造器私有化
    private Singleton(){};
    //类的内部创建对象
    private final static Singleton instance = new Singleton();
    //向外暴露一个静态的公共方法 getIntance
    public static Singleton getInstance(){
        return instance;
    }
}

