//Jeff Litterst
//September 5, 2014
//Arithmetic Homework Assignment

//Define a class
public class Arithmetic{
    
    //Add a main method
    public static void main(String [] args) {
        
        //Enter assumptions (input variables)
        int nSocks=3; //Number of socks I bought
        int nGlasses=6; //Number of glasses I bought
        int nEnvelopes=1; //Number of envelopes I bought
        double sockCost$=2.58; //Cost of one pair of socks
        double glassCost$=2.29; //Cost for one glass
        double envelopeCost$=3.25; //Cost for one envelope
        double taxPercent=0.06; //PA sales tax
        
        //Calculations for the total cost of each item, and the sales tax for each total cost
        double totalSockCost$=nSocks*sockCost$; //Total cost of socks before tax
        double totalGlassCost$=nGlasses*glassCost$; //Total cost of glasses before tax
        double totalEnvelopeCost$=nEnvelopes*envelopeCost$; //Total cost of envelopes before tax
        double taxOnSocks=totalSockCost$*taxPercent; //Sales tax on sock purchase
        //The next 3 lines make it so the calculation for tax on socks only has 2 digits after the decimal
               taxOnSocks=taxOnSocks*100;
        int    taxOnSocks$=(int)taxOnSocks;
               taxOnSocks=taxOnSocks$/100.0;
        double taxOnGlass=totalGlassCost$*taxPercent; //Sales tax on glass purchase
        //The next 3 lines make it so the calculation for tax on glass only has 2 digits after the decimal
               taxOnGlass=taxOnGlass*100;
        int    taxOnGlass$=(int)taxOnGlass;
               taxOnGlass=taxOnGlass$/100.0;
        double taxOnEnvelopes=totalEnvelopeCost$*taxPercent; //Sales tax on envelope purchase
        //The next 3 lines make it so the calculation for tax on envelopes only has 2 digits after the decimal
               taxOnEnvelopes=taxOnEnvelopes*100;
        int    taxOnEnvelopes$=(int)taxOnEnvelopes;
               taxOnEnvelopes=taxOnEnvelopes$/100.0;
        
        //Calculations for the total cost, before tax
        double totalCostBeforeTax$=totalSockCost$+totalGlassCost$+totalEnvelopeCost$;
        
        //Calculations for the total tax, and total cost, including tax
        double totalTax$=totalCostBeforeTax$*taxPercent; //Total tax
        double totalCostAfterTax$=totalCostBeforeTax$+(totalCostBeforeTax$*taxPercent); //Total cost after tax
        //The next 3 lines make total tax calculation only have 2 digits after the decimal
               totalTax$=totalTax$*100;
        int    totalTax=(int)totalTax$;
               totalTax$=totalTax/100.0;
        //The next 3 lines make total cost calculation only have 2 digits after the decimal       
               totalCostAfterTax$=totalCostAfterTax$*100;
        int    totalCostAfterTax=(int)totalCostAfterTax$;
               totalCostAfterTax$=totalCostAfterTax/100.0;
        
        //Print out item being bought, how many of that item is being bought, and cost per item
        System.out.println("Item being bought:  Socks");
        System.out.println("How many of said item being bought:  "+nSocks+" ");
        System.out.println("Cost per item:  "+sockCost$+" ");
        System.out.println(" ");
        System.out.println("Item being bought:  Glasses");
        System.out.println("How many of said item being bought:  "+nGlasses+" ");
        System.out.println("Cost per item:  "+glassCost$+" ");
        System.out.println(" ");
        System.out.println("Item being bought:  Envelopes");
        System.out.println("How many of said item being bought:  "+nEnvelopes+" ");
        System.out.println("Cost per item:  "+envelopeCost$+" ");
        System.out.println(" ");
        System.out.println(" ");
        
        //Print out cost of each item, before tax, and tax on each item
        System.out.println("Cost of Socks before Sales Tax:  "+totalSockCost$+" ");
        System.out.println("Sales tax on Sock purchase:  "+taxOnSocks+" ");
        System.out.println(" ");
        System.out.println("Cost of Glasses before Sales Tax:  "+totalGlassCost$+" ");
        System.out.println("Sales tax on Glasses purchase:  "+taxOnGlass+" ");
        System.out.println(" ");
        System.out.println("Cost of Envelopes before Sales Tax:  "+totalEnvelopeCost$+" ");
        System.out.println("Sales tax on Envelope purchase:  "+taxOnEnvelopes+" ");
        System.out.println(" ");
        System.out.println(" ");
        
        //Print out total cost before tax, total tax, and total cost including tax
        System.out.println("Total cost before tax:  "+totalCostBeforeTax$+" ");
        System.out.println(" ");
        System.out.println("Total tax:  "+totalTax$+" ");
        System.out.println(" ");
        System.out.println("Total cost after tax:  "+totalCostAfterTax$+" ");
        
        
        
    }
}