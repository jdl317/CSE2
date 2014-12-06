//Jeff Litterst
//December 5, 2014
/* Program description */
import java.util.Scanner;

public class PokerHands{
    
    public static void main(String[] args){
        
        Scanner scan = new Scanner(System.in);
        
        int [] hand = new int[5];
        
         int [] rankCounter = new int[13];
         
         for(int i = 0; i < rankCounter.length; i++){
             rankCounter[i] = 0;
         }
        
        for(int i = 0; i < 5; i++){
            
            int card;
            //Enter input to determine card
            System.out.println("Enter the suit: 'c', 'd', 'h', or 's'-  ");
            char suit = scan.next().charAt(0);
            System.out.println("Enter one of 'a', 'k', 'q', 'j', '10',...,'2'-  ");
            char rank = scan.next().charAt(0);
            
            //Determine number of card based on suit and rank
            if(suit == 'c'){
                
                switch(rank){
                    case 'a': card = 0; rankCounter[0]++; break;
                    case 'k': card = 1; rankCounter[1]++; break;
                    case 'q': card = 2; rankCounter[2]++; break;
                    case 'j': card = 3; rankCounter[3]++; break;
                    case '2': card = 12; rankCounter[4]++; break;
                    case '9': card = 5; rankCounter[5]++; break;
                    case '8': card = 6; rankCounter[6]++; break;
                    case '7': card = 7; rankCounter[7]++; break;
                    case '6': card = 8; rankCounter[8]++; break;
                    case '5': card = 9; rankCounter[9]++; break;
                    case '4': card = 10; rankCounter[10]++; break;
                    case '3': card = 11; rankCounter[11]++; break;
                    default: card = 4; rankCounter[12]++; break;
                }
            }
            else if(suit == 'd'){
                
                switch(rank){
                    case 'a': card = 13; rankCounter[0]++; break;
                    case 'k': card = 14; rankCounter[1]++; break;
                    case 'q': card = 15; rankCounter[2]++; break;
                    case 'j': card = 16; rankCounter[3]++; break;
                    case '2': card = 25; rankCounter[4]++; break;
                    case '9': card = 18; rankCounter[5]++; break;
                    case '8': card = 19; rankCounter[6]++; break;
                    case '7': card = 20; rankCounter[7]++; break;
                    case '6': card = 21; rankCounter[8]++; break;
                    case '5': card = 22; rankCounter[9]++; break;
                    case '4': card = 23; rankCounter[10]++; break;
                    case '3': card = 24; rankCounter[11]++; break;
                    default: card = 17; rankCounter[12]++; break;
                }
            }
            else if(suit == 'h'){
                
                switch(rank){
                    case 'a': card = 26; rankCounter[0]++; break;
                    case 'k': card = 27; rankCounter[1]++; break;
                    case 'q': card = 28; rankCounter[2]++; break;
                    case 'j': card = 29; rankCounter[3]++; break;
                    case '2': card = 38; rankCounter[4]++; break;
                    case '9': card = 31; rankCounter[5]++; break;
                    case '8': card = 32; rankCounter[6]++; break;
                    case '7': card = 33; rankCounter[7]++; break;
                    case '6': card = 34; rankCounter[8]++; break;
                    case '5': card = 35; rankCounter[9]++; break;
                    case '4': card = 36; rankCounter[10]++; break;
                    case '3': card = 37; rankCounter[11]++; break;
                    default: card = 30; rankCounter[12]++; break;
                }
            }
            else{
                
                switch(rank){
                    case 'a': card = 39; rankCounter[0]++; break;
                    case 'k': card = 40; rankCounter[1]++; break;
                    case 'q': card = 41; rankCounter[2]++; break;
                    case 'j': card = 42; rankCounter[3]++; break;
                    case '2': card = 51; rankCounter[4]++; break;
                    case '9': card = 44; rankCounter[5]++; break;
                    case '8': card = 45; rankCounter[6]++; break;
                    case '7': card = 46; rankCounter[7]++; break;
                    case '6': card = 47; rankCounter[8]++; break;
                    case '5': card = 48; rankCounter[9]++; break;
                    case '4': card = 49; rankCounter[10]++; break;
                    case '3': card = 50; rankCounter[11]++; break;
                    default: card = 43; rankCounter[12]++; break;
                }
            }
            
            hand[i] = card;

        }
        
       
        showOneHand(hand);
        
        
        int[] numberCounter = new int[5];
        
        //Set all values to 0
        for(int i = 0; i < numberCounter.length; i++){
            numberCounter[i] = 0;
        }
        
        //Determine number of each card rank
        for(int i = 0; i < rankCounter.length; i++){
            if(rankCounter[i] == 0){
                numberCounter[0]++;
            }
            else if(rankCounter[i] == 1){
                numberCounter[1]++;
            }
            else if(rankCounter[i] == 2){
                numberCounter[2]++;
            }
            else if(rankCounter[i] == 3){
                numberCounter[3]++;
            }
            else{
                numberCounter[4]++;
            }
        }
        
       
        
        //Full house
        if(numberCounter[2] == 1 && numberCounter[3] == 1){
            System.out.println("This hand is a full house");
        }
        
        //Pair
        if(numberCounter[2] == 1 && numberCounter[3] == 0){
            System.out.println("This hand has a pair");
        }
        
        if(numberCounter[2] == 2){
            System.out.println("This hand has two pairs");
        }
       
       //3 and 4 of a kind
        if(numberCounter[3] == 1 && numberCounter[2] == 0){
            System.out.println("This hand has three of a kind");
        }
        if(numberCounter[4] == 1){
            System.out.println("This hand has four of a kind");
        }
        
        //High card or Straight
        if(numberCounter[1] == 5){
            System.out.println("This hand has a straight");
        }
       
    }

public static void showOneHand(int hand[]){
	String suit[]={"Clubs:	", "Diamonds: ", "Hearts:   ","Spades:   "};
	String face[]={"A ","K ","Q ","J ","10 ","9 ","8 ","7 ","6 ","5 ",
  	"4 ","3 ","2 "};
	String out="";
	for(int s=0;s<4;s++){
  	out+=suit[s];
  	for(int rank=0;rank<13;rank++)
    	for(int card=0;card<5;card++)
     	if(hand[card]/13==s && hand[card]%13==rank)
      	out+=face[rank];
  	out+='\n';
	}
	System.out.println(out);
  }
}