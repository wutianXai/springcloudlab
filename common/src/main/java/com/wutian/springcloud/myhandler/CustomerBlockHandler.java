package com.wutian.springcloud.myhandler;

import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.wutian.springcloud.entities.CommonResult;

/**
 * @version: V1.0
 * @packageName: com.wutian.springcloud.myhandler
 * @Author Telson
 * @Description //TODO
 * @Date 2020/10/18 17:10
 **/

public class CustomerBlockHandler {

    public static CommonResult handleException1(BlockException exception) {
        return new CommonResult(2020, "自定义限流处理信息1....CustomerBlockHandler");

    }

    public static CommonResult handleException2(BlockException exception) {
        return new CommonResult(2020, "自定义限流处理信息2....CustomerBlockHandler");

    }
}