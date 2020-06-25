package com.example.productviewservicefeignhystrix.service;

import java.util.List;

import com.example.productviewservicefeignhystrix.bean.Product;
import com.example.productviewservicefeignhystrix.client.ProductClientFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


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