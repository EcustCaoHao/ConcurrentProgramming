package com.ecust.xinxi;

//继承Thread类 重写run方法
public class MyThread extends Thread{
    @Override
    public void run() {
        for (int i=0;i<100;i++){
            //this可以省略 直接调用 Thread类中的getName()
            System.out.println(this.getName()+":打了"+i+"个小兵");
        }
    }
}
