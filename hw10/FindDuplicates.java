//Jeff Litterst
//November 16, 2014
/* Program Description */



import java.util.Scanner;

public class FindDuplicates{
    
    //Checks for any number of duplicates
    public static boolean hasDups(int[] num){

        //Begins by checking each member of array
        for (int i = 0; i < num.length; i++){
          
          //Compares member of array with all other members
          for (int j = i+1; j < num.length; j++){
            
            //Checks for duplicate.
            if (num[i] == num[j]){
              return true;
            }
            
            
          }
        }
        return false;
    }
       
            
    
    //Checks for only one duplicate.  Same exact thing as hasDups(), except that the method will only return true if only 1 duplicate is detected.
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
    
    public static void main(String [] arg){
      
    Scanner scan=new Scanner(System.in);
    
    int num[]=new int[10];
    
    String answer="";
    
    do{
      System.out.print("Enter 10 ints- ");
      
        for(int j=0;j<10;j++){
            num[j]=scan.nextInt();
        }
      
        String out="The array ";
        out+=listArray(num); //return a string of the form "{2, 3, -9}"   
            if(hasDups(num)){
                out+="has ";
            }
            else{
                out+="does not have ";
            }
        out+="duplicates.";
        System.out.println(out);
        out="The array ";
        out+=listArray(num);    
              if(exactlyOneDup(num)){
                out+="has ";
              }
              else{
                out+="does not have ";
              }
        out+="exactly one duplicate.";
        System.out.println(out); 
        System.out.print("Go again? Enter 'y' or 'Y', anything else to quit- ");
        answer=scan.next();
    }while(answer.equals("Y") || answer.equals("y"));
  }

  public static String listArray(int num[]){
    String out="{";
    for(int j=0;j<num.length;j++){
      if(j>0){
        out+=", ";
      }
      out+=num[j];
    }
    out+="} ";
    return out;
  }
}