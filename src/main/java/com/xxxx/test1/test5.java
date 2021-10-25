package com.xxxx.test1;

import java.util.ArrayList;
import java.util.LinkedList;

public class test5 {
    //ArrayList和LinkedList有哪些区别
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();//数组
        arrayList.add("a");

        LinkedList<String> linkedList = new LinkedList<>();//链表
        linkedList.add("a");

        System.out.println(arrayList);
        System.out.println(linkedList);
    }
}
