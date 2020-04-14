package com.xn2001.springcloud.service.impl;

import com.xn2001.springcloud.dao.PaymentDao;
import com.xn2001.springcloud.entities.Payment;
import com.xn2001.springcloud.service.PaymentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by 乐心湖 on 2020/3/31 22:40
 */
@Service
public class PaymentServiceImpl implements PaymentService {

    @Resource
    private PaymentDao paymentDao;

    @Override
    public int create(Payment payment){
        return paymentDao.create(payment);
    }

    @Override
    public Payment getPaymentById(Long id) {
        return paymentDao.getPaymentById(id);
    }


}
