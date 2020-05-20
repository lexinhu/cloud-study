package com.xn2001.springcloud.controller;

import com.xn2001.springcloud.entities.CommonResult;
import com.xn2001.springcloud.entities.Payment;
import com.xn2001.springcloud.service.PaymentFeignService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * Created by 乐心湖 on 2020/5/20 12:04
 */
@RestController
public class OrderFeignController {

    @Resource
    private PaymentFeignService paymentFeignService;

    @GetMapping(value = "/consumer/payment/get/{id}")
    public CommonResult<Payment> getPaymentById(@PathVariable("id") Long id){
        return paymentFeignService.getPaymentById(id);
    }

    @GetMapping("/consumer/payment/feign/timtout")
    String paymentFeignTimeout() {
        return paymentFeignService.paymentFeignTimeout();
    }
}
