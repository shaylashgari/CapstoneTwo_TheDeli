package com.ps;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.zip.CheckedOutputStream;

public class UserInterface {
    static final Scanner keyboard =new Scanner(System.in);
    static String customerName= "";

    public static List<Sandwich> sandwichOrder = new ArrayList<>();
    public static Order customerOrder = new Order(customerName);

    public static List<String> bread = new ArrayList<>();
    public static List<String> meatToppings = new ArrayList<>();
    public static List<String> cheeseToppings = new ArrayList<>();
    public static List<String> veggieToppings = new ArrayList<>();
    public static List<String> sauce = new ArrayList<>();
    public static List<String> sides = new ArrayList<>();

    static{
        bread.add("white");
        bread.add("wheat");
        bread.add("rye");
        bread.add("wrap");

        meatToppings.add("steak");
        meatToppings.add("ham");
        meatToppings.add("salami");
        meatToppings.add("roast beef");
        meatToppings.add("chicken");
        meatToppings.add("bacon");

        cheeseToppings.add("american");
        cheeseToppings.add("provolone");
        cheeseToppings.add("cheddar");
        cheeseToppings.add("swiss");

        veggieToppings.add("lettuce");
        veggieToppings.add("peppers");
        veggieToppings.add("onions");
        veggieToppings.add("tomatoes");
        veggieToppings.add("jalapenos");
        veggieToppings.add("cucumbers");
        veggieToppings.add("pickles");
        veggieToppings.add("guacamole");
        veggieToppings.add("mushrooms");

        sauce.add("mayo");
        sauce.add("mustard");
        sauce.add("ketchup");
        sauce.add("ranch");
        sauce.add("thousand island");
        sauce.add("vinaigrette");

        sides.add("au jus");
        sides.add("sauce");


    }

    public static void getCustomerName (String name){custumerName = name;}

    public static void homeScreen(){

    }



}
