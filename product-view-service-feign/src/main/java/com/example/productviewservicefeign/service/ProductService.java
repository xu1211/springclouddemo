package com.example.productviewservicefeign.service;

import com.example.productviewservicefeign.bean.Product;
import com.example.productviewservicefeign.client.ProductClientFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author xuyuc
 * 控制器:把数据给 product.html
 */
@Service
public class ProductService {

    @Autowired
    ProductClientFeign productClientFeign;

    public List<Product> listProducts() {
        return productClientFeign.listProdcuts();
    }
}