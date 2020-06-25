package com.example.productviewservicefeignhystrix.web;

import java.util.List;

import com.example.productviewservicefeignhystrix.bean.Product;
import com.example.productviewservicefeignhystrix.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


/**
 * @author xuyuc
 * @since 2020/6/24 15:38
 */
@Controller
public class ProductController {

    @Autowired
    ProductService productService;

    @RequestMapping("/products")
    public Object products(Model m) {
        List<Product> ps = productService.listProducts();
        m.addAttribute("ps", ps);
        return "products";
    }
}
