# 配置中心客户端 Config Client

-  对`服务消费者 Feign` 配置中心客户端改造

把配置信息放在git库里
  1. 首先要`启动配置中心服务端`，并在git库创建配置文件{application}-{profile}.yml 或 {application}-{profile}.properties
  2. pom依赖
        ```xml
        <dependency>
            <groupId>org.springframework.cloud</groupId>
            <artifactId>spring-cloud-starter-config</artifactId>
        </dependency>
        ```
  3. 项目的配置文件指向git库的配置文件
      [`src\main\resources\application.yml`](.\src\main\resources\application.yml)

        - label：配置仓库的分支
        - profile：配置文件的环境标识
            - dev：表示开发环境
            - test：表示测试环境
            - prod：表示生产环境

启动项目时会自动从git库里找配置信息启动
