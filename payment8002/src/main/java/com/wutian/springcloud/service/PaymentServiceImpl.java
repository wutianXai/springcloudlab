package com.wutian.springcloud.service;

import com.wutian.springcloud.dao.PaymentDao;
import com.wutian.springcloud.entities.Payment;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @version: V1.0
 * @packageName: com.wutian.springcloud.service
 * @Author Telson
 * @Date 2020/9/6 18:30
 **/
@Service
public class PaymentServiceImpl implements PaymentService  {
    @Resource
    private PaymentDao paymentDao;

    @Override
    public int create(Payment payment){
        return paymentDao.create(payment);
    }

    @Override
    public Payment getPaymentById(Long id){
        return paymentDao.getPaymentById(id);
    }

}
