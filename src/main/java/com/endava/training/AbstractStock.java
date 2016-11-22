package com.endava.training;

import java.util.HashMap;
import java.util.Map;

public abstract class AbstractStock implements Stock {

    private Map<Product, Integer> currentStock;

    public AbstractStock() {
        this.currentStock = new HashMap<>();
    }

    public Map<Product, Integer> getCurrentStock() {
        return currentStock;
    }

    public void setCurrentStock(Map<Product, Integer> currentStock) {
        this.currentStock = currentStock;
    }

    public Map<Product, Integer> getOutstandingStock() {
        return currentStock;
    }

    public Map<Product, Integer> removeProductFromStock(Product product) {
        final Integer productItems = currentStock.get(product);
        if (productItems == 1) currentStock.remove(product);
        else currentStock.put(product, productItems - 1);
        return currentStock;
    }

    public Map<Product, Integer> addProductToStock(Product product, Integer nrOfItems) {
        final Integer productItems = currentStock.get(product);
        if (productItems == null) currentStock.put(product, nrOfItems);
        else currentStock.put(product, productItems + nrOfItems);
        return currentStock;
    }
}
