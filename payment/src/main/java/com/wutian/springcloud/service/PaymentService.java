package com.wutian.springcloud.service;

import com.wutian.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @version: V1.0
 * @packageName: com.wutian.springcloud.service
 * @Author Telson
 * @Description //TODO
 * @Date 2020/9/6 18:29
 **/
@Mapper
public interface PaymentService {

    int create(Payment payment); //写

    Payment getPaymentById(@Param("id") Long id);  //读取

}
