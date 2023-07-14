package com.driver;

public class Pizza {

    private int price;
    private boolean isVeg;
    private String bill;
    private int cheesePrice;
    private boolean cheeseAdded;
    private int toppingsPrice;
    private boolean toppingsAdded;
    private int bagPrice;
    private boolean bagAdded;

    private boolean isBillGenerated;

    public Pizza(boolean isVeg) {
        this.isVeg = isVeg;

        if (isVeg) price = 300;
        else price = 400;

        bill = "Base Price Of The Pizza: " + price + "\n";

        cheesePrice = 80;
        cheeseAdded = false;

        toppingsPrice = isVeg ? 70 : 120;
        toppingsAdded = false;

        bagPrice = 20;
        bagAdded = false;

        isBillGenerated = false;
        // your code goes here
    }

    public int getPrice() {
        return this.price;
    }

    public void addExtraCheese() {

        //add extra cheese price to bill, toggle cheeseAdded
        if (!cheeseAdded) {
            price += cheesePrice;
            cheeseAdded = true;
        }

    }

    public void addExtraToppings() {

        //add extra toppings price to bill, toggle toppingsAdded
        if (!toppingsAdded) {

            price += toppingsPrice;

            toppingsAdded = true;
        }

    }

    public void addTakeaway() {

        //add bag price to bill, toggle bagAdded
        if (!bagAdded) {
            price += bagPrice;
            bagAdded = true;
        }
    }

    public String getBill() {

        if (!isBillGenerated) {
            if(cheeseAdded)
                bill += "Extra Cheese Added: 80\n";

            if(toppingsAdded)
                bill += "Extra Toppings Added: " + toppingsPrice + "\n";

            if(bagAdded)
                bill += "Paperbag Added: " + bagPrice + "\n";

            bill += "Total Price: " + price+"\n";
            isBillGenerated = true;
        }
        return this.bill;
    }
}
