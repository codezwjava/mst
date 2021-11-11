package com.xxxx.template;

/**
 * 模板方法模式案例实现
 */
public class Clent {
    public static void main(String[] args) {

        DouJiangTemplate red = new Red();
        red.make("红豆");
        System.out.println("--------");
        DouJiangTemplate black = new Black();
        black.make("黑豆");
        System.out.println("--------");
        DouJiangTemplate chun = new Chun();
        chun.make("纯");
    }
}
