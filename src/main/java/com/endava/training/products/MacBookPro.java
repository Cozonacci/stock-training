package com.endava.training.products;

import java.math.BigDecimal;

public class MacBookPro extends Notebook {

    public static final String APPLE_BRAND = "Apple";

    public MacBookPro(String id, String name, BigDecimal price) {
        super(id, name, price, APPLE_BRAND);
    }
}
