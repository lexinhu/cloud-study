package com.xn2001.springcloud.service;

import com.xn2001.springcloud.entities.CommonResult;
import com.xn2001.springcloud.entities.Payment;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * Created by 乐心湖 on 2020/5/20 12:00
 */
@FeignClient(value = "cloud-payment-service")
public interface PaymentFeignService {

    //直接用URI的方式去8001/8002集群去调用服务

    @GetMapping("/payment/get/{id}")
    CommonResult<Payment> getPaymentById(@PathVariable("id") Long id);

    @GetMapping("/payment/feign/timtout")
    String paymentFeignTimeout();
}
