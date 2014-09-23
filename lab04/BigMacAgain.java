//Jeff Litterst
//September 17, 2014
//Lab 03
//This program will ask the user how many Big Macs they want to order. 
//Next, it will ask if they want an order of fries.  Based on their inputs,
//The program will give them the total cost of their meal.

//Import scanner into program
import java.util.Scanner;

//Create a class
public class BigMacAgain {
    
    //Create a main method
    public static void main (String [] args) {
        
        //Declare scanner object
        Scanner myScanner;
        
        //Declare variables
        int numberBigMacs;
        double costBigMac = 2.22;
        double costFries = 2.15;
        double totalCostBigMac;
        
        //Call scanner constructor to allow scanner to accept input
        myScanner = new Scanner(System.in);
        
        //Prompt user to enter the number of Big Macs they want to order
        System.out.print("How many Big Macs would you like to order?(integer>0)  ");
        
        //Check to make sure user entered an integer
        if(myScanner.hasNextInt()) {
            numberBigMacs = myScanner.nextInt(); //Accepts integer input
        }
        else {
            System.out.println("You did not enter an integer");
            return;
        }
        
        //Check to make sure integer is positive
        if (numberBigMacs > 0) {
            totalCostBigMac = costBigMac*numberBigMacs;
            totalCostBigMac = totalCostBigMac*100; //This line and next 2 allow for only 2 decimal places
            int totalCostBigMac2 = (int) totalCostBigMac;
            totalCostBigMac = totalCostBigMac2/100.0;
            System.out.println("You ordered "+numberBigMacs+" Big Macs for a cost of "+numberBigMacs+"*"+costBigMac+" = "+totalCostBigMac);
        }
        else {
            System.out.println("You entered an integer that is less than zero");
            return;
        }
        
        //Ask user if they want fries
        System.out.print("Would you like an order of fries?  ");
        
        //Accept user input
        String answer = myScanner.next();
        
        //Evaluate user's response of whether or not they want fries
        if (answer.equals("Y") || answer.equals("y")) {
            totalCostBigMac = totalCostBigMac + costFries;
            System.out.println("You ordered fries at a cost of:  "+costFries);
            System.out.println("The total cost of your meal is:  "+totalCostBigMac);
        }
        else if (answer.equals("N") || answer.equals("n")) {
            System.out.println("The total cost of your meal is:  "+totalCostBigMac);
        }
        else {
            System.out.println("You did not answer Y/y or N/n");
        }
        
    }
}