package com.xxxx.test1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

public class ArrayListAndLinkedList {
    //ArrayList和LinkedList有哪些区别
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<String>(Arrays.asList("a","b","c","d"));//数组
        //指定下标位置添加元素  数据需要依次向后移动  比较消耗性能
        arrayList.add(2,"aa");

        LinkedList<String> linkedList = new LinkedList<>(Arrays.asList("a","b","c","d"));//链表
        //指定下标位置添加元素  需要遍历数组找到指定下标位置 添加元素
        linkedList.add(2,"aa");

        System.out.println(arrayList);
        System.out.println(linkedList);
    }
}
