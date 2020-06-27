# springcloud
 springcloud-demo

微服务 | 端口
---|---
服务注册中心：eureka-server | 8761
服务提供者：product-data-service | 8001，8002
服务消费者_ribbon：product-view-service-ribbon | 8080
服务消费者_feign：product-view-service-feign | 8081
服务消费者_熔断：product-view-service-feign-hystrix | 8082
服务消费者_分布式配置：product-view-service-feign-config-client | 8083
断路器仪表盘 hystrix-dashboard | 8010
路由 zuul | 8011


## 服务注册中心 Eureka Server
- [Eureka Server 服务注册中心](./eureka-server/README.md)

http://{server:ip}:8761
## 服务提供者
- [Eureka Client微服务--服务提供者](./product-data-service/README.md)

## 服务消费者
在 Spring Cloud 中服务与服务之间可以用 `RestTemplate + Ribbon` 和 `Feign` 来调用

Ribbon 是一个负载均衡客户端，可以很好的控制 http 和 tcp 的一些行为。
Feign 是对 Ribbon的封装，使用注解的方式，默认实现了负载均衡的效果，调用起来更简单

1. [Eureka Client微服务--服务消费者 ribbon + restTemplate](./product-view-service-ribbon)
2. [Eureka Client微服务--服务消费者 Feign](./product-view-service-feign)

 
## 熔断器 Hystrix

 1. [为服务消费者 Feign 增加熔断](./product-view-service-feign-hystrix/README.md)

## 熔断器仪表盘监控 Hystrix Dashboard

 1. [微服务--监控熔断情况](./hystrix-dashboard/README.md)

## 路由网关 zuul

  1. 统一访问功能
  2. [服务过滤功能](./zuul/src/main/java/com/example/zuul/filter/LoginFilter.java)

## 分布式配置中心

微服务 中小型项目能达到上百，大型能上千上万

由于服务数量巨多，为了方便服务配置文件 ==统一管理，实时更新== ，所以需要分布式配置中心组件。

分布式配置中心组件有 Spring Cloud Config ， Apoll 等等

在 Spring Cloud Config 组件中分两个角色:
 1. [Config Server](./config-server/README.md)
 2. [Config Client](./product-view-service-feign-config-client/README.md)



