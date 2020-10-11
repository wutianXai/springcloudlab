package com.wutian.springcloud.service.impl;

import com.wutian.springcloud.service.IMessageProvider;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.support.MessageBuilder;

import javax.annotation.Resource;
import java.util.UUID;

/**
 * @version: V1.0
 * @packageName: com.wutian.springcloud.service.impl
 * @Author Telson
 * @Description //TODO
 * @Date 2020/10/11 16:43
 **/

/**
 * 定义消息的推送管道
 */
@EnableBinding(Source.class)
public class MessageProviderImpl implements IMessageProvider
{


    /**
     * 消息发送管道
     */
    @Resource
    private MessageChannel output;

    @Override
    public String send()
    {
        String serial = UUID.randomUUID().toString();
        output.send(MessageBuilder.withPayload(serial).build());
        System.out.println("*****serial: "+serial);
        return null;
    }
}