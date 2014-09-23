//Jeff Litterst
//September 21, 2014
//Income Tax program in hw04
//This program will prompt the user to enter an int that corresponds to their 
//annual salary when multiplied by 1000.  Based on their entered int, the program
//will tell them their income tax percent as well as the actual tax on their income.

//Import scanner
import java.util.Scanner;

//Create a class
public class IncomeTax {
    
    //Create a main method
    public static void main (String [] args) {
        
        //Create income, tax percentage, and tax amount variables
        int income;
        double tax;
        int tax2;
        double taxAmount;
        int taxAmount2;
        
        //Declare scanner object
        Scanner myScanner;
        
        //Call scanner constructor to allow user input
        myScanner = new Scanner(System.in);
        
        //Prompt user to enter int corresponding to their annual income
        System.out.print("Enter an int giving your income in thousands  ");

        //Create if statement that confirms the int entered is an int
        if (myScanner.hasNextInt()) {
            income = myScanner.nextInt();
            //Create if statement that confirms that the int entered is greater than zero
            if (income > 0) {
              income = income*1000;
              //Create if statements that place int entered into corresponding tax bracket
              if (income < 20000) {
                  tax = 0.05;
                  taxAmount = income*tax;
                  tax = tax*100;
                  tax2 = (int) tax;
                  taxAmount = taxAmount*100;
                  taxAmount2 = (int) taxAmount;
                  taxAmount = taxAmount2/100.0;
                  System.out.println("the tax rate on $"+income+" is "+(tax2)+"%, and the tax is $"+taxAmount);
              }
              else if (income >= 20000 && income < 40000) {
                  tax = 0.07;
                  taxAmount = income*tax;
                  tax = tax*100;
                  tax2 = (int) tax;
                  taxAmount = taxAmount*100;
                  taxAmount2 = (int) taxAmount;
                  taxAmount = taxAmount2/100.0;
                  System.out.println("the tax rate on $"+income+" is "+(tax2)+"%, and the tax is $"+taxAmount);      
              }
              else if (income >= 40000 && income < 78000) {
                  tax = 0.12;
                  taxAmount = income*tax;
                  tax = tax*100;
                  tax2 = (int) tax;
                  taxAmount = taxAmount*100;
                  taxAmount2 = (int) taxAmount;
                  taxAmount = taxAmount2/100.0;
                  System.out.println("the tax rate on $"+income+" is "+(tax2)+"%, and the tax is $"+taxAmount);
              }
              else {
                  tax = 0.14;
                  taxAmount = income*tax;
                  tax = tax*100;
                  tax2 = (int) tax;
                  taxAmount = taxAmount*100;
                  taxAmount2 = (int) taxAmount;
                  taxAmount = taxAmount2/100.0;
                  System.out.println("the tax rate on $"+income+" is "+(tax2)+"%, and the tax is $"+taxAmount);
                  return;
              }
              
            }
            else {
                System.out.println("The int you entered is not greater than 0");
                return;
            }
        }
        else {
            System.out.println("You did not enter an integer");
            return;
        }
    }
}