package com.xxxx.singleton_pattern.lazy;

import io.netty.handler.codec.mqtt.MqttMessageIdAndPropertiesVariableHeader;

/**
 * 懒汉式  线程不安全
 * 对象私有化
 * 构造器私有化
 * 提供一个共有的静态方法，当使用到该方法时，才去创建 instance
 *
 * 懒加载效果  但是只能在单线程下使用
 * 开发中不建议使用
 *
 */
public class SingletonLazy01 {

    public static void main(String[] args) {
        Singleton instance1 = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();

        System.out.println(instance1.hashCode() == instance2.hashCode());
    }
}

class Singleton{

    private static Singleton instance;

    private Singleton(){};

    public static Singleton getInstance(){
        if (instance == null){
            instance = new Singleton();
        }
        return instance;
    }

}
