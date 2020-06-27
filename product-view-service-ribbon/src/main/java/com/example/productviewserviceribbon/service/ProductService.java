package com.example.productviewserviceribbon.service;

import com.example.productviewserviceribbon.bean.Product;
import com.example.productviewserviceribbon.client.ProductClientRibbon;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @author xuyuc
 * 服务类:从 Ribbon 客户端 中获取数据
 */

@Service
public class ProductService {
    @Autowired
    ProductClientRibbon productClientRibbon;

    @HystrixCommand(fallbackMethod = "listProductsError")
    public List<Product> listProducts() {
        return productClientRibbon.listProdcuts();
    }

    public List<Product> listProductsError() {
        List<Product> result = new ArrayList<>();
        result.add(new Product(0, "数据提供者微服务不可用", 0));
        return result;
    }
}
