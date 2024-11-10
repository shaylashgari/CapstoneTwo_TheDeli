package com.ps;

public class Drink implements Product{

    private String name;
    private double price;
    private String size;

    public Drink(String name, double price, String size) {
        this.name = name;
        this.price = price;
        this.size = size;
    }

    @Override
    price double getPrice{
        return 0;
    }

    @Override
    public String getSize(){
        return size;
    }

    @Override
    public String getDescription(){
        return "Drink";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public double getGetPrice() {
        return getPrice;
    }

    public void setGetPrice(double getPrice) {
        this.getPrice = getPrice;
    }
}
