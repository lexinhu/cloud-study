package com.xn2001.springcloud.controller;

import com.xn2001.springcloud.entities.CommonResult;
import com.xn2001.springcloud.entities.Payment;
import com.xn2001.springcloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * Created by 乐心湖 on 2020/4/12 21:09
 */

@RestController
@Slf4j
public class PaymentController {

    @Resource
    private PaymentService paymentService;

    @Value("${server.port}")
    private String serverPort;

    @PostMapping("/payment/create")
    public CommonResult create(@RequestBody Payment payment){
        int result = paymentService.create(payment);
        log.info("创建结果："+ result);

        if (result > 0){
            return new CommonResult(200,"创建数据成功",result);
        }else{
            return new CommonResult(444,"创建数据失败");
        }
    }

    @GetMapping("/payment/get/{id}")
    public CommonResult getPaymentById(@PathVariable("id") Long id){
        Payment payment = paymentService.getPaymentById(id);
        log.info("查询结果："+ payment);
        if (payment != null){
            return new CommonResult(200,"查询成功,serverPort："+serverPort,payment);
        }else{
            return new CommonResult(444,"没有对应记录");
        }
    }
}
