package com.endava.training;

import java.util.Map;

public interface Stock {

    int getNrOfItemsInStock();

    Map<Product, Integer> getOutstandingStock();

    /**
     * Should remove one item of type Product from stock
     * if is the last one it should remove the product from the stock
     * @return the state of the stock after product removal
     */
    Map<Product, Integer> removeProductFromStock(Product product);

    /**
     * Should add @nrOfItems items of type Product to stock
     * @return the state of the stock after stock update
     */
    Map<Product, Integer> addProductToStock(Product product, Integer nrOfItems);
}
