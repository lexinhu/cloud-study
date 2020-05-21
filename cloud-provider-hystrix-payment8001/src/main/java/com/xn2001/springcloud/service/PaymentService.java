package com.xn2001.springcloud.service;

import org.springframework.stereotype.Service;

import java.util.concurrent.TimeUnit;

/**
 * Created by 乐心湖 on 2020/5/21 0:01
 */
@Service
public class PaymentService {

    public String paymentInfoOK(Integer id){
        return "当前线程: "+Thread.currentThread().getName()+"paymentInfo_OK,id："+id+"\t"+"O(∩_∩)O哈哈~";
    }

    public String paymentInfoTimeOut(Integer id){
        int timeout=3;
        try {
            TimeUnit.SECONDS.sleep(timeout);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "线程池："+Thread.currentThread().getName()+"   paymentInfo_Timeout,id："+id+"\t"+"┭┮﹏┭┮呜呜~"+"  耗时(秒)："+timeout;
    }
}