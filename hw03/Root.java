//Jeff Litterst
//September 10, 2014
//3rd Homework assignment
//Root program

//Import Scanner class into program
import java.util.Scanner;

//Create a class
public class Root {
    
    //Create a main method
    public static void main (String [] args) {
        
        //Declare scanner object
        Scanner myScanner;
        
        //Call Scanner constructor to allow Scanner to receive user input
        myScanner = new Scanner(System.in);
        
        //Prompt user to enter a number as a double
        System.out.print("Enter a number and I'll find the cube root:  ");
        
        //Accept input
        double number = myScanner.nextDouble();
        
        //Create initial guess, and then create equations that get the guess progressively closer to the actual cube root of the number
        double guess = number/3;
        guess = (2*guess*guess*guess+number)/(3*guess*guess);
        guess = (2*guess*guess*guess+number)/(3*guess*guess);
        guess = (2*guess*guess*guess+number)/(3*guess*guess);
        guess = (2*guess*guess*guess+number)/(3*guess*guess);
        guess = (2*guess*guess*guess+number)/(3*guess*guess);
        
        //Prove that guess is accurate
        double answer = guess*guess*guess;
        
        //Print out final cube root guess
        System.out.println("the cube root is:  "+guess);
        System.out.println(guess+"*"+guess+"*"+guess+"="+answer);
    }
}