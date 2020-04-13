package com.xn2001.springcloud.service.impl;

import com.xn2001.springcloud.dao.PaymentDao;
import com.xn2001.springcloud.entities.Payment;
import com.xn2001.springcloud.service.PaymentService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.Resource;
import javax.sql.DataSource;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by 乐心湖 on 2020/4/12 22:09
 */
class PaymentServiceImplTest {

    @Autowired
    private PaymentDao paymentDao;

    @Autowired
    private DataSource dataSource;

    @Test
    void create() {

    }

    @Test
    void getPaymentById() {
        Payment paymentById = paymentDao.getPaymentById((long) 1);
        System.out.println(paymentById);
    }
}