//Jeff Litterst
//September 27, 2014
/* With this program, I will assign three boolean variables to either true or false, and then I'll 
randomly combine them with && or || to produce a final statement that is either true or false. After 
storing the result, the program will ask the user whether each statement is true or false, telling them 
whether they are right or wrong.*/
//Import scanner into program
import java.util.Scanner;

//Create a class
public class BoolaBoola {
    
    //Create a main method
    public static void main (String [] args) {
        
        //Declare scanner object
        Scanner myScanner;
        
        //Call scanner constructor to allow scanner to accept user input
        myScanner = new Scanner(System.in);
        
        //Declare 3 boolean variables to either true or false
        boolean one = true;
        boolean two = false;
        boolean three = true;
        
        //Create 3 random equations with a final answer of either true or false
        boolean uno = two || three && one;
        boolean dos = one && two || three;
        boolean tres = three && two && one;
        
        //Ask user if each statement is true or false
        System.out.print("Does false || true && true have the value true (T or t) or false (F or f)?  ");
        
        //Accept user input
        String answerOne = myScanner.next();
        
        //Create if statement that only allows T,t,F,f as answers
        if (answerOne.equals("T") || answerOne.equals("t") || answerOne.equals("F") || answerOne.equals("f")) {
            
            //Create if statement comparing first response to first equation and telling user whether they were right or wrong
            if (answerOne.equals("T") || answerOne.equals("t") && uno == true) {
                System.out.println("Correct");
            }
            else if (answerOne.equals("T") || answerOne.equals("t") && uno == false) {
                System.out.println("Sorry, try again");
            }
            else if (answerOne.equals("F") || answerOne.equals("f") && uno == true) {
                System.out.println("Sorry, try again");
            }
            else {
                System.out.println("Correct");
                return;
            }
        }
        else {
            System.out.println("Invalid character");
            return;
        }
        //Ask user if each statement is true or false
        System.out.print("Does true && false || true have the value true (T or t) or false (F or f)?  ");
        
        //Accept user input
        String answerTwo = myScanner.next();
        
        //Create if statement that only allows T,t,F,f as answers
        if (answerTwo.equals("T") || answerTwo.equals("t") || answerTwo.equals("F") || answerTwo.equals("f")) {
            
            //Create if statement comparing second response to second equation and telling user whether they were right or wrong
            if (answerTwo.equals("T") || answerTwo.equals("t") && dos == true) {
                System.out.println("Correct");
            }
            else if (answerTwo.equals("T") || answerTwo.equals("t") && dos == false) {
                System.out.println("Sorry, try again");
            }
            else if (answerTwo.equals("F") || answerOne.equals("f") && dos == true) {
                System.out.println("Sorry, try again");
            }
            else {
                System.out.println("Correct");
                return;
            }
        }
        else {
            System.out.println("Invalid character");
            return;
        }
        //Ask user if each statement is true or false
        System.out.print("Does true && false && true have the value true (T or t) or false (F or f)?  ");
        
        //Accept user input
        String answerThree = myScanner.next();
        
        //Create if statement that only allows T,t,F,f as answers
        if (answerThree.equals("T") || answerThree.equals("t") || answerThree.equals("F") || answerThree.equals("f")) {
            
            //Create if statement comparing third response to third equation and telling user whether they were right or wrong
            if (answerThree.equals("T") || answerThree.equals("t") && tres == true) {
                System.out.println("Correct");
            }
            else if (answerThree.equals("T") || answerThree.equals("t") && tres == false) {
                System.out.println("Sorry, try again");
            }
            else if (answerThree.equals("F") || answerThree.equals("f") && tres == true) {
                System.out.println("Sorry, try again");
            }
            else {
                System.out.println("Correct");
                return;
            }
        }
        else {
            System.out.println("Invalid character");
            return;
        }
    }
}