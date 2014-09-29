//Jeff Litterst
//September 27, 2014
/* This program will ask the user if they'd like a burger, soda, or fries.  
Based on their choice, the program will then give them choices of each. 
For example, if they order a burger, the program will ask if they'd like everything,
cheese, or nothing on it.  If they order soda, the program will ask them which type of soda,
based on the choices I give them.  If fries, the program will ask for large or small. */
//Import scanner into program
import java.util.Scanner;

//Create a class
public class BurgerKing {
    
    //Create a main method
    public static void main (String [] args) {
        
        //Declare scanner object
        Scanner myScanner;
        
        //Call scanner constructor to allow scanner to accept user input
        myScanner = new Scanner(System.in);
        
        //Ask user if they'd like a burger, fries, or a soda
        System.out.print("Would you like to order:\n\tA Burger (B or b)\n\tA Soda (S or s)\n\tOr Fries (F or f)?  ");
        
        //Accept user input
        String selection = myScanner.next();
        
        //Create boolean that only accepts single letter inputs
        boolean oneLetter = selection.length() == 1;
        
        //Create if statement that only allows program to take single letter inputs
        if (oneLetter) {
            
            //Create if statement that analyzes user input for either a burger, soda, or fries, or produces an error statement if an invalid character is entered
            if (selection.equals("B") || selection.equals("b")) {
                
                //Ask user if they'd like everything, cheese only, or nothing
                System.out.print("On your burger, would you like:\n\tEverything (E or e)\n\tCheese only (C or c)\n\tOr nothing (N or n)?  ");
                
                //Accept user input
                String burgerTopping = myScanner.next();
                
                //Create if statement that prints the user's choice of burger topping, or produces an error statement if user enters an incorrect character
                if (burgerTopping.equals("E") || burgerTopping.equals("e")) {
                    System.out.println("You selected a burger with all the toppings");
                }
                else if (burgerTopping.equals("C") || burgerTopping.equals("c")) {
                    System.out.println("You selected a burger with cheese");
                }
                else if (burgerTopping.equals("N") || burgerTopping.equals("n")) {
                    System.out.println("You selected a burger with no toppings");
                }
                else {
                    System.out.println("You entered an invalid character, so no burger for you");
                    return;
                }
            }
            else if (selection.equals("S") || selection.equals("s")) {
                
                //Prompt user to enter a choice of soda
                System.out.print("What type of soda would you like?\n\tCoke (C or c)\n\tDiet Coke (D or d)\n\tSprite (S or s)\n\tor Mountain Dew (M or m)  ");
                
                //Accept user input
                String sodaChoice = myScanner.next();
                
                //Create if statement that prints user's soda choice, or produces an error statement if an invalid character is entered
                if (sodaChoice.equals("C") || sodaChoice.equals("c")) {
                    System.out.println("You chose to drink Coke");
                }
                else if (sodaChoice.equals("D") || sodaChoice.equals("d")) {
                    System.out.println("You chose to drink Diet Coke");
                }
                else if (sodaChoice.equals("S") || sodaChoice.equals("s")) {
                    System.out.println("You chose to drink Sprite");
                }
                else if (sodaChoice.equals("M") || sodaChoice.equals("m")) {
                    System.out.println("You chose to drink Mountain Dew");
                }
                else {
                    System.out.println("You chose to drink nothing, because you entered an invalid character");
                    return;
                }
            }
            else if (selection.equals("F") || selection.equals("f")) {
                
                //Ask user if they'd like a large or small order of fries
                System.out.print("As far as the size of your fry order goes, would you prefer:\n\tLarge (L or l)\n\tor Small(S or s)?  ");
                
                //Accept user input
                String frySize = myScanner.next();
                
                //Create if statement that prints out user's fry size choice, or produces an error statement if an invalid character is entered
                if (frySize.equals("L") || frySize.equals("l")) {
                    System.out.println("You ordered a large order of fries");
                }
                else if (frySize.equals("S") || frySize.equals("s")) {
                    System.out.println("You ordered a small order of fries");
                }
                else {
                    System.out.println("You entered an invalid character, so you get no fries");
                    return;
                }
            }
            else {
                System.out.println("You didn't enter a valid character, so you don't get to eat or drink anything");
                return;
            }
        }
        else {
            System.out.println("You entered more than one letter");
            return;
        }
        /*I wanted to do a switch statement for the choices of soda, toppings, or fry size, but I knew I couldn't do that with a String.
        So I tried to change the String to a char, but there is no Scanner method nextChar(), so I didn't know what to do.
        Thus, I did a series of if statements. I hope that's sufficient.*/
        
    }
}