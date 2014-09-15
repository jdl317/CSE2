//Jeff Litterst
//September 10, 2014
//3rd Homework assignment
//Four Digits program

//Import Scanner class into program
import java.util.Scanner;


//Create a class
public class FourDigits {
    
    //Create a main method
    public static void main (String [] args) {
        
        //Declare scanner object
        Scanner myScanner;
        
        //Call Scanner constructor to allow Scanner to receive user input
        myScanner = new Scanner(System.in);
        
        //Prompt user to enter double with 4 digits after decimal
        System.out.print("Enter a number with four digits after the decimal and I'll reproduce those four digits:  ");
        
        //Accept input
        double fullDigit = myScanner.nextDouble();
        
        //Create integer value of the digit
        int fullDigit2 = (int) fullDigit;
        
        //Subtract int from double to get only decimal digits.  Bring decimals to left of decimal point
        double decimal = fullDigit - fullDigit2;
        decimal = decimal*10000;
        int decimal2 = (int) decimal;
        
        //Extract each digit individually by dividing and then using mod function to bring your digit of interest to the left of the decimal.
        //Finally, convert the double to an int, so only the digit of interest remains.
        double digit1 = (decimal/1000)%10;
        int digit1A = (int) digit1;
        double digit2 = (decimal/100)%10;
        int digit2A = (int) digit2;
        double digit3 = (decimal/10)%10;
        int digit3A = (int) digit3;
        double digit4 = (decimal)%10;
        int digit4A = (int) digit4;
        
        //Print out each digit individually
        System.out.println("  The first digit is: "+digit1A);
        System.out.println(" The second digit is: "+digit2A);
        System.out.println("  The third digit is: "+digit3A);
        System.out.println(" The fourth digit is: "+digit4A);
    }    
}        