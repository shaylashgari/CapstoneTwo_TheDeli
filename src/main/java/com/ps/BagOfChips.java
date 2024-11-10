package com.ps;

public class BagOfChips implements Product {
    private String chipName;
    private double price;

    public BagOfChips(String name){
        this.name = name;
        this.price = 1.50;
    }

    @Override
    public double getPrice(){
        return 0;
    }

    @Override
    public String getSize(){
        return "N/A";
    }

    // not sure why this one is gray

    @Override
    public String getDescription(){
        return "Chips";
    }

    public String getChipName() {
        return chipName;
    }

    public void setChipName(String chipName) {
        this.chipName = chipName;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
