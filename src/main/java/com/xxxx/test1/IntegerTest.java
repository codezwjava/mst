package com.xxxx.test1;

public class IntegerTest {

    /**
     *
     * 关于integer cache（） 方法
     *
     * 在定义Integer是会调用valueOf（）方法，valueOf（）方法会判断定义的数字是否在-128到127之间
     *      如果存在则直接获取，不存在则创建一个新的Integer对象
     * @param args
     */
    public static void main(String[] args) {
        Integer i1 = 127;
        Integer i2 = 127;

        //i1 == i2 ? true or false
        System.out.println(i1 == i2);//true
        Integer i3 = 128;
        Integer i4 = 128;

        //i1 == i2 ? true or false
        System.out.println(i3 == i4);//false
    }
}
