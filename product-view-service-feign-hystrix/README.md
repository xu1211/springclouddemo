# 熔断器Hystrix
 为了保证服务高可用 单个服务通常会集群部署。\
 如果单个服务出现问题，由于服务与服务之间的依赖性，故障会传播，会对整个微服务系统造成灾难性的严重后果，这就是服务故障的 “雪崩” 效应。\
 熔断器模型 解决这个问题: 当被访问的微服务无法使用的时候，当前服务能够感知这个现象

-  对`Eureka Client微服务--服务消费者 Feign` 增加熔断

Feign 自带熔断器功能

  1. pom依赖
        ```xml
        <dependency>
            <groupId>org.springframework.cloud</groupId>
            <artifactId>spring-cloud-starter-netflix-hystrix</artifactId>
            <version>2.2.2.RELEASE</version>
        </dependency>
        ```
  2. 配置文件开启熔断器 \
      [`src\main\resources\application.yml`](.\src\main\resources\application.yml)
  3. Service 增加 fallback 指定类 \
      [@FeignClient 注解里 指定 fallbackMethod 熔断方法](.\src\main\java\com\example\productviewservicefeignhystrix\client\ProductClientFeign.java)
  4. 创建 fallback 熔断实现类 \
      [熔断实现类：熔断时执行的方法](.\src\main\java\com\example\productviewservicefeignhystrix\client\ProductClientFeignHystrix.java)