//Jeff Litterst
//November 3, 2014
/* This program does the exact same function as hw07, but using multiple methods. */

import java.util.Scanner;

public class BlockedAgain{
    
    //Method to confirm int
    public static int getInt(){
        
        Scanner scan = new Scanner(System.in);
        
        //Infinite while loop to allow multiple guesses
        while(true){
            
            //Prompt user to enter an integer between 1 and 9.
            System.out.print("\nEnter an integer between 1 and 9, inclusive:  ");
            
            //Accept user input
            String input = scan.next();
            
            //Confirm int
            boolean isItAnInt = checkInt(input);
            
            if (isItAnInt = false){
                System.out.print("You did not enter an int; try again:  ");
                
            }
            else{
                int digit = Integer.parseInt(input);
                
                int value = checkRange(digit);
                
                if (value == 0){
                    System.out.print("You did not enter an int in [1,9]; try again:  ");
                }
                else{
                    return value;
                }
                
            }
        }
    }
    
    //Method used to confirm int
    public static boolean checkInt(String input){
        
        Scanner scan = new Scanner(input);
        
        if(scan.hasNextInt()){
            return true;
        }
        else{
            return false;
        }

}
    
    //Method used to check range
    public static int checkRange(int input){
        

        //If statement only allowing int between 1 and 9
        if(input >=1 && input <= 9){
            
            return input;
        }
        else{
            
            return 0;
        }
         
    }
    
    //Method used to gather all separate blocks.
    public static void allBlocks(int input){

            //Call method block()
            block(input);

    }
    
    //Method used to create blocks
    public static void block(int input){
        
        int lineCounter = 1;
        int nRows;
        int row;
        int numberPerLine;
        
        for (lineCounter = 1; lineCounter <= input; lineCounter++){
            row = lineCounter;
            nRows = row;
            
            for (row = 1; row <= nRows; row++){
                
                //Call method line()
                line(nRows);
                
                
            }
            
            //For loop to create dashes after each block
            for (numberPerLine = 1; numberPerLine <= (nRows + (nRows-1)); numberPerLine++) {
                                
                System.out.print("-");
           
            

                }
                 System.out.println("");
        }  
        
        return;
    }
    
    //Method used to create each line in each block
    public static void line(int lines){
        int numberPerLine;
        
        for (numberPerLine = 1; numberPerLine <= (lines+(lines-1)); numberPerLine++){
            System.out.print(lines);
        }
        System.out.println("");
        
        return;
    } 
    
    public static void main(String []args){
        
    int m;
    
    //force user to enter int in range 1-9, inclusive.
    m = getInt();
    
    allBlocks(m);
    
    }
}
