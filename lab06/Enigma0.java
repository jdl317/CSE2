//Jeff Litterst
//October 1, 2014
//For this lab, I'll be finding the errors within the below code and fix them so that the expected output actually occurs.
/*Sample of expected output:
 *   Enter an int- 9
 *   You entered 9
 *   sum is 25
 *   Again, you entered 9
 */

import java.util.Scanner;

public class Enigma0 {
    
  public static void main (String arg [] ){ 
      
    System.out.print("Enter an int- ");
    
    Scanner scan = new Scanner(System.in);
    
    int n = 0; // n should be given initial value outside of if statement in order to be used outside if statement.  Largest possible scope.
    
    if(scan.hasNextInt()){
        
      n = scan.nextInt(); //Already declared
      
      System.out.println("You entered "+n);
      
    }
    else{
        
      n=4; // Already declared
      
      System.out.println("You entered "+n);
    }
    
    int k=4,p=6,q=7,r=8; //Removed n from this line
    switch(k+p+q+r){
      case 24: 
      case 25: System.out.println("sum is 25");
      default:
        System.out.println("To repeat, you entered "+n);
    }
  }
}

/* Error report:
 The first error I found was that the variable n was declared within the if statement. This only allows n to be used within the if statement, 
 so in the else statement, n couldn't be used.  Once I declared n outside the if statement, I removed the int in front of every other n in the program,
 as it had already been declared.  Also, the variable n was declared in the second section of code, where k and the other variables were declared.
 I simply removed the variable n from there, because it seemed to hav no place there.
 */
