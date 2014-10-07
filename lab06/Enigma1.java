/* The user is supposed to enter a number between 0 and 99.
 * The program interprets that as a percentage, converts it to
 * a prorportion and then displays the proportion (out of 1) 
 * remaining. It does not always work. Find out when it doesn't
 */

import java.util.Scanner;

public class Enigma1{
    
  public static void main(String []arg){
      
    double percent;
    
    System.out.print("Enter a value for the percent (0, 1,...99)- ");
    
    double x=((new Scanner(System.in)).nextDouble());
    
   System.out.println("You entered "+x+"%");
   
   //CREATE EQUATION SO ALL INPUTS WILL GIVE PROPORTION
   double proportion = (100 - x)/100;
   
   //print out the proportion remaining for select percentages
   
   //ERRORS: Only the 5 or 6 values below produce a proportion. All others only give percent.  Also, numbers outside of the given range are accepted.
        if(x >= 0 && x <= 99) { //NEEDS CURLY BRACES
   
        System.out.println("The proportion remaining is "+proportion);
    
        }
        //NO ELSE AT THE END. ALSO DIDN'T PRODUCE ERROR STATEMENT FOR VALUES OUTSIDE OF NECESSARY RANGE.
        else {
            System.out.println("You did not enter a percent within the necessary range");
            return;
        }
   }
}

/* Error report: 
 This code had a couple errors.  First of all, though it claimed to give the remaining proportion after any percent is entered,
 the if statement and following else if statements only gave proportions for the 5 specific values given.  
 Also, the equation within the if statements was unnecessary in all its places, so I instead created an equation outside of the 
 if statement that works for any number entered.  Finally, the program accepted inputs outside of the given range, so I created an if/else 
 statement that rejects inputs outside of the given range.
 */
