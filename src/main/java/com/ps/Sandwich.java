package com.ps;

import java.util.ArrayList;
import java.util.List;

public class Sandwich implements Product {
    private String bread;
    private List<String> meatToppings, cheeseToppings, regularToppings, sauce, sides, drinks, chips;
    private boolean isToasted;
    private int sandwichSize;

    boolean extraMeat;
    boolean extraCheese;


    public Sandwich(boolean extraMeat, boolean extraCheese) {
        meatToppings = new ArrayList<>();
        cheeseToppings = new ArrayList<>();
        regularToppings = new ArrayList<>();
        sauce = new ArrayList<>();
        sides = new ArrayList<>();
        drinks = new ArrayList<>();
        chips = new ArrayList<>();
        this.extraMeat = extraMeat;
        this.extraCheese = extraCheese;

    }

    public void addMeatTopping(String topping){
       // conditional logic where the topping needs to go, array list for sandwich I am currently making
        // create a class
        // do a different method for each of topping, just line below
        meatToppings.add(topping);

    }

    public void addCheeseTopping(String topping){
        cheeseToppings.add(topping);
    }

    public void addVeggieTopping(String topping){
        regularToppings.add(topping);
    }

    public void addSauce (String topping){
        sauce.add(topping);
    }

    public void addSides (String side){
        sides.add(side);
    }

    public void addDrinks (String drink){
        drinks.add(drink);
    }

    public void addChip (String chip){
        chips.add(chip);
    }







    @Override
    public double getPrice() {
        double totalPrice = 0;


        if (sandwichSize == 4 ){
            totalPrice += 5.50; // base
            totalPrice += 1;    // meat
            totalPrice += .75; // cheese

            if(extraMeat) {
                totalPrice += .50;

            }
            if (extraCheese){
                totalPrice += .30;
            }

        } else if (sandwichSize == 8) {
            totalPrice += 7.00; // base
            totalPrice += 2;    // meat
            totalPrice += 1.50; // cheese
            if(extraMeat){
                totalPrice += 1;
            }
            if (extraCheese){
                totalPrice += .60;
            }

        } else if (sandwichSize == 12) {
            totalPrice += 8.50; //base
            totalPrice += 3;    // meat
            totalPrice += 2.25;  // cheese

            if(extraMeat){
                totalPrice += 1.50;
            }if(extraCheese){
                totalPrice += .90;
            }
        }



        return totalPrice;

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

    @Override
    public String toString() {
        return "Sandwich{" +
                "bread='" + bread + '\'' +
                ", meatToppings=" + meatToppings +
                ", cheeseToppings=" + cheeseToppings +
                ", regularToppings=" + regularToppings +
                ", sauce=" + sauce +
                ", sides=" + sides +
                ", drinks=" + drinks +
                ", chips=" + chips +
                ", isToasted=" + isToasted +
                ", sandwichSize=" + sandwichSize +
                ", extraMeat=" + extraMeat +
                ", extraCheese=" + extraCheese +
                ", totalPrice= " + getPrice() +
                '}';
    }
}

