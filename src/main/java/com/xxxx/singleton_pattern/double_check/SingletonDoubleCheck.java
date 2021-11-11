package com.xxxx.singleton_pattern.double_check;

/**
 * 单例模式之懒加载 --- 双重检查
 *
 * 线程安全  懒加载  建议使用
 */
public class SingletonDoubleCheck {
}

class Singleton{
    private static volatile Singleton instance;

    private Singleton(){};

    public Singleton getInstance(){
        //第一次检查
        if (instance == null){

            synchronized (Singleton.class){
                //第二次检查
                if (instance == null){
                    instance = new Singleton();
                }
            }
        }

        return instance;
    };
}
