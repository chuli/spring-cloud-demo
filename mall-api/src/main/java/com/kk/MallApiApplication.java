package com.kk;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Author: kk
 * @Date: 2020-02-29 22:37
 */

@SpringBootApplication
@EnableDiscoveryClient
public class MallApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(MallApiApplication.class, args);
    }
}
