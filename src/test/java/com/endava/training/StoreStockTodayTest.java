package com.endava.training;

import com.endava.training.products.MacBookPro;
import com.endava.training.stock.StoreStockToday;
import org.junit.Test;

import java.math.BigDecimal;

public class StoreStockTodayTest {

    private Product macBookPro1 = new MacBookPro("1111", "MBCR323", new BigDecimal(122.2));
    private Product macBookPro2 = new MacBookPro("1112", "MBCR323", new BigDecimal(122.2));

    @Test
    public void shouldAddAProductToStock() {
        Stock stock = new StoreStockToday();
        stock.addProductToStock(macBookPro1, 3);
        stock.addProductToStock(macBookPro2, 3);
        assert stock.getOutstandingStock().size() == 2;
    }

    @Test
    public void shouldReturnNrOfItemsAvailableInStock() {
        Stock stock = new StoreStockToday();
        stock.addProductToStock(macBookPro1, 3);
        stock.addProductToStock(macBookPro2, 3);
        assert stock.getNrOfItemsInStock() == 6;
    }

    @Test
    public void shouldRemoveProductsFromStock() {
        Stock stock = new StoreStockToday();
        stock.addProductToStock(macBookPro1, 2);
        stock.removeProductFromStock(macBookPro1);
        assert stock.getNrOfItemsInStock() == 1;
    }

    @Test
    public void shouldRemoveLastProductFromStock() {
        Stock stock = new StoreStockToday();
        stock.addProductToStock(macBookPro1, 1);
        stock.removeProductFromStock(macBookPro1);
        assert stock.getOutstandingStock().size() == 0;
    }
}
