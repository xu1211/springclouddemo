# Eureka Server
 

- Eureka Client微服务--服务提供者
    - pom依赖
    ```xml
    <dependency>
        <groupId>org.springframework.cloud</groupId>
        <artifactId>spring-cloud-starter-netflix-eureka-client</artifactId>
    </dependency>
    ```
    - 配置文件 \
    [`src\main\resources\application.yml`](.\src\main\resources\application.yml)
    - 启动类 \
    `src\main\java\com\example\productdataservice\ProductDataServiceApplication.java` \
    @EnableEurekaClient 表明自己是一个 Eureka Client




先启动Eureka Server，再启动这个Eureka Client服务，访问Eureka Server: http://{server:ip}:8761  就能看到这个 Eureka Client
