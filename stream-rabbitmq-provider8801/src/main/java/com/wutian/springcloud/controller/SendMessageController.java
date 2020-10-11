package com.wutian.springcloud.controller;

import com.wutian.springcloud.service.IMessageProvider;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
/**
 * @version: V1.0
 * @packageName: com.wutian.springcloud.controller
 * @Author Telson
 * @Description //TODO
 * @Date 2020/10/11 16:45
 **/
@RestController
public class SendMessageController
{
    @Resource
    private IMessageProvider messageProvider;

    @GetMapping(value = "/sendMessage")
    public String sendMessage()
    {
        return messageProvider.send();
    }

}
