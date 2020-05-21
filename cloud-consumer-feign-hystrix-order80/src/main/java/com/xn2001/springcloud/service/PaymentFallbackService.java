package com.xn2001.springcloud.service;

import org.springframework.stereotype.Component;

/**
 * Created by 乐心湖 on 2020/5/21 18:47
 */
@Component
public class PaymentFallbackService implements PaymentHystrixService{
    @Override
    public String paymentInfoOK(Integer id) {
        return "--------paymentFallbackService fall back paymentInfoOK ┭┮﹏┭┮";
    }

    @Override
    public String paymentInfoTimeOut(Integer id) {
        return "--------paymentFallbackService fall back paymentInfoTimeOut ┭┮﹏┭┮";
    }
}
