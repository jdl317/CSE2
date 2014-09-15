//Jeff Litterst
//September 10, 2014
//CSE2 Big Mac lab
//This program will ask the user to input the number of Big Macs they're buying, 
//the cost of each Big Mac, and the percentage tax.  
//The result will be that the program will calculate the total cost of the Big Macs


//Import Scanner class into program to allow user input
import java.util.Scanner;


    //Create a class
    public class BigMac {
    
        //Create a main method
        public static void main (String [] args) {
        
        //Declare Scanner object
        Scanner myScanner;
        
        //Call Scanner constructor to allow Scanner to receive user input
        myScanner = new Scanner(System.in);
        
        //Prompt user for number of Big Macs to be ordered
        System.out.print("Enter the number of Big Macs(integer > 0):  ");
        
        //Accept user input
        int nBigMacs = myScanner.nextInt();
        
        //Prompt user for cost of each Big Mac
        System.out.print("Enter the cost per Big Mac as a double (in the form of xx.xx):  ");
        
        //Accept user input
        double bigMac = myScanner.nextDouble();
        
        //Prompt user for percent tax
        System.out.print("Enter the percent tax as a whole number (xx):  ");
        
        //Accept user input
        double taxRate = myScanner.nextDouble();
        
        //Convert tax from whole number into its usable decimal
        taxRate/=100;
        
        //Print out the output
        double cost; //Full cost
        int dollars; //Whole dollar amount
        int dimes, pennies; //Stores decimals to the right of the decimal for the cost variable
        cost = nBigMacs*bigMac*(1+taxRate); // Gets full cost
        dollars = (int)cost;
        dimes = (int)(cost*10)%10;
        pennies = (int)(cost*100)%10;
        System.out.println("The total cost of "+nBigMacs+" Big Macs, at $"+bigMac+" per Big Mac, with a sales tax of "+taxRate*100+"%, is $"+dollars+'.'+dimes+pennies);
        
        
        }
    }