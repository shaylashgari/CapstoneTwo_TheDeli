package com.ps;

import java.util.ArrayList;
import java.util.List;

// diffirent fields/ attributes

public class Order {
    private List<Sandwich> sandwich;
    private List<BagOfChips> chips;
    private List<Drink> drinks;

    // constructor

    public Order() {
        this.sandwich = new ArrayList<>();
        this.chips = new ArrayList<>();
        this.drinks = new ArrayList<>();
    }



    // Add methods

    public void addSandwich(Sandwich sandwich){
        this.sandwich.add(sandwich);
    }

    public void addChips(BagOfChips chips){
        this.chips.add(chips);
    }

    public void addDrinks(Drink drinks){
        this.drinks.add(drinks);
    }


    // Get method that returns list of items selected

    public List<Sandwich> getSandwich(){
        return this.sandwich;
    }


    public List<BagOfChips> getChips(){
        return this.chips;
    }

    public List<Drink> getDrinks(){
        return this.drinks;
    }

    // this method saves information in a file, it is empty now but it can be called later to be filled
    public void saveToFile(){

        }


        // ask Greg

   public static double getOrderTotal(){
       double orderTotal = 0;
       for(Sandwich sandwich: sandwiches){
           orderTotal +=  sandwich.getPrice();
       }
       return 0;
   }




}

