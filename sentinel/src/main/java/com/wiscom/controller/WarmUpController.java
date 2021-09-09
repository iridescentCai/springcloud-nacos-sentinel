package com.wiscom.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author caicai
 * @Date 2021/9/9 下午1:48
 */
@RestController
public class WarmUpController {
    @RequestMapping("/test")
    public String test() {
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "========test()========";
    }
}

    

