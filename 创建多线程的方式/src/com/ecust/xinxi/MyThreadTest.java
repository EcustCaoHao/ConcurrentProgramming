package com.ecust.xinxi;

public class MyThreadTest {
    public static void main(String[] args) {
        //创建3个线程
        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();
        MyThread t3 = new MyThread();
        //设置线程的名字
        t1.setName("鲁班");
        t2.setName("刘备");
        t3.setName("亚瑟");
        //启动线程
        t1.start();
        t2.start();
        t3.start();
    }
}
