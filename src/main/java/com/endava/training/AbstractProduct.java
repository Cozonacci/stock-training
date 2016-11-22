package com.endava.training;

import java.math.BigDecimal;

public abstract class AbstractProduct implements Product {

    private String id;
    private String name;
    private BigDecimal price;

    public AbstractProduct(String id, String name) {
        this.id = id;
        this.name = name;
        this.price = new BigDecimal(0.0);
    }

    public AbstractProduct(String id, String name, BigDecimal price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
