package com.example.productviewservicefeignhystrix.client;

import com.example.productviewservicefeignhystrix.bean.Product;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * @author xuyuc
 * 熔断实现类
 */
@Component
public class ProductClientFeignHystrix implements ProductClientFeign{
    public List<Product> listProdcuts(){
        List<Product> result = new ArrayList<>();
        result.add(new Product(0,"数据提供者微服务不可用",0));
        return result;
    }

}