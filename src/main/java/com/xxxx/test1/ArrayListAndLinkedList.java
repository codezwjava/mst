package com.xxxx.test1;

import java.util.ArrayList;
import java.util.LinkedList;

public class ArrayListAndLinkedList {
    //ArrayList和LinkedList有哪些区别
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();//数组
        arrayList.add("a");

        //指定下标位置添加元素  数据需要依次向后移动  比较消耗性能
        arrayList.add(3,"d");

        LinkedList<String> linkedList = new LinkedList<>();//链表
        linkedList.add("a");

        //指定下标位置添加元素  需要遍历数组找到指定下标位置 添加元素
        linkedList.add(3,"d");

        System.out.println(arrayList);
        System.out.println(linkedList);
    }
}
