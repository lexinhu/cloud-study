package com.xn2001.springcloud.service;

import com.xn2001.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Param;

/**
 * Created by 乐心湖 on 2020/3/31 22:40
 */
public interface PaymentService {
    int create(Payment payment);
    Payment getPaymentById(Long id);
}
