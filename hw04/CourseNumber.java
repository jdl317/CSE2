//Jeff Litterst
//September 21, 2014
//Course Number program in hw04
//This program will ask the user to enter a 6-digit number that corresponds to a semester in a given year.
//The prgram will use the number to name the semester and year that the course was offered.

//Import scanner
import java.util.Scanner;

//Create a class
public class CourseNumber {
    
    //Create a main method
    public static void main (String [] args) {
        
        //Declare scanner object
        Scanner myScanner;
        
        //Call scanner constructor to accept user input
        myScanner = new Scanner(System.in);
        
        //Prompt user to enter 6-digit number corresponding to semester and year
        System.out.print("Enter a 6-digit number giving the course semester  ");
        
        //Accept user input
        double fullNumber = myScanner.nextDouble();
        
        //Extract individual digits from whole number
        double firstDigit = (fullNumber/100000)%10;
        int firsTDigit = (int) firstDigit;
        double secondDigit = (fullNumber/10000)%10;
        int seconDDigit = (int) secondDigit;
        double thirdDigit = (fullNumber/1000)%10;
        int thirDDigit = (int) thirdDigit;
        double fourthDigit = (fullNumber/100)%10;
        int fourtHDigit = (int) fourthDigit;
        double fifthDigit = (fullNumber/10)%10;
        int fiftHDigit = (int) fifthDigit;
        double sixthDigit = (fullNumber/1)%10;
        int sixtHDigit = (int) sixthDigit;
        
        //Create if statement that verifies the year is one between 1865 and 2014
        int year = (firsTDigit*1000)+(seconDDigit*100)+(thirDDigit*10)+(fourtHDigit);
        int semester = (fiftHDigit*10)+(sixtHDigit);
        if (year >= 1865 && year <= 2014) {
            
            //Create if statement that confirms number corresponds to a semester
            if (semester == 10 || semester == 20 || semester == 30 || semester ==40) {
                
                //Create switch statement that tells user appropriate year and semester of course
                switch (semester) {
                    case 10: System.out.println("The course was offered the Spring semester of "+year); break;
                    case 20: System.out.println("The course was offered the Summer 1 semester of "+year); break;
                    case 30: System.out.println("The course was offered the Summer 2 semester of "+year);break;
                    case 40: System.out.println("The course was offered the Fall semester of "+year); break;
                }
            }
            else {
                System.out.println("You did not enter a valid semester (Must be 10, 20, 30, or 40)");
                return;
            }
        }
        else {
            System.out.println("The year you entered is not within our range (1865-2014)");
            return;
        }

    }
}   