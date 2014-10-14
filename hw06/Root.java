//Jeff Litterst
//October 13, 2014
/* This program will ask the user to enter an integer.  Then, using the bisection method, in which a range of possible
solutions is narrowed down until the range itself is essentially the root, the program will calculate the square root 
of that integer.  The answer will be represented as a double.
*/

//Import scanner
import java.util.Scanner;

//Create a class
public class Root {
    
    //Create a main method
    public static void main (String [] args) {
        
        //Declare and construct Scanner
        Scanner scan = new Scanner(System.in);
        
        //Prompt user to enter an integer
        System.out.print("Enter an integer, and I'll compute its root  ");
        
        //Accept user input
        double number = scan.nextDouble();
        
        //Create variables to respresent maximum and minimum values of the range, as well as the middle of the range and the middle squared.
        double low = 0;
        double high = number + 1;
        double middle = (low + high)/2;
        double middleSquared = middle*middle;
        //Create variables to allow while loop to run until the root is found within the given degree of precision.
        int looper = 0;
        int capacity = 100;

        
        //Create while loop that runs if statement until middle is within 0.0000001 of the user's number
        while (looper < capacity) {
            //Create if statement that exits loop once degree of precision is achieved.
            if ((middleSquared <= (number + 0.0000001)) && (middleSquared >= (number - 0.0000001))) {
            System.out.println("root =  "+middle);
            break;
            }
            //Create if statement that compares middle to user's number, and narrows range based on if middle is higher or lower than user's number.
            else if (middleSquared > number) {
                high = middle;
            }
            else {
                low = middle;
            }
            middle = (low + high)/2;
            middleSquared = middle*middle;
            looper++;
        }
        
    }
}