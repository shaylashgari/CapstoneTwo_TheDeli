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

//    @Override
//    public String getSize(){
//        return "N/A";
//    }
//
//    // not sure why this one is gray
//
//    @Override
//    public String getDescription(){
//        return "Chips";
//    }

    public String getChipName() {
        return name;
    }

    public void setChipName(String chipName) {
        this.name = chipName;
    }

}
