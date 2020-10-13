package com.wutian.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @version: V1.0
 * @packageName: com.wutian.springcloud
 * @Author Telson
 * @Description //TODO
 * @Date 2020/10/13 22:38
 **/
@EnableDiscoveryClient
@SpringBootApplication
public class PaymentMain9002 {
    public static void main(String[] args) {
        SpringApplication.run(PaymentMain9002.class,args);
    }
}
