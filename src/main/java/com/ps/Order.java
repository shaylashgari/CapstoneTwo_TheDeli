package com.ps;

import java.util.ArrayList;
import java.util.List;

// diffirent fields/ attributes

public class Order {
    private List<Product> products;


    public Order() {
        this.products = new ArrayList<>();
    }

    public void addProduct( Product product){
        this.products.add(product);
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public static void addDrink( Drink drink ){

    }


    public double getOrderTotal() {
        double orderTotal = 0;
        for (Product product : products) {
            orderTotal += product.getPrice();
        }
        return orderTotal;

    }

    public Object getOrder() {
    }

    public Object getName() {
    }
}