package com.ps;

import java.util.*;

public class UserInterface {
    static final Scanner customerInput = new Scanner(System.in);
    static final Scanner commandScanner = new Scanner(System.in);
    static String customerName = "";

    public static List<Sandwich> sandwichOrder = new ArrayList<>();
    public static Drink drink;

    public static Order order = new Order();

    public static List<String> breads = new ArrayList<>();
    public static List<String> meatToppings = new ArrayList<>();
    public static List<String> cheeseToppings = new ArrayList<>();
    public static List<String> veggieToppings = new ArrayList<>();
    public static List<String> sauces = new ArrayList<>();
    public static List<String> sides = new ArrayList<>();

    static {
        breads.add("white");
        breads.add("wheat");
        breads.add("rye");
        breads.add("wrap");

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

        sauces.add("mayo");
        sauces.add("mustard");
        sauces.add("ketchup");
        sauces.add("ranch");
        sauces.add("thousand island");
        sauces.add("vinaigrette");

        sides.add("au jus");
        sides.add("sauce");


    }

    public static void getCustomerName(String name) {
        customerName = name;
    }


    public static void mainMenu() {

        int mainCommand = 0;

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

        Sandwich sandwich = new Sandwich(false, false);

        int handleSandwichCommand = 0;
        do {

            System.out.println("What bread type would you like?");
            for (int i = 0; i < breads.size(); i++) {
                System.out.printf("%d) %s\n", i + 1, breads.get(i));
            }
            int breadIndex = customerInput.nextInt() - 1;
            sandwich.setBread(breads.get(breadIndex));
        } while (handleSandwichCommand != 0);


        do {
            int handleSizeCommand = 0;
            System.out.println("What size would you like?");
            System.out.println("4) 4 inch 8) 8 inch 12) 12 inch");

            try {
                handleSizeCommand = commandScanner.nextInt();
            } catch (InputMismatchException ime) {

                System.out.println(" Invalid selection, please try again.");
                commandScanner.nextLine();
            }


            switch (handleSizeCommand) {
                case 4:
                    sandwich.setSandwichSize(4);
                    break;
                case 8:
                    sandwich.setSandwichSize(8);
                    break;
                case 12:
                    sandwich.setSandwichSize(12);
                default:
                    System.out.println("Command not found, please try again...");
            }
        } while
        (handleSandwichCommand != 0);


        addMeatTopping(sandwich);
        isExtraMeat(sandwich);
        addCheeseTopping(sandwich);
        isExtraCheese(sandwich);
        addVeggieToppings(sandwich);
        addSauces(sandwich);
        addSides(sandwich);
        order.addProduct(sandwich);
    }




        private static void addMeatTopping (Sandwich sandwich) {
            System.out.println("What meat toppings would you like?");
            for (int i = 0; i < meatToppings.size(); i++) {
                System.out.printf("%d) %s\n", i + 1, meatToppings.get(i));
            }
            Integer meatToppingIndex = customerInput.nextInt() - 1;
            sandwich.addMeatTopping(meatToppings.get(meatToppingIndex));
        }


        public static void isExtraMeat(Sandwich sandwich){
            System.out.println("Would you like extra meat? 1) yes 2)no ");
            int response = customerInput.nextInt();
            if (response == 1){
                sandwich.setExtraMeat(true);

            }else if (response == 2){
                sandwich.setExtraMeat(false);
            }else {
                System.out.println("invalid choice");
            }

        }


        private static void addCheeseTopping (Sandwich sandwich) {
            System.out.println("What cheese toppings would you like?");
            for (int i = 0; i < cheeseToppings.size(); i++) {
                System.out.printf("%d) %s\n", i + 1, cheeseToppings.get(i));
            }
            Integer cheeseToppingIndex = customerInput.nextInt() - 1;
            sandwich.addCheeseTopping(cheeseToppings.get(cheeseToppingIndex));


        }


        private static void isExtraCheese(Sandwich sandwich){
            System.out.println("Would you like extra cheese? 1) yes 2) no");
            int response = customerInput.nextInt();
            if (response == 1){
                sandwich.setExtraCheese(true);
            } else if (response == 2) {
                sandwich.setExtraCheese(false);
            }else {
                System.out.println("invalid choice");

            }


        }

        private static void addVeggieToppings (Sandwich sandwich) {
            System.out.println("What veggie toppings would you like?");
            for (int i = 0; i < veggieToppings.size(); i++) {
                System.out.printf("%d) %s\n", i + 1, veggieToppings.get(i));
            }
            Integer veggieToppingIndex = customerInput.nextInt() - 1;
            sandwich.addVeggieTopping( veggieToppings.get(veggieToppingIndex));


        }

        private static void addSauces (Sandwich sandwich) {
            System.out.println("What sauce would you like?");
            for (int i = 0; i < sauces.size(); i++) {
                System.out.printf("%d) %s\n", i + 1, sauces.get(i));
            }
            Integer saucesIndex = customerInput.nextInt() - 1;
            sandwich.addSauce(sauces.get(saucesIndex));
            // add to order above

        }
        private static void isToasted (Sandwich sandwich){
            System.out.println("Would you like your sandwich toasted? 1) yes 2) no");
            int response = customerInput.nextInt();
            if (response == 1){
                sandwich.setToasted(true);
            } else if (response == 2) {
                sandwich.setToasted(false);

            }else {
                System.out.println("Invalid choice");
            }
        }


        private static void addSides (Sandwich sandwich) {
            System.out.println("What side would you like?");
            for (int i = 0; i < sides.size(); i++) {
                System.out.printf("%d) %s\n", i + 1, sides.get(i));
            }
            int sideIndex = customerInput.nextInt() - 1;
            sandwich.addSides(sides.get(sideIndex));
            // add to order above

        }


        private static void handleAddDrink () {

            Drink drink;

            String drinkSize = "";
            double drinkPrice = 0;

            System.out.println("What size would you like? ");
            System.out.println(" 1) small 2) midium 3) large");
            int sizeSelection = commandScanner.nextInt();

            if (sizeSelection == 1 ){
                drinkPrice = 2.00;
                drinkSize = "small";

            } else if (sizeSelection == 2) {
                drinkPrice = 2.50;
                drinkSize = "midium";

            } else if (sizeSelection == 3) {
                drinkPrice = 3.00;
                drinkSize = "large";
            }


            System.out.println("From list below, which drink would you like?");
            String[] drinkNames = {
                    "Coke","Lemonade","Sprite","Iced Tea"
            };
            for (int i = 0; i < drinkNames.length; i++) {
                System.out.println(i + 1 + ")" + drinkNames[i]);
            }

            int handleAddDrink = commandScanner.nextInt();
            int index = handleAddDrink - 1;
            order.addProduct(new Drink(drinkNames[index], drinkPrice, drinkSize ));

        }



        private static void handleAddChips () {

            BagOfChips chips;

            System.out.println("From list below, which bag of chips would you like?");
            String[] chipNames = {
                    "Sun Chips", "Pop Chips", "Kettle Brand Potato Chips", "Miss Vickie's"
            };
            for (int i = 0; i < chipNames.length; i++){
                System.out.println(i + 1 + ")" + chipNames[i]);
            }


            int handleAddChips = commandScanner.nextInt();
            int index = handleAddChips - 1;

            order.addProduct( new BagOfChips(chipNames[index]));

        }
            //
        private static void handleCheckOut () {

            System.out.println("Would you like to 1) Check out 2) Cancel ");
            int checkout;


            try{
                checkout = commandScanner.nextInt();
            }catch (InputMismatchException ime){
                System.out.println("selection not found, please try again.");

                return;
            }

            switch(checkout){
                case 1:
                    System.out.println("Your order details are: ");
                    for(Product product: order.getProducts()){
                        System.out.println(product);
                    }
                    double total = order.getOrderTotal();
                    String orderString = "";
                    for(Product product: order.getProducts()){
                        orderString += product;
                    }
                        FileManager.saveOrder(orderString);
                    System.out.println("Your order has been saved. ");
                    break;
                case 2:
                    System.out.println("Order cancelled.");
                    break;
                default:
                    System.out.println("selection not found, please try again");
                    break;
            }



            // ---> DISPLAY ORDER DETAILS AND PRICE
            // 2) CONFIRM: CREATE RECEIPT FILE & GO BACK TO HOME SCREEN

            // 3)CANCEL: DELETE ORDER AND GO BACK TO HOME SCREEN



        }


    }
