//Jeff Litterst
//October 27, 2014
/* This program is meant to help us learn to write methods.  First, the program will ask the user to enter C or c.  
The program will then ask the user to enter Y, y, N, or n, giving the user 5 attempts.  Finally, the program will 
ask the user to enter a number between 0 and 9.  The first and third prompts give the user unlimited attempts.  
This program will print out the user inputs. 
*/

//Import scanner object
import java.util.Scanner;

//Create a class
public class HW8{
    
    //Create method that accepts only string input
    public static char getInput(Scanner scan, String characters){
          
        //Create infinite while loop so user can try as many times as possible    
        while(true) {
           
           //Accept user input
           String input = scan.next();
           
           //Create if statement only allowing inputs of one character
           if (input.length() == 1) {
           
                char inputChar = input.charAt(0);
               
               //If statement that allows for only given inputs
               if (inputChar == characters.charAt(0) || inputChar == characters.charAt(1)) {
                   return inputChar;
               }
               else {
                   System.out.println("You did not enter a character from the list "+characters + "; try again- ");
               }
            }   
            else {
                System.out.print("You should only enter one character- ");
            }
       }

    }
    
    //Method accepts string, and has a limit of attempts
    public static char getInput(Scanner scan, String characters, int iterations){
        
        //For loop allowing for 5 attempts
        for (int i = 0; i < iterations; i++) {
            String input = scan.next();
            
            //If statement only allowing for inputs of a single character
            if (input.length() == 1){
                char inputChar = input.charAt(0);
                
                //If statement allowing only for given inputs
                if (inputChar == characters.charAt(0) || inputChar == characters.charAt(1) || inputChar == characters.charAt(2) || inputChar == characters.charAt(3)){
                    return inputChar;
                }
                else{
                    System.out.println("You did not enter a character from the list "+characters + "; try again- ");
                }
            }
            else{
                System.out.print("You should only enter one character- ");
            }
        }
        System.out.println("You failed after 5 tries");
        return ' ';

    }
    
    //Method that prompts user and accepts string input.
    public static char getInput(Scanner scan, String prompt, String characters){
        
        //Infinite while loop to allow for infinite attempts
        while(true){
            System.out.print(prompt);
            System.out.print("\nEnter one of: ");
            
            //For loop choosing each possible character individually, allowing for all possible characters to be printed out and shown to user
            for (int k = 0; k < characters.length(); k++){
                System.out.print("'"+characters.charAt(k)+"',");
            }
            System.out.print(": ");
            String input = scan.next();
            
            if (input.length() == 1){
                char inputChar = input.charAt(0);
                
                //I discovered this today. This if statement will accept any inputChar value that is within the string characters. 
                if (characters.indexOf(inputChar) != -1){
                    return inputChar;
                }
                else{
                    System.out.print("You did not enter an acceptable character\n");
                }
            }
            else{
                System.out.print("Enter only one character\n");
            }
        }

    }
    
    //Create main method
  public static void main(String []arg){
	
	//Create variable that takes user input
	char input;
	
	//Declare and construct scanner
	Scanner scan=new Scanner(System.in);
	
	System.out.print("Enter 'C' or 'c' to continue, anything else to quit- ");
	
	//Create variable to call 1st method
	input= getInput(scan,"Cc");
	
	System.out.println("You entered '"+input+"'");
	
	System.out.print("Enter 'y', 'Y', 'n', or 'N'- ");
	
	//Variable to call 2nd method
	input= getInput(scan,"yYnN",5); //give up after 5 attempts
	
	if(input !=' '){
   	
   	System.out.println("You entered '"+input+"'");
	}
	else{
	    return;
	}
	
	//Variable to call 3rd method
	input=getInput(scan,"Choose a digit.","0123456789");
	
	System.out.println("You entered '"+input+"'");
  }  
}