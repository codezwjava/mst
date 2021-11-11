package com.xxxx.template;

public abstract class DouJiangTemplate {

    public final void make(String peiliao){

        if (notOrAddPeiLiao()){
            addPeiLiao();
        }

        addWater();
        fenSui();
        fix();
        out(peiliao);
    }

    /**
     * 模板模式中的钩子方法 可以实现模板中某些方法不执行
     * @return
     */
    boolean notOrAddPeiLiao(){
        return true;
    }

    /**
     * 添加配料
     */
    abstract void addPeiLiao();

    /**
     * 加水
     */
    void addWater(){
        System.out.println("添加纯净水");
    }

    /**
     * 混合
     */
    void fix(){
        System.out.println("将豆类和水进行混合");
    };

    /**
     * 粉碎
     */
    void fenSui(){
        System.out.println("将豆类粉碎");
    };

    /**
     * 完成
     */
    void out(String peiliao){
        System.out.println(peiliao+"豆浆完成");
    };

}
