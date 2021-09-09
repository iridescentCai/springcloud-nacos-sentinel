package com.wiscom.controller;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.wiscom.sentinel.CommonBlockHandler;
import com.wiscom.sentinel.CommonFallback;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author caicai
 * @Date 2021/9/8 下午2:06
 */

@RestController
public class AnnotationController {

    private int i = 0;

    @GetMapping(value = "/testAnnotation")
    @SentinelResource(value = "testAnnotation",
            blockHandlerClass = CommonBlockHandler.class,
            blockHandler = "handleException3",
            fallback = "fallback",
            fallbackClass = CommonFallback.class
//            exceptionsToIgnore = {IllegalArgumentException.class}
    )
    public String testAnnotation() {
        i++;
        if (i % 3 == 0) {
            throw new IllegalArgumentException("这里出现了异常");
        }
        return "调用成功";
    }

}

  //            machine‐root
  //              /      \
  //        Entrance1   Entrance2
  //           /            \
  //   DefaultNode(nodeA) DefaultNode(nodeA)


