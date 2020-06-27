package com.example.productviewserviceribbon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
//import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
//import org.springframework.context.annotation.Bean;
//import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableDiscoveryClient // 用于发现 服务注册中心 的微服务
@EnableHystrix  // 熔断器
@EnableHystrixDashboard  // 熔断器仪表盘
public class ProductViewServiceRibbonApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProductViewServiceRibbonApplication.class, args);
    }
}
