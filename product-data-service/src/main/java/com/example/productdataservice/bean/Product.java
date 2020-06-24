package com.example.productdataservice.bean;

import org.springframework.context.annotation.Bean;

/**
 * @author xuyuc
 * @since 2020/6/22 18:56
 */

public class Product {
    private int id;
    private String name;
    private int price;

    public Product() {
    }

    public Product(int id, String name, int price) {
        super();
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}