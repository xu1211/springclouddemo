# Hystrix Dashboard
 
熔断器仪表盘，提供熔断可视化监控功能

- Hystrix Dashboard共支持三种不同的监控方式

  1. 默认的集群监控：通过URL:http://turbine-hostname:port/turbine.stream开启，实现对默认集群的监控。

  2. 指定的集群监控：通过URL:http://turbine-hostname:port/turbine.stream?cluster=[clusterName]开启，实现对clusterName集群的监控。

  3. 单体应用的监控：通过URL:http://hystrix-app:port/hystrix.stream开启，实现对具体某个服务实例的监控。

- hystrix-dashboard项目
    - pom依赖
    ```xml
        <dependency>
            <groupId>org.springframework.cloud</groupId>
            <artifactId>spring-cloud-starter-netflix-hystrix-dashboard</artifactId>
        </dependency>
    ```
    - 配置文件 \
    [`src\main\resources\application.yml`](.\src\main\resources\application.yml)
    - 启动类 \
    `src\main\java\com\example\hystrixdashboard\HystrixDashboardApplication.java` \
    @EnableHystrixDashboard 表明启用Hystrix Dashboard功能




先启动Eureka Server，再启动这个Eureka Client服务，访问Eureka Server: http://{server:ip}:8761  就能看到这个 Eureka Client

- 服务请求地址

    http://127.0.0.1:8001/products
    
    http://127.0.0.1:8002/products