package com.ecust.xinxi;

import java.util.concurrent.FutureTask;

public class MyCallableTest {
    public static void main(String[] args) {
        //创建MyCallable对象
        MyCallable myCallable = new MyCallable();
        //作为参数传递给FutureTask
        FutureTask futureTask = new FutureTask(myCallable);
        FutureTask futureTask1 = new FutureTask(myCallable);
        FutureTask futureTask2 = new FutureTask(myCallable);
        //利用FutureTask来创建线程
        Thread t1 = new Thread(futureTask);
        Thread t2 = new Thread(futureTask1);
        Thread t3 = new Thread(futureTask2);
        t1.setName("典韦");
        t2.setName("黄忠");
        t3.setName("虞姬");
        t1.start();
        t2.start();
        t3.start();
    }
}
