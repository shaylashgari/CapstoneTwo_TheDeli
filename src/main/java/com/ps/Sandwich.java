package com.ps;

import java.util.List;

public class Sandwich implements Product {
    private String bread;
    private List<String> meatToppings, cheeseToppings, regularToppings, sauce, sides;
    private boolean isToasted;
    private int sandwichSize;

    boolean extraMeat;
    boolean extraCheese;

    public Sandwich(boolean extraMeat, boolean extraCheese) {
        this.extraMeat = extraMeat;
        this.extraCheese = extraCheese;

    }

    public void addTopping(String topping){
       // conditional logic where the topping needs to go, array list for sandwich I am currently making

    }

    @Override
    public double getPrice() {
        int totalPrice = 0;

        // calculate price of sandwich here
        // if statement for size of sandwich
        // ticket price example, capstone prep

        if (sandwichSize == 4 ){

        }

        return 0;
    }


    public int getSize() {
        return this.sandwichSize;
    }

//    public String getDescription() {
//        return description;
//    }

    public String getBread() {
        return bread;
    }

    public void setBread(String bread) {
        this.bread = bread;
    }

    public List<String> getMeatToppings() {
        return meatToppings;
    }

    public void setMeatToppings(List<String> meatToppings) {
        this.meatToppings = meatToppings;
    }

    public List<String> getCheeseToppings() {
        return cheeseToppings;
    }

    public void setCheeseToppings(List<String> cheeseToppings) {
        this.cheeseToppings = cheeseToppings;
    }

    public List<String> getSauce() {
        return sauce;
    }

    public void setSauce(List<String> sauce) {
        this.sauce = sauce;
    }

    public List<String> getRegularToppings() {
        return regularToppings;
    }

    public void setRegularToppings(List<String> regularToppings) {
        this.regularToppings = regularToppings;
    }

    public boolean isToasted() {
        return isToasted;
    }

    public void setToasted(boolean toasted) {
        isToasted = toasted;
    }

    public List<String> getSides() {
        return sides;
    }

    public void setSides(List<String> sides) {
        this.sides = sides;
    }

    public int getSandwichSize() {
        return sandwichSize;
    }

    public void setSandwichSize(int sandwichSize) {
        this.sandwichSize = sandwichSize;
    }

    public boolean isExtraMeat() {
        return extraMeat;
    }

    public void setExtraMeat(boolean extraMeat) {
        this.extraMeat = extraMeat;
    }

    public boolean isExtraCheese() {
        return extraCheese;
    }

    public void setExtraCheese(boolean extraCheese) {
        this.extraCheese = extraCheese;
    }

}

