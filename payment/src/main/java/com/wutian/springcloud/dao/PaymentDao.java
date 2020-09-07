package com.wutian.springcloud.dao;

import com.wutian.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Mapper;

/**
 * @version: V1.0
 * @packageName: dao
 * @Author Telson
 * @Date 2020/9/6 18:27
 **/
@Mapper
public interface PaymentDao {
    int create(Payment payment);

    Payment getPaymentById(Long id);
}
