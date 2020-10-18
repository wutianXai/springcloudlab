package com.wutian.springcloud.service;

import com.wutian.springcloud.entities.CommonResult;
import com.wutian.springcloud.entities.Payment;
import com.wutian.springcloud.service.impl.PaymentFallbackService;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @version: V1.0
 * @packageName: com.wutian.springcloud.service
 * @Author Telson
 * @Description //TODO
 * @Date 2020/10/18 21:54
 **/

@FeignClient(value = "nacos-payment-provider",fallback = PaymentFallbackService.class)
public interface PaymentService
{
    @GetMapping(value = "/paymentSQL/{id}")
    CommonResult<Payment> paymentSQL(@PathVariable("id") Long id);
}