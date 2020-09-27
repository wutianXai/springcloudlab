package com.wutian.springcloud.controller;

import com.wutian.springcloud.service.PaymentFeignService;
import com.wutian.springcloud.entities.CommonResult;
import com.wutian.springcloud.entities.Payment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @version: V1.0
 * @packageName: com.wutian.spring.cloud.controller
 * @Author Telson
 * @Description //TODO
 * @Date 2020/9/27 20:27
 **/

@RestController
public class OrderFeignController {

    @Resource
    private PaymentFeignService paymentFeignService;

    @GetMapping(value = "/payment/get/{id}")
    public CommonResult<Payment> getPaymentById(@PathVariable("id") Long id){
        return paymentFeignService.getPaymentById(id);
    }

    @GetMapping(value = "/payment/feign/timeout")
    public String paymentFeignTimeout(){
        return paymentFeignService.paymentFeignTimeout();
    }
}