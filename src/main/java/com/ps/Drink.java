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
    public Drink(String name, String size){
        this.name = name;
        this.size = size;
    }

    public double getPrice(){

        // put logic for price for drink here
        switch (this.size.toLowerCase()){
            case "small" :

                return 2;

            case "midium":

                return 2.50;

            case "large":

                return 3;
            default:
                return 0;

        }


    }

    public String getSize(){
        return size;
    }

    public String getDescription(){
        return "Drink";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBasePrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setSize(String size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "Drink{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", size='" + size + '\'' +
                '}';
    }
}
