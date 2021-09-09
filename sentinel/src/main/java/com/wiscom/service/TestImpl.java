package com.wiscom.service;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.wiscom.sentinel.CommonBlockHandler;
import org.springframework.stereotype.Component;

/**
 * @author caicai
 * @Date 2021/9/9 上午10:01
 */
@Component
public class TestImpl implements TestInterface {

    @Override
    @SentinelResource(value = "testChain", blockHandlerClass = CommonBlockHandler.class, blockHandler = "handleException3")
    public String testChain() {
        return "testChain success";
    }
}

    

