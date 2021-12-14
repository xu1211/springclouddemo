# Feign
- pom 增加了 Feign 的依赖
```xml
<dependency>
    <groupId>org.springframework.cloud</groupId>
    <artifactId>spring-cloud-starter-openfeign</artifactId>
</dependency>
```
- Application启动类增加注解开启 Feign 功能
  - @EnableFeignClients  
- **创建 Feign 接口**
  - 通过 @FeignClient("服务名") 注解来指定调用哪个服务。
  - 通过 @GetMapping("路径"),@PostMapping("路径") 等注解指定调用路径
    src/main/java/com/example/productviewservicefeign/client/ProductClientFeign.java
- 在service类调用 Feign 接口