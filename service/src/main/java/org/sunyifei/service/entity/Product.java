package org.sunyifei.service.entity;

public class Product {
    private Integer product_id;
    private Integer stocks;

    public Product(Integer product_id, Integer stocks) {
        this.product_id = product_id;
        this.stocks = stocks;
    }
    public Integer getProduct_id() {
        return product_id;
    }

    public void setProduct_id(Integer product_id) {
        this.product_id = product_id;
    }

    public Integer getStocks() {
        return stocks;
    }

    public void setStocks(Integer stocks) {
        this.stocks = stocks;
    }
}
