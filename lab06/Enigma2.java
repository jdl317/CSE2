//Jeff Litterst
//October 6, 2014
//I am meant to find the error in this code, describe the error, and fix it such that the code runs properly.

import java.util.Scanner;

public class Enigma2{
    
  public static void main(String [] arg){
      
    int n=40,k=60;
    
    String out="";
    
    switch(n){
      case 12: 
      case 13: out+=13;
      case 40: out+=40;
    }
    
    System.out.println(out);
    
  }
}

/*
The java.lang exception tool helped me discover the error in this code by saying "/ by zero".  
This message told me that, while there is no compiler error, a runtime error occurs when a number
is divided by zero.  Thus, I simply removed the /0 portion of the code, and the error was fixed.
 */