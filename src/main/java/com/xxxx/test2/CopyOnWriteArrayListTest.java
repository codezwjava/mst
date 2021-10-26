package com.xxxx.test2;

import java.util.ArrayList;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayListTest {

    public static void main(String[] args) {

        /**
         * arraylist 线程不安全  并发情况下 可能后执行的add方法会将先执行的add方法（aaa）覆盖
         */
        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add("aaa");
        arrayList.add("bbb");

        CopyOnWriteArrayList<String> copyOnWriteArrayList = new CopyOnWriteArrayList<>();


        /**
         * 执行add方法时会先加锁
         *
         *     public boolean add(E e) {
         *         final ReentrantLock lock = this.lock;
         *         lock.lock();
         *         try {
         *             Object[] elements = getArray();
         *             int len = elements.length;
         *             Object[] newElements = Arrays.copyOf(elements, len + 1);
         *             newElements[len] = e;
         *             setArray(newElements);
         *             return true;
         *         } finally {
         *             lock.unlock();
         *         }
         *     }
         */
        copyOnWriteArrayList.add("aaa");

        System.out.println(arrayList);
        System.out.println(copyOnWriteArrayList);

    }
}
