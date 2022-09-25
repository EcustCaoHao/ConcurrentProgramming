package com.ecust.xinxi;

public class MyRunnableTest {
    public static void main(String[] args) {
        //线程要做的事情都是一样的 都是打小兵
        MyRunnable myRunnable = new MyRunnable();
        Thread t1 = new Thread(myRunnable,"吕布");
        Thread t2 = new Thread(myRunnable,"貂蝉");
        Thread t3 = new Thread(myRunnable,"扁鹊");
        //启动
        t1.start();
        t2.start();
        t3.start();
    }
}
