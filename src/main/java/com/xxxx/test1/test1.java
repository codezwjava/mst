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

        StringBuilder builder = new StringBuilder(s);
        builder.append("d");

//        s.getClass().getDeclaredField("value").set("value","abcd");

        System.out.println(builder);
        System.out.println(s);
    }
}
