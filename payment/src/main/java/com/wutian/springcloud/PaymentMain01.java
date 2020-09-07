package com.wutian.springcloud;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author Telson
 */
@SpringBootApplication
@MapperScan("com.wutian.springcloud.dao")
public class PaymentMain01{
    public static void main(String[] args) {
        SpringApplication.run(PaymentMain01.class,args);
    }

}