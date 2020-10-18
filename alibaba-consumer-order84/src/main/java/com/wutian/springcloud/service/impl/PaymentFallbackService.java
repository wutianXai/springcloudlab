package com.wutian.springcloud.service.impl;

import com.wutian.springcloud.entities.CommonResult;
import com.wutian.springcloud.entities.Payment;
import com.wutian.springcloud.service.PaymentService;
import org.springframework.stereotype.Component;

/**
 * @version: V1.0
 * @packageName: com.wutian.springcloud.service.impl
 * @Author Telson
 * @Description //TODO
 * @Date 2020/10/18 21:55
 **/

@Component
public class PaymentFallbackService implements PaymentService
{
    @Override
    public CommonResult<Payment> paymentSQL(Long id)
    {
        return new CommonResult<>(44444,"服务降级返回,---PaymentFallbackService",new Payment(id,"errorSerial"));
    }
}
