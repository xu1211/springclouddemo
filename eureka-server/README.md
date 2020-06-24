# Eureka Server
 

- Eureka Server 服务注册中心

    - 配置文件 \
    `src\main\resources\application.yml`
    - 启动类 \
    `src\main\java\com\example\eurekaserver\EurekaServerApplication.java` \
@EnableEurekaServer 表明自己是一个 Eureka Server


启动服务后，访问 http://{server:ip}:8761  就能看到有哪些 Eureka Client

其他服务作为 Client 向eureka-server注册，当 Client 向 Server 注册时会提供一些元数据，如主机、端口、URL、主页等，Server从每个 Client 实例接收心跳消息。 如果心跳超时，则通常将该Client实例从注册 Server 中删除。