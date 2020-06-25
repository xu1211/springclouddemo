package com.example.productviewservicefeignhystrix.client;

import java.util.List;

import com.example.productviewservicefeignhystrix.bean.Product;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author xuyuc
 * Feign 客户端：通过注解方式 访问PRODUCT-DATA-SERVICE服务的 products路径， 熔断类为ProductClientFeignHystrix
 */

//@FeignClient(value = "PRODUCT-DATA-SERVICE")
@FeignClient(value = "PRODUCT-DATA-SERVICE",fallback = ProductClientFeignHystrix.class)
public interface ProductClientFeign {

    @GetMapping("/products")
    public List<Product> listProdcuts();
}