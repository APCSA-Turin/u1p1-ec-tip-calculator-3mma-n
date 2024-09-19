package com.example.project;
import java.util.Scanner;


public class ExtraCredit {

    public static String calculateTip(int people, int percent, double cost, String items) {
        StringBuilder result = new StringBuilder();

        // calculates each value to be printed
        double tip = cost * (percent / 100.0);
        double fullCost = cost + tip; 
        double costPer = cost / people;
        double tipPer = tip / people;
        double fullCostPer = fullCost / people;

        // rounds all values to 2 decimal places (after all the math so the math is still accurate)
        tip = Math.round(tip * 100) / 100.0;
        fullCost = Math.round(fullCost * 100) / 100.0;
        costPer = Math.round(costPer * 100) / 100.0;
        tipPer = Math.round(tipPer * 100) / 100.0;
        fullCostPer = Math.round(fullCostPer * 100) / 100.0;

        result.append("-------------------------------\n");
        result.append("Total bill before tip: $" + cost + "\n"); //concatenate to this string. DO NOT ERASE AND REWRITE
        result.append("Total percentage: " + percent + "%\n");
        result.append("Total tip: $" + tip + "\n");
        result.append("Total Bill with tip: $" + fullCost + "\n");
        result.append("Per person cost before tip: $" + costPer + "\n");
        result.append("Tip per person: $" + tipPer + "\n");
        result.append("Total cost per person: $" + fullCostPer + "\n");
        result.append("-------------------------------\n");
        
        //the two lines  should go below result.append("-------------------------------\n"); 
        result.append("Items ordered:\n");
        result.append(items);


        return result.toString();
    }
                                   
    public static void main(String[] args) {
        int people = 6;
        int percent = 25;
        double cost = 52.27;
        String items = ""; 
        
        Scanner scan = new Scanner(System.in);
        String newItem = "";

        //Your scanner object and while loop should go here

        // I learned how to use != from here: https://stackoverflow.com/questions/4775379/using-not-operator-in-if-conditions
        // I learned how to do string comparison from here: https://stackoverflow.com/questions/513832/how-do-i-compare-strings-in-java
        while (!newItem.equals("-1")) {
            System.out.println("Enter an item name or type -1 to finish:");
            newItem = scan.nextLine();
            if (!newItem.equals("-1")) {
                items += (newItem + "\n");
            }
        }
        scan.close();
        System.out.println(calculateTip(people,percent,cost,items));
    }
}
