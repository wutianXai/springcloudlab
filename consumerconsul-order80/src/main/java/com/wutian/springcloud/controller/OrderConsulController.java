package com.wutian.springcloud.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @version: V1.0
 * @packageName: com.wutian.springcloud.controller
 * @Author Telson
 * @Date 2020/9/12 12:24
 **/
@RestController
@Slf4j
public class OrderConsulController {
    public static final String INVOME_URL = "http://consul-provider-payment";

    @Resource
    private RestTemplate restTemplate;

    @GetMapping("/consumer/payment/consul")
    public String payment (){
        return restTemplate.getForObject(INVOME_URL+"/payment/consul",String.class);
    }

}
