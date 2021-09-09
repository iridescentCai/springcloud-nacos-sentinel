package com.wiscom.sentinel;

/**
 * @author caicai
 * @Date 2021/9/8 下午2:06
 */

public class CommonFallback {
    /**
     * 注意： 必须为 static 函数
     *
     * @param e
     * @return
     */
    public static String fallback(Throwable e) {
        return "" +
                "" +
                "" +
                "===被异常降级啦===" + e.getMessage();
    }
}
