# 配置中心服务端 Config Server

把配置信息放在git库里
  1. pom依赖
        ```xml
        <dependency>
            <groupId>org.springframework.cloud</groupId>
            <artifactId>spring-cloud-config-server</artifactId>
        </dependency>
        ```
  2. 启动类 \
    `src\main\java\com\example\configserver\ConfigServerApplication.java` \
    @EnableConfigServer 表明启用配置服务器功能

  3. 配置文件增加 Config 相关配置 \
      [`src\main\resources\application.yml`](.\src\main\resources\application.yml)
 

启动服务，访问http://localhost:8888/product-view-service-feign/master 就能看到配置信息
