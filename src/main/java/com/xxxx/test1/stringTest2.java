package com.xxxx.test1;

import javax.lang.model.element.VariableElement;

public class stringTest2 {
    public static void main(String[] args) {

        String s1 = new String("abc");//生成2个对象 string对象和 字符串常量对象
        String s2 = "abc"; //字符串常量对象

        //s1 == s2 ? true or false
        System.out.println(s1 == s2);//false

        //string的intern方法，首先会检查常量池中是否存在“abc”，如果存在则返回该字符串常量的引用。
                    //如果不存在，则把“abc”添加到字符串常量池中，并返回该字符串常量的引用。
        String s3 = s1.intern();
        //s2 == s3 ? true or false
        System.out.println(s1 == s3);//true
    }
}
