//Jeff Litterst
//October 6, 2014
/* Insert System.out.println() statements in the code
 * below, displaying the status of n and k, which 
 * should help you identify when n  or k becomes 0 and causes
 * the program to crash
 */

import java.util.Scanner;

public class Enigma3{
    
  public static void main(String [] arg){
      
    int n=40,k=60;
    
    String out="";
    
    switch(k%14){
      case 12: 
      case 13: out+=13;
         break;
      default: out+=40;
          n/=3;
          k-=7;
          System.out.println("n= "+n+"\nk= "+k);
    }
    if(n*k%12< 12){
      n-=20;
      out+=n;
      System.out.println("n= "+n+"\nk= "+k);
    }
    if(n*n>k){
      n=42;
      out+=n+k;
      
    }
    else {
      n=45;
      out+=n+k;
      System.out.println("n= "+n+"\nk= "+k);
    }
    switch(n+k){
      case 114: 
        n-=11;
        k-=3;
        break;
      case 97:
        n-=14;
        k-=2;
        break;
      case 98:
        n/=5; System.out.println("n= "+n);
        k/=9; System.out.println("k= "+k);
      default:
        n-=3;
        k-=5; //This line makes k zero
        System.out.println("n= "+n+"\nk= "+k); //k is printed as zero here zero here
    }
     out+=1/n + 1/k;   
    System.out.println(out);
  }
}

/*
The error in this code is that, as there is no break statement after case 98 in the final switch statement,
the code continues into the default, causing k, which had just been reduced to 5, to become zero.  Line 60 
of this code causes the runtime error, by diving 1 by k, which has become zero.  The instruction here didn't say
to correct the error, so I choses to simply leave it as is, with my various print statements still in the code.

 */
