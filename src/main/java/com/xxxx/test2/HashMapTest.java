package com.xxxx.test2;

import com.xxl.job.core.handler.annotation.XxlJob;

import java.util.HashMap;

public class HashMapTest {
    /**
     *
     * 1.7 是数组+链表的数据机构
     *  1.8 是数组+链表+红黑树的数据结构
     *
     * hashmap扩容机制  扩容针对的是数组
     *
     * 1.7 头插法
     *
     *  1.先生成新数组
     *  2.遍历老数组上每一个位置上的链表上的元素
     *  3.去每一个元素的key，基于新数组的长度计算出元素对应的新数组下标
     *  4.将元素添加到新数组中
     *  5.所有元素转移完成，将新数组赋值给hashmap对象的table属性
     *
     * 1.8 尾插法
     *
     *  1.先生成新数组
     *  2.遍历老数组中每一个位置上的链表或红黑树中的每一个元素
     *  3.如果是链表则将链表中的每一个元素重新计算下标并添加到行的数组中
     *  4，如果是红黑树，则先遍历红黑树，先计算出红黑树中每个元素在新数组中对应的下标位置
     *      a。统计每个下标位置的元素个数
     *      b。如果该位置的元素个数超过8，则生成新的红黑树，并将根节点添加到新数组中对应的位置
     *      c。如果该位置的元素个数没有超过8，则生成新的链表，并将链表的头结点添加到新数组中对应的位置。
     *  5，所有元素转移完成，将新数组赋值给hashmap对象的table属性
     */

    @XxlJob("main")
    public static void main(String[] args) {

        HashMap<Integer,String> hashMap = new HashMap<Integer,String>();

        hashMap.put(1,"aa1");

    }
}
