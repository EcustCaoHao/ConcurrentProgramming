package com.ecust.xinxi;

import java.util.concurrent.Callable;

//创建一个实现Callable的类
public class MyCallable implements Callable {
    //实现call()
    @Override
    public Object call() throws Exception {
        for (int i=0;i<20;i++){
            Thread.sleep(60);
            System.out.println(Thread.currentThread().getName()+":打了"+i+"个小兵");
        }
        return null;
    }
}
//需要配合FutureTask一起使用