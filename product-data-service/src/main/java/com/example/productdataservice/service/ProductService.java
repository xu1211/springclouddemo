package com.example.productdataservice.service;

import com.example.productdataservice.bean.Product;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @author xuyuc
 * @since 2020/6/22 18:54
 */
@Service
public class ProductService {
    @Value("${server.port}")
    String port;

    public List<Product> listProducts() {
        List<Product> ps = new ArrayList<>();
        ps.add(new Product(1, "产品数据1，来自节点" + port, 50));
        ps.add(new Product(2, "产品数据2，来自节点" + port, 100));
        return ps;
    }
}
