package com.wutian.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @version: V1.0
 * @packageName: com.wutian.spring.cloud
 * @Author Telson
 * @Description //TODO
 * @Date 2020/9/27 20:24
 **/
@SpringBootApplication
@EnableFeignClients
public class OrderFeignMain80 {
    public static void main(String[] args) {
        SpringApplication.run(OrderFeignMain80.class,args);
    }
}
