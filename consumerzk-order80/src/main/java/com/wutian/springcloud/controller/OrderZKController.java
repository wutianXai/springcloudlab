package com.wutian.springcloud.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;
import java.util.UUID;

/**
 * @version: V1.0
 * @packageName: com.wutian.springcloud.controller
 * @Author Telson
 * @Date 2020/9/10 21:37
 **/
@RestController
@Slf4j
public class OrderZKController  {
    public static final String INVOME_URL = "http://cloud-payment";

    @Resource
    private RestTemplate restTemplate;

    @GetMapping("/consumer/payment/zk")
    public String payment (){
        String result = restTemplate.getForObject(INVOME_URL+"/payment/zk",String.class);
        return result;
    }


}
