package com.wiscom.controller;

import com.wiscom.service.TestInterface;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author caicai
 * @Date 2021/9/9 上午10:02
 */

@RestController
public class TestChainController {

    @Resource
    TestInterface testInterfaceImpl;


    @GetMapping("/testChain")
    String getTestChain() {
        return testInterfaceImpl.testChain();
    }

    @GetMapping("/testChain2")
    String getTestChain2() {
        return testInterfaceImpl.testChain();
    }

}

    

