package com.endava.training.products;

import com.endava.training.AbstractProduct;

import java.math.BigDecimal;

public abstract class Notebook extends AbstractProduct {

    private String brand;

    public Notebook(String id, String name, BigDecimal price, String brand) {
        super(id, name, price);
        setBrand(brand);
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
}
