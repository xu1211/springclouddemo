# Eureka Client
    
   创建一个数据提供服务，并作为Eureka Client注册在Eureka Server

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

- 服务请求地址

    http://127.0.0.1:8001/products
    
    http://127.0.0.1:8002/products