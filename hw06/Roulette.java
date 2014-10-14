//Jeff Litterst
//October 13, 2014
/* This program will ask the user to choose a number between 1 and 38 to bet on in Roulette. The program
will then go through a simulation in which it spins the Roulette wheel 100 times, with you betting on that same number each time.
It will run that simulation 1000 times, reporting your number of complete losses (number never comes up), 
your total earnings, and the number of times that each 100 spin simulation resulted in profit.
*/

//Import Scanner
import java.util.Scanner;

//Create a class
public class Roulette {
    
    //Create main method
    public static void main (String [] args) {
        
        //Declare and construct scanner class
        Scanner scan = new Scanner(System.in);
        
        /*Declare variables that represent winning for each simulation, total winnings, number of absolute losses, 
        a variable that creates a random number between 1 and 38, and a variable for your earnings each time your number is hit 
        */
        int spinWin = 36;
        int totalLoss = 0; 
        int winningsPerSimulation = 0;
        int totalWinnings = 0;
        int randomWinner = 0;
        
        //prompt user to enter an integer between 1 and 38 to bet on in Roulette
        System.out.print("Let's play a game of Roulette. Pick a number between 1 and 38  ");
        
        //Create if statement confirming user entered an int
        if (scan.hasNextInt()) {
            int userNumber = scan.nextInt();
            
            //Create if statement that only allows integers between 1 and 38
            if (userNumber >= 1 && userNumber <= 38) {
            
                //Create while loop that runs the 100 spin simulator 1000 times, using 1000 simulations as the sentinel variable
                int simulations = 0, nSimulations = 1000, profitableSimulation = 0;
                while (simulations < nSimulations) {
                    
                    winningsPerSimulation = 0;
                    int winsPerSimulation = 0;
                    int spins = 0, nSpins = 100;
                    
                    //Create while loop that spins Roulette wheel 100 times, using 100 spins as the sentinel variable.
                    while (spins < nSpins) {
                        
                        //Declare random number variable
                        randomWinner = (int) (Math.random()*37+1);
                        
                        //Create if statement that determines outcome of spin
                        if (userNumber == randomWinner) {
                            winsPerSimulation++;
                        }
                        spins++;
                    }
                    //Create if statement that calculates earnings if your number is hit 3 or more times.
                    if (winsPerSimulation > 2) {
                        winningsPerSimulation = (winsPerSimulation*spinWin)-100;
                        profitableSimulation++;
                    }
                    
                    //Create if statement that adds up instances in which your number is never hit
                    if (winsPerSimulation == 0) {
                        totalLoss++;
                    }
                    totalWinnings = totalWinnings + winningsPerSimulation;
                    simulations++;
                }
                //Print out absolute losses, total earnings, and number of profitable simulations.
                System.out.println("Your number of complete losses are:  "+totalLoss+"\nYour total winnings are:  $"+totalWinnings+"\nYour number of profitable simulations is:  "+profitableSimulation);
            }
            else {
                System.out.println("You did not enter a number within the given range");
                return;
            }
        }
        else {
            System.out.println("You did not enter a valid int");
            return;
        }
    }
}