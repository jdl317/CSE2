//Jeff Litterst
//September 21, 2014
//Month program in hw04
//This program will ask the user to enter an int corresponding to the month of the year.
//Based on the input, the program will tell the user how many days are in that month.
//If February is chosen, the user will be asked to name the year, and based on that responce,
//the program will tell the user if February has 28 or 29 days during that year.

//Import scanner
import java.util.Scanner;

//Create a class
public class Month {
    
    //Create a main method
    public static void main (String [] args) {
        
        //Declare scanner object
        Scanner myScanner;
        
        //Call scanner constructor to accept user input
        myScanner = new Scanner(System.in);
        
        //Prompt user to enter an int corresponding to the month of the year
        System.out.print("Enter an int giving the number of the month (1-12)  ");
        
        //Confirm that number entered is an int
        if (myScanner.hasNextInt()) {
            int month = myScanner.nextInt();
            
            //Confirm that int falls within range
            if ((month > 0 && month < 2) || (month > 2 && month <13)) {
                
                //Create switch statement to determine the month
                switch (month) {
                    case 1:
                    case 3:
                    case 5:
                    case 7:
                    case 8:
                    case 10:
                    case 12: System.out.println("The month has 31 days"); break;
                    case 4:
                    case 6:
                    case 9:
                    case 11: System.out.println("The month has 30 days"); break;
                }
            }
            else if (month == 2) {
                
                //Prompt user to enter the year
                System.out.print("Enter the year  ");
                
                //Accept input
                double year = myScanner.nextDouble();
                
                //Create calculation that determines if the year chosen was a leap year
                double leapYear = year/4;
                double leaPYear = leapYear;
                int leapYear2 = (int) leapYear;
                double remainder = leaPYear - leapYear2;
                
                //Use if statement to determine if the year chosen was a leap year
                if (remainder == 0) {
                    System.out.println("The month has 29 days");
                }
                else {
                    System.out.println("The month has 28 days");
                    return;
                }
            }
            else {
                System.out.println("The integer you entered is not within the range");
                return;
            }
        }
        else {
            System.out.println("You did not enter an integer");
            return;
        }
    }
}