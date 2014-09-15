//Jeff Litterst
//September 10, 2014
//3rd Homework assignment
//Bicycle program

//Import Scanner class into program
import java.util.Scanner;


//Create a class
public class Bicycle {
    
    //Create a main method
    public static void main (String [] args) {
        
        //Declare scanner object
        Scanner myScanner;
        
        //Call Scanner constructor to allow Scanner to receive user input
        myScanner = new Scanner(System.in);
        
        //Write out constant variables to be used in equations
        double wheelDiameter=27.0,
        PI=3.14159,
        feetPerMile=5280,
        inchesPerFoot=12,
        secondsPerMinute=60;
        
        //Prompt user for number of counts on cyclometer
        System.out.print("Enter the number of counts:  ");
        
        //Accept input
        int counts = myScanner.nextInt();
        
        //Prompt user for the number of seconds of the trip
        System.out.print("Enter the number of seconds:  ");
        
        //Accept input
        int seconds = myScanner.nextInt();
        
        //Create equation to calculate trip distance in miles
        double distance = (counts*wheelDiameter*PI)/(inchesPerFoot*feetPerMile);
        //Allow for only 2 decimal places
        distance = distance*100;
        int Distance = (int)distance;
        distance = Distance/100.0;
        
        //Create equation to calculate trip time in minutes
        double tripTime = seconds/secondsPerMinute;
        //Allow for only 2 decimal places
        tripTime = tripTime*100;
        int triptime = (int)tripTime;
        tripTime = triptime/100.0;
        
        //Create equation to calculate MPH
        double MPH = distance/(tripTime/60);
        //Allow for only 2 decimal places
        MPH = MPH*100;
        int mph = (int)MPH;
        MPH = mph/100.0;
        
        //Print statements
        System.out.println("The distance was "+distance+" miles and took "+tripTime+" minutes");
        System.out.println("The average MPH was:  "+MPH+" MPH");
        
        
        
        
    }
}