package com.wutian.springcloud.service;

import com.wutian.springcloud.entities.CommonResult;
import com.wutian.springcloud.entities.Payment;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @version: V1.0
 * @packageName: com.wutian.spring.cloud.service
 * @Author Telson
 * @Description //TODO
 * @Date 2020/9/27 20:25
 **/
@Component
@FeignClient(value = "CLOUD-PAYMENT")
public interface PaymentFeignService {

    @GetMapping(value = "/payment/get/{id}")
    CommonResult<Payment> getPaymentById(@PathVariable("id") Long id);

    @GetMapping(value = "/payment/feign/timeout")
    String paymentFeignTimeout();
}
