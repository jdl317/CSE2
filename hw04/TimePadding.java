//Jeff Litterst
//September 21, 2014
//Time Padding program in hw04
//This program will ask the user to enter any number of seconds within a single day
//The program will then use the number of seconds to display the time of day that
//corresponds to that number of seconds.

//Import scanner
import java.util.Scanner;

//Create a class
public class TimePadding {
    
    //Create a main method
    public static void main (String [] args) {
        
        //Declare scanner object
        Scanner myScanner;
        
        //Call scanner constructor to accept user input
        myScanner = new Scanner(System.in);
        
        //Prompt user to enter a number of seconds
        System.out.print("Enter the time in seconds:  ");
        
        //Accept user input
        int seconds = myScanner.nextInt();

        //Create if statement that confirms number of seconds is within a single day
        if (seconds <= 86400) {
            int minutes = (seconds/60);
            int hours = (minutes/60);
            seconds = seconds - (minutes*60);
            minutes = minutes - (hours*60);
            
            //Create if statement adding 0 if number of minutes or seconds is less than 10
            if (minutes < 10 && seconds < 10) {
                System.out.println("The time is  "+hours+":0"+minutes+":0"+seconds);  
            }
            else if (minutes < 10 && seconds >= 10) {
                System.out.println("The time is  "+hours+":0"+minutes+":"+seconds);
            }
            else if (minutes >= 10 && seconds < 10) {
                System.out.println("The time is  "+hours+":"+minutes+":0"+seconds);
            }
            else {
            System.out.println("The time is  "+hours+":"+minutes+":"+seconds);
            return;
            }
        }
        else {
            System.out.println("You entered more seconds than there are in a single day");
            return;
        }
    }
}    