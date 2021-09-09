package com.wiscom;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author caicai
 * @Date 2021/5/20 上午11:02
 */

@SpringBootApplication
@EnableDiscoveryClient
@Configuration
public class ConsumerApplication {
    public static void main(String[] args){
        SpringApplication.run(ConsumerApplication.class, args);
    }

    @Bean
    @LoadBalanced
    public RestTemplate getRestemplate(){
        return new RestTemplate();
    }

    @RestController
    class RestTemplateController{
        @Autowired
        RestTemplate restTemplate;

        @GetMapping("/restTemplate")
        String getProvidePort(){
           return restTemplate.getForObject("http://provide/getProvidePort",String.class);
        }
    }
}

    

