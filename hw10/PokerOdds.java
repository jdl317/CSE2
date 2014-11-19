//Jeff Litterst
//November 17, 2014
/* This program will first create a hand of 5 cards.  It will then sort those cards based on rank and suit and print out the sorting.
Next, the program will simulate 10000 hands, printing out the number of single duplicates of each card, as well as the number of times that
not a single pair was achieved.*/

import java.util.Random;

import java.util.Scanner;

public class PokerOdds{
    
    public static int[] showOneHand(){

        //Initialize variables to sort cards
        String rank;
        
        String suit;
    
        //Array that represents the randomly generated hand
        int[] hand = new int[5];
        hand[0] = -1; hand[1] = -1; hand[2] = -1; hand[3] = -1; hand[4] = -1;

        String clubCard = "", diamondCard = "", heartCard = "", spadeCard = "";
        
        //Allocates values into each member of the hand array
        for(int i = 0; i < 5; i++){
            
            //Creates random number between 1 and 52, for each card in the deck
            int cardGenerator = (int) (Math.random()*52);
            
            if (i == 0){
                
                hand[i] = cardGenerator;

            }
            //These statements compare new members of the array to older ones. If they are equal, the new value is thrown out and recreated.
            else if (i == 1){
                
                if (hand[i] == hand[0]){
                    i--;
                }
                else{
                    hand[i] = cardGenerator;
                }
            }
            else if (i == 2){
                
                if (hand[i] == hand[0] || hand[i] == hand[1]){
                    i--;
                }
                else{
                    hand[i] = cardGenerator;
                }
            }
            else if (i == 3){
                
                if (hand[i] == hand[0] || hand[i] == hand[1] || hand[i] == hand[2]){
                    i--;
                }
                else{
                    hand[i] = cardGenerator;
                }
            }
            else{
                
                if (hand[i] == hand[0] || hand[i] == hand[1] || hand[i] == hand[2] || hand[i] == hand[3]){
                    i--;
                }
                else{
                    hand[i] = cardGenerator;
                }
            }
        
        }
        //Sorts each member of array into its respective suit.
        for (int k = 0; k < 5; k++){
        
            if (hand[k] < 13){
                suit = "Club";
            }
            else if (hand[k] >= 13 && hand[k] < 26){
                suit = "Diamond";
            }
            else if (hand[k] >= 26 && hand[k] < 39){
                suit = "Heart";
            }
            else{
                suit = "Spade";
            }
            //Sorts members of array by rank
            if (suit == "Club"){
                
                if (hand[k]%13 == 0){
                    rank = "A";
                }
                else if (hand[k]%13 == 1){
                    rank = "K";
                }
                else if (hand[k]%13 == 2){
                    rank = "Q";
                }
                else if (hand[k]%13 == 3){
                    rank = "J";
                }
                else if (hand[k]%13 == 4){
                    rank = "10";
                }
                else if (hand[k]%13 == 5){
                    rank = "9";
                }
                else if (hand[k]%13 == 6){
                    rank = "8";
                }
                else if (hand[k]%13 == 7){
                    rank = "7";
                }
                else if (hand[k]%13 == 8){
                    rank = "6";
                }
                else if (hand[k]%13 == 9){
                    rank = "5";
                }
                else if (hand[k]%13 == 10){
                    rank = "4";
                }
                else if (hand[k]%13 == 11){
                    rank = "3";
                }
                else{
                    rank = "2";
                }
                clubCard = clubCard + rank;
            }
            else if (suit == "Diamond"){
                
                if (hand[k]%13 == 0){
                    rank = "A";
                }
                else if (hand[k]%13 == 1){
                    rank = "K";
                }
                else if (hand[k]%13 == 2){
                    rank = "Q";
                }
                else if (hand[k]%13 == 3){
                    rank = "J";
                }
                else if (hand[k]%13 == 4){
                    rank = "10";
                }
                else if (hand[k]%13 == 5){
                    rank = "9";
                }
                else if (hand[k]%13 == 6){
                    rank = "8";
                }
                else if (hand[k]%13 == 7){
                    rank = "7";
                }
                else if (hand[k]%13 == 8){
                    rank = "6";
                }
                else if (hand[k]%13 == 9){
                    rank = "5";
                }
                else if (hand[k]%13 == 10){
                    rank = "4";
                }
                else if (hand[k]%13 == 11){
                    rank = "3";
                }
                else{
                    rank = "2";
                }
                diamondCard = diamondCard + rank;
            }
            else if (suit == "Heart"){
                
                if (hand[k]%13 == 0){
                    rank = "A";
                }
                else if (hand[k]%13 == 1){
                    rank = "K";
                }
                else if (hand[k]%13 == 2){
                    rank = "Q";
                }
                else if (hand[k]%13 == 3){
                    rank = "J";
                }
                else if (hand[k]%13 == 4){
                    rank = "10";
                }
                else if (hand[k]%13 == 5){
                    rank = "9";
                }
                else if (hand[k]%13 == 6){
                    rank = "8";
                }
                else if (hand[k]%13 == 7){
                    rank = "7";
                }
                else if (hand[k]%13 == 8){
                    rank = "6";
                }
                else if (hand[k]%13 == 9){
                    rank = "5";
                }
                else if (hand[k]%13 == 10){
                    rank = "4";
                }
                else if (hand[k]%13 == 11){
                    rank = "3";
                }
                else{
                    rank = "2";
                }
                heartCard = heartCard + rank;
            }
            else{
                if (hand[k]%13 == 0){
                    rank = "A";
                }
                else if (hand[k]%13 == 1){
                    rank = "K";
                }
                else if (hand[k]%13 == 2){
                    rank = "Q";
                }
                else if (hand[k]%13 == 3){
                    rank = "J";
                }
                else if (hand[k]%13 == 4){
                    rank = "10";
                }
                else if (hand[k]%13 == 5){
                    rank = "9";
                }
                else if (hand[k]%13 == 6){
                    rank = "8";
                }
                else if (hand[k]%13 == 7){
                    rank = "7";
                }
                else if (hand[k]%13 == 8){
                    rank = "6";
                }
                else if (hand[k]%13 == 9){
                    rank = "5";
                }
                else if (hand[k]%13 == 10){
                    rank = "4";
                }
                else if (hand[k]%13 == 11){
                    rank = "3";
                }
                else{
                    rank = "2";
                }
                spadeCard = spadeCard + rank;
            }
        }

        
            //Print out members of array in correct places
            System.out.println("Clubs:  "+clubCard);
            System.out.println("Diamonds:  "+diamondCard);
            System.out.println("Hearts:  "+heartCard);
            System.out.println("Spades:  "+spadeCard);
            
            return hand;
            
    }
    
    //Checks array to find whether or not a single duplicate is contained in the array
    public static boolean exactlyOneDup(int[] num){
      int duplicates = 0;
        for (int i = 0; i< num.length; i++){
          for (int j = i+1; j < num.length; j++){
            if (num[i] == num[j]){
              duplicates++;
            }
          }
        }
        if (duplicates == 1){
          return true;
        }
        else{
          return false;
        }
    }
    
    //Runs 10000 hand simulations, ultimately printing out numbers of single pairs of each card, as well as the number of non-single pairs.
    public static void simulateOdds(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter 'Y' or 'y' ");
        String input = scan.next();
        do{
        
        if (input.equals("Y") || input.equals("y")){
            showOneHand();
            System.out.println("Go again? Enter 'Y' or 'y', anything else to quit:  ");
            input = scan.next();
        }
        }while (input.equals("Y") || input.equals("y")); 
        
        int noDuplicates = 0, aceDuplicates = 0, kingDuplicates = 0, queenDuplicates = 0, jackDuplicates = 0, tenDuplicates = 0, nineDuplicates = 0, eightDuplicates = 0, sevenDuplicates = 0, sixDuplicates = 0, fiveDuplicates = 0, fourDuplicates = 0, threeDuplicates = 0, twoDuplicates = 0;
       for (int i = 0; i < 10000; i++){
            
            int[] hand = showOneHand();
            boolean oneDuplicate = exactlyOneDup(hand);
            
            if (oneDuplicate){
                
                //Finding specific duplicate
                if (hand[0] == hand[1] || hand[0] == hand[2] || hand[0] == hand[3] || hand[0] == hand[4]){
                    if (hand[0]%13 == 0){
                        aceDuplicates++;
                    }
                    else if (hand[0]%13 == 1){
                        kingDuplicates++;
                    }
                    else if (hand[0]%13 == 2){
                        queenDuplicates++;
                    }
                    else if (hand[0]%13 == 3){
                        jackDuplicates++;
                    }
                    else if (hand[0]%13 == 4){
                        tenDuplicates++;
                    }
                    else if (hand[0]%13 == 5){
                        nineDuplicates++;
                    }
                    else if (hand[0]%13 == 6){
                        eightDuplicates++;
                    }
                    else if (hand[0]%13 == 7){
                        sevenDuplicates++;
                    }
                    else if (hand[0]%13 == 8){
                        sixDuplicates++;
                    }
                    else if (hand[0]%13 == 9){
                        fiveDuplicates++;
                    }
                    else if (hand[0]%13 == 10){
                        fourDuplicates++;
                    }
                    else if (hand[0]%13 == 11){
                        threeDuplicates++;
                    }
                    else if (hand[0]%13 == 12){
                        twoDuplicates++;
                    }
                }
                else if (hand[1] == hand[2] || hand[1] == hand[3] || hand[1] == hand[4]){
                    
                    if (hand[1]%13 == 0){
                        aceDuplicates++;
                    }
                    else if (hand[1]%13 == 1){
                        kingDuplicates++;
                    }
                    else if (hand[1]%13 == 2){
                        queenDuplicates++;
                    }
                    else if (hand[1]%13 == 3){
                        jackDuplicates++;
                    }
                    else if (hand[1]%13 == 4){
                        tenDuplicates++;
                    }
                    else if (hand[1]%13 == 5){
                        nineDuplicates++;
                    }
                    else if (hand[1]%13 == 6){
                        eightDuplicates++;
                    }
                    else if (hand[1]%13 == 7){
                        sevenDuplicates++;
                    }
                    else if (hand[1]%13 == 8){
                        sixDuplicates++;
                    }
                    else if (hand[1]%13 == 9){
                        fiveDuplicates++;
                    }
                    else if (hand[1]%13 == 10){
                        fourDuplicates++;
                    }
                    else if (hand[1]%13 == 11){
                        threeDuplicates++;
                    }
                    else if (hand[1]%13 == 12){
                        twoDuplicates++;
                    }
                }
                else if (hand[2] == hand[3] || hand[2] == hand[4]){
                    if (hand[2]%13 == 0){
                        aceDuplicates++;
                    }
                    else if (hand[2]%13 == 1){
                        kingDuplicates++;
                    }
                    else if (hand[2]%13 == 2){
                        queenDuplicates++;
                    }
                    else if (hand[2]%13 == 3){
                        jackDuplicates++;
                    }
                    else if (hand[2]%13 == 4){
                        tenDuplicates++;
                    }
                    else if (hand[2]%13 == 5){
                        nineDuplicates++;
                    }
                    else if (hand[2]%13 == 6){
                        eightDuplicates++;
                    }
                    else if (hand[2]%13 == 7){
                        sevenDuplicates++;
                    }
                    else if (hand[2]%13 == 8){
                        sixDuplicates++;
                    }
                    else if (hand[2]%13 == 9){
                        fiveDuplicates++;
                    }
                    else if (hand[2]%13 == 10){
                        fourDuplicates++;
                    }
                    else if (hand[2]%13 == 11){
                        threeDuplicates++;
                    }
                    else if (hand[2]%13 == 12){
                        twoDuplicates++;
                    }
                }
                else if (hand[3] == hand[4]){
                    
                    if (hand[3]%13 == 0){
                        aceDuplicates++;
                    }
                    else if (hand[3]%13 == 1){
                        kingDuplicates++;
                    }
                    else if (hand[3]%13 == 2){
                        queenDuplicates++;
                    }
                    else if (hand[3]%13 == 3){
                        jackDuplicates++;
                    }
                    else if (hand[3]%13 == 4){
                        tenDuplicates++;
                    }
                    else if (hand[3]%13 == 5){
                        nineDuplicates++;
                    }
                    else if (hand[3]%13 == 6){
                        eightDuplicates++;
                    }
                    else if (hand[3]%13 == 7){
                        sevenDuplicates++;
                    }
                    else if (hand[3]%13 == 8){
                        sixDuplicates++;
                    }
                    else if (hand[3]%13 == 9){
                        fiveDuplicates++;
                    }
                    else if (hand[3]%13 == 10){
                        fourDuplicates++;
                    }
                    else if (hand[3]%13 == 11){
                        threeDuplicates++;
                    }
                    else if (hand[3]%13 == 12){
                        twoDuplicates++;
                    }
                }
            }
            //Adds one to the variable counting non-single pairs
            else{
                noDuplicates++;
            }
        }
        //Prints out all numbers of pairs and non-pairs
        System.out.println("rank       freq of exactly one pair");
        System.out.println("A          "+aceDuplicates);
        System.out.println("K          "+kingDuplicates);
        System.out.println("Q          "+queenDuplicates);
        System.out.println("J          "+jackDuplicates);
        System.out.println("10         "+tenDuplicates);
        System.out.println("9          "+nineDuplicates);
        System.out.println("8          "+eightDuplicates);
        System.out.println("7          "+sevenDuplicates);
        System.out.println("6          "+sixDuplicates);
        System.out.println("5          "+fiveDuplicates);
        System.out.println("4          "+fourDuplicates);
        System.out.println("3          "+threeDuplicates);
        System.out.println("2          "+twoDuplicates);
        System.out.println("-----------------------------------");
        System.out.println("total not exactly one pair  "+noDuplicates);
    }
    public static void main(String [] arg){
      
        showOneHand();
    
        simulateOdds();
    
    }
}
/* I had trouble running the 10000 simulations without printing out each hand individually.  Hence, when
you run the program, it will print 10000 hands, and then print what is expected. */