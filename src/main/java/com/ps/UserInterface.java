package com.ps;

import java.util.ArrayList;
import java.util.HashMap;
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

    public static void getCustomerName (String name){
        customerName = name;}

   do{
        System.out.println("Please choose an option: ");
        System.out.println("1) New Order");
        System.out.println("2) Exit");

        System.out.println("Command: ");
        mainCommand = commandScanner.nextInt();

        switch (mainCommand){
            case 1:
                handleNewOrder();
            case 0:
                System.out.println("Exiting...");
            default:
                System.out.println("Command not found, please try again...");

        }

    }while( mainCommand != 2);

   private static void handleNewOrder(){
       System.out.println("1) Add Sandwich ");
       System.out.println("2) Add Drink");
       System.out.println("3) Add Chips");
       System.out.println("4) Checkout");
       System.out.println("0) Cancel Order ");

//       HashMap<Integer, String> newOrder = new HashMap<>();
//       newOrder.put(1, "Add Sandwich");
//       newOrder.put(2, "Add Drink");
//       newOrder.put(3, "Add Chips");
//       newOrder.put(4, "Checkout");
//       newOrder.put(0, "Cancel Order");

       System.out.println("Selection: ");
       Scanner commandScanner;
       int newOrderInput = commandScanner.nextInt();

       switch(newOrderInput) {
           case 1:
               handleAddSandwich():
               break;
           case 2:
               handleAddDrink();
               break;
           case 3:
               handleAddChips();
               break;
           case 4:
               handleCheckOut;
               break:
           case 0:
               System.out.println("Cancelling Order...");
               break;
           default:
               System.out.println("Command not found, please try again...");

       }
   }

    private static void handleAddSandwich() {
        System.out.println("Select your bread " + bread);
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
        //record customer drik choice
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
