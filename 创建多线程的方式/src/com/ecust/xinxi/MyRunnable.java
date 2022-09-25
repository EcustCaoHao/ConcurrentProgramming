package com.ecust.xinxi;
//实现Runnable接口
public class MyRunnable implements Runnable{
    @Override
    public void run() {
        for (int i=0;i<20;i++){
            try {
                Thread.sleep(20);  //暂停20毫秒
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName()+":打了"+i+"个小兵");
        }
    }
}
