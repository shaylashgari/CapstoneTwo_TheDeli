package com.ps;

import java.util.List;

public class Sandwich implements Product {
    private int size;
    private List<Topping> toppings;
    private boolean isToasted;
    private String typeBread;

    public Sandwich(int size, List<Topping> toppings, boolean isToasted, String typeBread) {
        this.size = size;
        this.toppings = toppings;
        this.isToasted = isToasted;
        this.typeBread = typeBread;
    }


    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public List<Topping> getToppings() {
        return toppings;
    }

    public void setToppings(List<Topping> toppings) {
        this.toppings = toppings;
    }

    public boolean isToasted() {
        return isToasted;
    }

    public void setToasted(boolean toasted) {
        isToasted = toasted;
    }

    public String getTypeBread() {
        return typeBread;
    }

    public void setTypeBread(String typeBread) {
        this.typeBread = typeBread;
    }

    @Override
    public double getPrice(){
        return 0;
    }
}
