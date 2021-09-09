package com.wiscom.sentinel;

import com.alibaba.csp.sentinel.slots.block.BlockException;

/**
 * @author caicai
 * @Date 2021/9/8 下午2:06
 */

public class CommonBlockHandler {

    /**
     * 注意： 必须为 static 函数   多个方法之间方法名不能一样
     *
     * @param exception
     * @return
     */
    public static String handleException3(BlockException exception) {
        return "===被限流或降级了===";
    }

    /**
     * 注意： 必须为 static 函数   多个方法之间方法名不能一样
     *
     * @param exception
     * @return
     */
    public static String handleException2(Integer i, BlockException exception) {
        return "热点数据" + i + "被限流";
    }
}
