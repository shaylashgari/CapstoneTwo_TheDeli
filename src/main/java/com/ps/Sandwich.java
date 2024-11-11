package com.ps;

import java.util.List;

public abstract class Sandwich implements Product {
    private List<String> bread;
    private List<String> meatToppings, cheeseToppings, regularToppings, sauce, sides;
    private boolean isToasted;
    private String sandwichSize;
    private double extraMeat, extraCheese, price;

    public Sandwich(List<String> bread, List<String> meatToppings, List<String> regularToppings, List<String> sauce, List<String> cheeseToppings, List<String> sides, boolean isToasted, String sandwichSize, double extraCheese, double extraMeat, double price) {
        this.bread = bread;
        this.meatToppings = meatToppings;
        this.regularToppings = regularToppings;
        this.sauce = sauce;
        this.cheeseToppings = cheeseToppings;
        this.sides = sides;
        this.isToasted = isToasted;
        this.sandwichSize = sandwichSize;
        this.extraCheese = extraCheese;
        this.extraMeat = extraMeat;
        this.price = price;
    }

    @Override
    public double getPrice(){
    // use switch statement to getprice
        return 0;
    }

    @Override
    public String getSize() {
        return "";
    }

    public String getDescription() {
        return description;
    }

    public List<String> getBread() {
        return bread;
    }

    public void setBread(List<String> bread) {
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

    public String getSandwichSize() {
        return sandwichSize;
    }

    public void setSandwichSize(String sandwichSize) {
        this.sandwichSize = sandwichSize;
    }

    public double getExtraMeat() {
        return extraMeat;
    }

    public void setExtraMeat(double extraMeat) {
        this.extraMeat = extraMeat;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getExtraCheese() {
        return extraCheese;
    }

    public void setExtraCheese(double extraCheese) {
        this.extraCheese = extraCheese;
    }
}
