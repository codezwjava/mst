package com.xxxx.test1;

import javax.lang.model.element.VariableElement;
import java.lang.reflect.Field;

public class test1 {
    /**
     * 不改变原对象的引用
     *  将“abc” 变为 “abcd”
     * @param args
     */
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        String s = new String("abc");

        //反射
        //value属性是： value[]
        Field value = s.getClass().getDeclaredField("value");
        value.setAccessible(true);
        value.set(s,"abcd".toCharArray());

        System.out.println(s);
    }
}
