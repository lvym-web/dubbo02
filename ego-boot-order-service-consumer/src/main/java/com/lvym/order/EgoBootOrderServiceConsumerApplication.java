package com.lvym.order;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;

@SpringBootApplication
@EnableDubbo
@EnableHystrix
public class EgoBootOrderServiceConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(EgoBootOrderServiceConsumerApplication.class, args);
    }

}
