package com.example.productdataservice;

import ch.qos.logback.core.net.SyslogOutputStream;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import cn.hutool.core.net.NetUtil;

@SpringBootApplication
@EnableEurekaClient // 启用服务注册发现功能
public class ProductDataServiceApplication {

    public static void main(String[] args) {
        //SpringApplication.run(ProductDataServiceApplication.class, args);

        int defaultPort = 0;
        int node1 = 8001;
        int node2 = 8002;

        if (NetUtil.isUsableLocalPort(node1)) {
            defaultPort = node1;
        } else if (NetUtil.isUsableLocalPort(node2)) {
            defaultPort = node2;
        } else {
            System.err.printf("端口被占用了，无法启动%n");
            System.exit(1);
        }
        System.out.println("数据提供服务节点：" + defaultPort);
        new SpringApplicationBuilder(ProductDataServiceApplication.class).properties("server.port=" + defaultPort).run(args);
    }

}
