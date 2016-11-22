package com.endava.training;

import com.endava.training.products.MacBookPro;
import com.endava.training.stock.StoreStockToday;
import org.junit.Test;

import java.math.BigDecimal;

public class StoreStockTodayTest {

    @Test
    public void shouldRemoveAProductFromStock() {
        Product macBookPro = new MacBookPro("1111", "MBCR323", new BigDecimal(122.2));
        Stock stock = new StoreStockToday();
        stock.addProductToStock(macBookPro, 3);
        assert stock.getOutstandingStock().size() == 1;
    }
}
