package com.ps;

public class BagOfChips implements Product {
    private String name;


    public BagOfChips(String name){
        this.name = name;

    }

    @Override
    public double getPrice(){

        return 1.50;
    }



    public String getChipName() {
        return name;
    }

    public void setChipName(String chipName) {
        this.name = chipName;
    }

    @Override
    public String toString() {
        return "BagOfChips{" +
                "name='" + name + '\'' +
                '}';
    }
}
