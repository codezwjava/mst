package com.xxxx.test1;


public class test4 {
    /**
     * string  stringBuilder  stringBuffer 的区别
     * @param args
     */
    public static void main(String[] args) {

        //string 是不可变的 如果尝试修改则会生成一个新的字符串对象，stringbuilder和stringbuffer是可变的
        //stringBuffer 是线程安全的，stringBuilder 是线程不安全的 ，所以单线程先stringBuilder效率会更高
        String s = "abc";

        StringBuilder builder = new StringBuilder(s);

        //并发安全的
        StringBuffer buffer = new StringBuffer(s);
    }
}
