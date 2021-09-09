package com.wiscom.controller;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.wiscom.sentinel.CommonBlockHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author caicai
 * @Date 2021/9/9 下午5:09
 */

@RestController
public class HotSpotController {

    @GetMapping("/hotSpot/{id}")
    @SentinelResource(value = "hotSpot",
            blockHandlerClass = CommonBlockHandler.class,
            blockHandler = "handleException2")
    String getHotSpot(@PathVariable("id") Integer id) {
        return "热点物品" + id;
    }

}

    

