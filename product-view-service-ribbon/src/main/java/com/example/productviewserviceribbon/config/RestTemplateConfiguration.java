package com.example.productviewserviceribbon.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author xuyuc
 * 配置注入 RestTemplate
 */
@Configuration
public class RestTemplateConfiguration {

    @Bean
    @LoadBalanced // 开启负载均衡功能, RestTemplate就具有了客户端负载均衡能力
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}