package com.wutian.springcloud.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @version: V1.0
 * @packageName: com.wutian.springcloud.config
 * @Author Telson
 * @Description //TODO
 * @Date 2020/9/7 19:33
 **/
@Configuration
public class ApplicationContextConfig {
    @Bean
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }

}
