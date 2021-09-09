package com.wiscom.feignClient;

import com.wiscom.fallback.FallBackProvide;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author caicai
 * @Date 2021/5/20 上午10:06
 */
@FeignClient(name = "provide",fallback = FallBackProvide.class)
public interface ProvideCilent {

    @GetMapping("/getProvidePort")
    String  getProvidePort();
}

    

