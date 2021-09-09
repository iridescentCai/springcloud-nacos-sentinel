//package com.wiscom.sentinel;
//
//import com.alibaba.csp.sentinel.adapter.spring.webmvc.callback.BlockExceptionHandler;
//import com.alibaba.csp.sentinel.slots.block.BlockException;
//import com.alibaba.csp.sentinel.slots.block.authority.AuthorityException;
//import com.alibaba.csp.sentinel.slots.block.degrade.DegradeException;
//import com.alibaba.csp.sentinel.slots.block.flow.FlowException;
//import com.alibaba.csp.sentinel.slots.block.flow.param.ParamFlowException;
//import com.alibaba.csp.sentinel.slots.system.SystemBlockException;
//import com.fasterxml.jackson.databind.ObjectMapper;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.http.MediaType;
//import org.springframework.stereotype.Component;
//
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//
//
///**
// * @author caicai
// * @Date 2021/9/8 下午2:06
// */
//
//@Component
//public class MyBlockExceptionHandler implements BlockExceptionHandler {
//    Logger log = LoggerFactory.getLogger(BlockExceptionHandler.class);
//
//    @Override
//    public void handle(HttpServletRequest request, HttpServletResponse response, BlockException e) throws Exception {
//        log.info("BlockExceptionHandler BlockException================" + e.getRule());
//        String s = null;
//
//        if (e instanceof FlowException) {
//            s = "接口限流了";
//
//        } else if (e instanceof DegradeException) {
//            s = "服务降级了";
//
//        } else if (e instanceof ParamFlowException) {
//            s = "热点参数限流了";
//
//        } else if (e instanceof SystemBlockException) {
//            s = "触发系统保护规则了";
//
//        } else if (e instanceof AuthorityException) {
//            s = "授权规则不通过";
//        }
//
//        //返回json数据
//        response.setStatus(500);
//        response.setCharacterEncoding("utf-8");
//        response.setContentType(MediaType.APPLICATION_JSON_VALUE);
//        new ObjectMapper().writeValue(response.getWriter(), s);
//    }
//}
