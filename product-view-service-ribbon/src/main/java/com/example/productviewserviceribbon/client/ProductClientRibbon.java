package com.example.productviewserviceribbon.client;

import com.example.productviewserviceribbon.bean.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * @author xuyuc
 * Ribbon 客户端：通过 restTemplate 访问服务提供者 http://PRODUCT-DATA-SERVICE/products
 * PRODUCT-DATA-SERVICE是服务提供者在 eureka 注册中心的名称。
 */

@Component
public class ProductClientRibbon {
    @Autowired
    RestTemplate restTemplate;

    public List<Product> listProdcuts() {
        return restTemplate.getForObject("http://PRODUCT-DATA-SERVICE/products", List.class);
    }

}
