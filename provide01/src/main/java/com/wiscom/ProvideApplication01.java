package com.wiscom;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author caicai
 * @Date 2021/5/20 上午9:07
 */

@SpringBootApplication
@EnableDiscoveryClient
public class ProvideApplication01 {
    public static void main(String[] args){
        SpringApplication.run(ProvideApplication01.class, args);
    }
}

    

