package com.wiscom.fallback;

import com.wiscom.feignClient.ProvideCilent;
import org.springframework.stereotype.Component;


/**
 * @author caicai
 * @Date 2021/5/20 上午10:30
 */

@Component
public class FallBackProvide implements ProvideCilent {
    @Override
    public String getProvidePort() {
        return "请求超时";
    }
}

    

