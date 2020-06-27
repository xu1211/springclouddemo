package com.example.productviewservicefeignconfigclient.service;


import com.example.productviewservicefeignconfigclient.bean.Product;
import com.example.productviewservicefeignconfigclient.client.ProductClientFeign;
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