package com.ps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;
import java.util.zip.CheckedOutputStream;

public class UserInterface {
    static final Scanner customerInput =new Scanner(System.in);
    static final Scanner commandScanner = new Scanner(System.in);
    static String customerName= "";

    public static List<Sandwich> sandwichOrder = new ArrayList<>();

    public static Order order = new Order();

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

    public static void getCustomerName (String name){
        customerName = name;}



public static void mainMenu() {

    int mainCommand=  0;

    do {
        System.out.println("Please choose an option: ");
        System.out.println("1) New Order");
        System.out.println("0) Exit");

        System.out.println("Command: ");
        mainCommand = commandScanner.nextInt();

        switch (mainCommand) {
            case 1:
                handleNewOrder();
                break;
            case 0:
                System.out.println("Exiting...");
                break;
            default:
                System.out.println("Command not found, please try again...");

        }

    } while (mainCommand != 0);
}

   private static void handleNewOrder() {

       int newOrderInput;

       do {

           System.out.println("1) Add Sandwich ");
           System.out.println("2) Add Drink");
           System.out.println("3) Add Chips");
           System.out.println("4) Checkout");
           System.out.println("0) Cancel Order ");


           System.out.println("Selection: ");
           newOrderInput = commandScanner.nextInt();

           switch (newOrderInput) {
               case 1:
                   handleAddSandwich();
                   break;
               case 2:
                   handleAddDrink();
                   break;
               case 3:
                   handleAddChips();
                   break;
               case 4:
                   handleCheckOut();
                   break;
               case 0:
                   System.out.println("Cancelling Order...");
                   break;
               default:
                   System.out.println("Command not found, please try again...");

           }
       } while (newOrderInput != 0);
   }

    private static void handleAddSandwich() {

        System.out.println("What bread type would you like?");
        System.out.println("1) White 2)Wheat 3) Rye 4) Wrap");
        String bread = customerInput.nextLine();

        System.out.println("What size would you like?");
        System.out.println("1) 4 inch 2) 8 inch 3) 12 inch");
        String size = customerInput.nextLine();

        System.out.println("What toppings would you like?");
        System.out.println(" ");

        // menus menus menus
        // present bread type
        // customer chooses bread type
        // record customer choice
        // present size options
        // record customer size choice
        //present topping choices: meat, cheese, other toppings, sauce,
        // ask if they want sandwich toasted

    }

    private static void handleAddDrink() {
        System.out.println("Add drink") ;
        // Show drink options
        //record customer drink choice
        // present drink sizes
        // record drink size

    }

    private static void handleAddChips() {
       // present chip options
        // record chip selection
    }

    private static void handleCheckOut(){
       //display order details and price
        // give options for 1)confirm 2)cancel
        // confirm) create receipt file and go back to the home screen
        // cancel) delete order and go back to the home screen

    }


}
