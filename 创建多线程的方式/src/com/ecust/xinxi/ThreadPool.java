package com.ecust.xinxi;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

//使用线程池的方式来创建
public class ThreadPool {
    public static void main(String[] args) {
        //提供执行线程数量的线程池
        ExecutorService executorService = Executors.newFixedThreadPool(10);
        //执行两个线程
        executorService.execute(new MyThread());
        executorService.execute(new MyThread());
        //关闭连接池
        executorService.shutdown();
    }
}
//后期使用线程池来创建用的是最多的！