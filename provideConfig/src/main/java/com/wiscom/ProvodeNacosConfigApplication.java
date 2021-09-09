package com.wiscom;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author caicai
 * @Date 2021/7/23 上午11:34
 */

@SpringBootApplication
@RestController
@RefreshScope
public class ProvodeNacosConfigApplication {
    public static void main(String[] args) {
        ConfigurableApplicationContext run = SpringApplication.run(ProvodeNacosConfigApplication.class, args);
        System.err.println(run.getEnvironment().getProperty("users.name"));
        System.err.println(run.getEnvironment().getProperty("users.age"));
    }


    @Value("${users.name}")
    String name;

    @Value("${users.age}")
    String age;

    @GetMapping("/testRefreshScope")
    String getUsersData() {
        return "name: " + name + " ,age: " + age;
    }
}

    

