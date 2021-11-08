// This program will help track product inventory using if-else statements (Jade Park - 5/29/2021)

import java.util.Scanner;
// Importing the java.text.* library to format any currency outputs to 2 decimal places
import java.text.*; 

public class InventoryTracking {
   public static void main(String[] args) {
   // Creating a scanner
   Scanner input = new Scanner(System.in);
   
   // Letting the user input what product they're checking the inventory of
   System.out.print("Enter the product: ");
   String product = input.next();
   
   // Letting the user input the quantity of the product they're requesting
   System.out.print("Enter the product quantity requested: ");
   double PQ = input.nextDouble();
   
   // Assigning a new variable calculating the total cost of the product (unit price being $7)
   double totalCostOfTheProduct = PQ * 7;
   
   // Utilizing the DecimalFormate class
   DecimalFormat decFormat = new DecimalFormat("$#,###.00");
   
   // Creating if-else statements to control what gets output depending on the quantity of the item the user requests and its availability
   if (PQ > 10) {
      System.out.println("The number of units requested, " + PQ + ", is not currently in stock. \nPlease try ordering your " + product + " when supplies are in stock.");
   } else if (PQ == 10) {
      System.out.println("We have 10 units of " + product + " available in stock. \nYour total cost is " + decFormat.format(totalCostOfTheProduct) );
   } else {
      System.out.println("You have requested " + PQ + " units of " + product + ". \nYour total cost is " + decFormat.format(totalCostOfTheProduct) + ". \nThere are " + (10 - PQ) + " units remaining in stock.");
   }
   
   }
}