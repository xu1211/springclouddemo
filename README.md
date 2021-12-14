# springcloud-Netflix
 Netflix-demo

Netflix用来入门还可以，不过市面上这套框架没什么人用，之后也不维护了


## 服务注册中心 Eureka Server
- [Eureka Server 服务注册中心](./eureka-server/README.md)

启动后访问 `http://{server:ip}:8761` 可以查看有哪些服务提供者，服务消费者

## 服务提供者 Eureka Client
- [Eureka Client微服务--服务提供者](./product-data-service/README.md)
  
启动后 服务提供者 Eureka Client 向 Eureka Server 注册，
它会提供一些元数据，例如主机和端口，URL，主页等。Eureka Server 从每个 Client 实例接收心跳消息。 如果心跳超时，则通常将该实例从注册 Server 中删除。


## 服务消费者
在 Spring Cloud 中服务与服务之间可以用 `RestTemplate + Ribbon` 和 `Feign` 来调用

>Ribbon 是一个负载均衡客户端，可以很好的控制 http 和 tcp 的一些行为。\
为Ribbon配置服务提供者地址后Ribbon就可基于某种负载均衡算法自动地帮助服务消费者去请求。Ribbon默认提供了很多负载均衡算法，例如轮询、随机等。\
Ribbon可自动从Eureka Server获取服务提供者地址列表，并基于负载均衡算法，请求其中一个服务提供者实例

>Feign 是对 Ribbon的封装，使用注解的方式，默认实现了负载均衡的效果，调用起来更简单

1. [Eureka Client微服务--服务消费者 ribbon + restTemplate](./product-view-service-ribbon)
2. [Eureka Client微服务--服务消费者 Feign](./product-view-service-feign/README.md)
   


启动后在 Eureka 中会注册实例
 
## 熔断器 Hystrix

 1. [为服务消费者 Feign 增加熔断功能](./product-view-service-feign-hystrix/README.md)

## 熔断器仪表盘监控 Hystrix Dashboard

 1. [微服务--监控熔断情况](./hystrix-dashboard/README.md)

启动后访问 `http://localhost:8764/hystrix`


## 路由网关 zuul

1. [统一访问功能 路由转发](./zuul/src/main/resources/application.yml)
    1. 以 /api/data/ 开头的请求都转发给 PRODUCT-DATA-SERVICE 服务
    2. 以 /api/view/ 开头的请求都转发给 PRODUCT-VIEW-SERVICE-FEIGN-HYSTRIX 服务
2. [服务过滤功能](./zuul/src/main/java/com/example/zuul/filter/LoginFilter.java)
3. [失败时的回调](./zuul/src/main/java/com/example/zuul/fallbackprovider/WebAdminFeignFallbackProvider.java)


## 分布式配置中心

微服务 中小型项目能达到上百，大型能上千上万

由于服务数量巨多，为了方便服务配置文件 **统一管理，实时更新** ，所以需要分布式配置中心组件。

分布式配置中心组件有 Spring Cloud Config ， Apoll 等等

在 Spring Cloud Config 组件中分两个角色:
 1. [Config Server](./config-server/README.md)
 2. [Config Client](./product-view-service-feign-config-client/README.md)

## 服务链路追踪
ZipKin， Twitter 公司开源，理论模型来自于 Google Dapper 论文。

每个服务向 ZipKin 报告计时数据，ZipKin 会根据调用关系通过 ZipKin UI 生成依赖关系图，显示了多少跟踪请求通过每个服务，该系统让开发者可通过一个 Web 前端轻松的收集和分析数据，例如用户每次请求服务的处理时间等，可方便的监测系统中存在的瓶颈。

springcloud2.0之前需要自己搭建一个Zikpin Server服务;2.0之后官方提供了完整的jar包实现这一功能,只要启动运行即可

## 服务监控
Spring Boot Admin
监控服务的健康状况，会话数量，并发数，服务资源
服务端客户端模式


---

微服务 | 端口
---|---
服务注册中心：eureka-server | 8761
配置中心：config-server | 8888
链路追踪：zipkin-server | 9411
服务提供者：product-data-service | 8001，8002
服务消费者_ribbon：product-view-service-ribbon | 8080
服务消费者_feign：product-view-service-feign | 8081
服务消费者_熔断：product-view-service-feign-hystrix | 8082
服务消费者_分布式配置：product-view-service-feign-config-client | 8083
断路器仪表盘 hystrix-dashboard | 8010
路由 zuul | 8011

- 启动顺序

服务注册中心 > 配置中心 > 链路追踪 > 服务提供者 > 服务消费者 > 网关 >