package com.atguigu.syt.cmn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;

/**
 * @Author: HANG
 * @Date: 2022/7/6 11:03
 * @Desc:
 */
@SpringBootApplication
@ComponentScan(basePackages = {"com.atguigu"}) @EnableDiscoveryClient
public class ServiceCmnApplication {
    public static void main(String[] args) {
        SpringApplication.run(ServiceCmnApplication.class,args);
    }
}
