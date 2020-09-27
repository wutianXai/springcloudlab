package com.wutian.springcloud.config;

import feign.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @version: V1.0
 * @packageName: com.wutian.spring.cloud.config
 * @Author Telson
 * @Description //TODO
 * @Date 2020/9/27 21:01
 **/

@Configuration
public class FeignConfig {
    @Bean
    Logger.Level feignLoggerLevel(){
        return Logger.Level.FULL;
    }
}
