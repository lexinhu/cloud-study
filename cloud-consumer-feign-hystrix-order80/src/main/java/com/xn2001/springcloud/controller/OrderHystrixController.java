package com.xn2001.springcloud.controller;

import com.netflix.hystrix.contrib.javanica.annotation.DefaultProperties;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.xn2001.springcloud.service.PaymentHystrixService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import javax.annotation.Resource;

/**
 * Created by 乐心湖 on 2020/5/21 11:35
 */
@RestController
@Slf4j
//优先级比实现类要搞
@DefaultProperties(defaultFallback = "paymentGlobalFallbackMethod")
public class OrderHystrixController {

    @Resource
    private PaymentHystrixService paymentHystrixService;

    @GetMapping(value ="/consumer/payment/hystrix/ok/{id}")
    public String paymentInfoOK(@PathVariable("id") Integer id){
        String result = paymentHystrixService.paymentInfoOK(id);
        return  result;
    }

    @GetMapping(value ="/consumer/payment/hystrix/timeout/{id}")
    @HystrixCommand
    public String paymentInfoTimeOut(@PathVariable("id") Integer id){
        String result = paymentHystrixService.paymentInfoTimeOut(id);
        return result;
    }

    public String paymentGlobalFallbackMethod(){
        return "Global异常处理信息,请稍后再试: orz~";
    }

}
