package com.example.productviewserviceribbon.service;

import com.example.productviewserviceribbon.bean.Product;
import com.example.productviewserviceribbon.client.ProductClientRibbon;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author xuyuc
 * 服务类:从 Ribbon 客户端 中获取数据
 */
@Service
public class ProductService {
    @Autowired
    ProductClientRibbon productClientRibbon;

    public List<Product> listProducts() {
        return productClientRibbon.listProdcuts();

    }
}
