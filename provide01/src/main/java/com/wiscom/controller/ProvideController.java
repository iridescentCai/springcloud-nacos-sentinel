package com.wiscom.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author caicai
 * @Date 2021/5/20 上午10:01
 */

@RestController
public class ProvideController {

    @Value("${server.port}")
    String port;

    @GetMapping("/getProvidePort")
    public String getProvidePort() {
        return "current provide port is " + port;
    }
}

    

