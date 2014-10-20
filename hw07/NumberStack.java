//Jeff Litterst
//October 20, 2014
/* This program will ask the user to input a number between 1 and 9, once entered, the program will use the number
to create a stack going from 1 to the entered number, with the number of rows of each number corresponding to that number,
and the number of that number in each row corresponding to the equation n + (n-1).  Each number will be separated by a line 
of dashes that has the same number of dashes as the row of numbers directly above it.  Three of these stacks will be formed,
one using only for loops, one using only while loops, and one using only do while loops. */

//Import scanner class
import java.util.Scanner;

//Create a class
public class NumberStack {
    
    //Create a main method
    public static void main (String [] args) {
        
        //Declare and construct scanner class
        Scanner scan = new Scanner(System.in);
        
        //Prompt user to enter an integer between 1 and 9
        System.out.print("Enter an integer between 1 and 9  ");
        
        //Confirm that an integer is entered
        if (scan.hasNextInt()) {
            
            //Accept user input
            int digit = scan.nextInt();
            
            //Confirm that integer entered is between 1 and 9
            if (digit >= 1 && digit <= 9) {
                
                //Create variables to be used in incrementation
                int numberPerRow = 1;
                int number = 1;
                int nRows;
                int row;
                
                //Create for loop that increments number from one to user's digit
                System.out.println("Using Only For loops:");
                for (number = 1; number <= digit; number++) {
                    
                    row = number;
                    nRows = row;
                    
                    //Create for loop that creates a number of rows corresponding to the number that is currently being printed
                    for (row = 1; row <= nRows; row++) {
                        
                        //Create for loop to determine how many of the number goes in each row
                        for (numberPerRow = 1; numberPerRow <= (number + (number-1)); numberPerRow++) {
                        
                        System.out.print(number);
                        
                        }
                        System.out.println("");
                    }
                        //Create for loop that creates number of dashes corresponding to the number of digits in the row directly above it
                        for (numberPerRow = 1; numberPerRow <= (number + (number-1)); numberPerRow++) {
                            
                            System.out.print("-");
                        }
                        System.out.println("");    
                }
                //Reset variables to be used for while loop section
                number = 1;
                numberPerRow = 1;
                row = 1;
                int dashes = 1;
                
                
                //Create while loop that increments from 1 to user's digit
                System.out.println("Using Only While loops:");
                while (number <= digit) {
                    row = 1;
                    dashes = 1;
                    nRows = number;
                    
                    //Create while loop that creates a number of rows corresponding to the number that is currently being printed
                    while (row <= nRows) {
                        numberPerRow = 1;
                        //Create while loop that determines how many of the number goes in each row
                        while (numberPerRow <= (number + (number-1))) {
                            
                            System.out.print(number);
                            numberPerRow++;
                        }
                        System.out.println("");
                        row++;
                    }
                    //Create while loop that creates number of dashes corresponding to the number of digits in the row directly above it
                    while (dashes <= number + (number-1)) {
                        System.out.print("-");
                        dashes++;
                    }
                    System.out.println("");
                    number++;
                }
                //Reset variables to be used for do-while loop section
                number = 1;
                numberPerRow = 1;
                row = 1;
                dashes = 1;
                
                //Create do-while loop that increments from 1 to user's digit
                System.out.println("Using Only Do-While loops:");
                do {
                    row = 1;
                    dashes = 1;
                    nRows = number;
                    
                    //create do-while loop that creates a number of rows corresponding to the number that is currently being printed
                    do {
                        numberPerRow = 1;
                        
                        //Create do-while loop that determines how many of the number goes in each row
                        do {
                            System.out.print(number);
                            numberPerRow++;
                        } while (numberPerRow <= (number + (number-1)));
                        
                        System.out.println("");
                        row++;
                    } while (row <= nRows);
                    //Create do-while loop that creates number of dashes corresponding to the number of digits in the row directly above it
                        do {
                            System.out.print("-");
                        dashes++;
                        } while (dashes <= number + (number-1));
                    System.out.println("");
                    number++;
                } while (number <= digit);
            }
            else {
                System.out.println("You did not enter an integer between 1 and 9, bro");
                return;
            }
        }
        else {
            System.out.println("An integer aint got no decimals dog, try again");
        }
    }
}