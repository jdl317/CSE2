//Jeff Litterst
//December 5, 2014
/* Program Description */

public class MatrixSorter{
    
    //Create 3d array
    public static int[][][] buildMat3d(){
        
        int [][][] mat3d = new int[3][][];
        
        //Creating rows and columns of 3d array
        for(int i = 0; i < mat3d.length; i++){
            mat3d[i] = new int[(i*2)+3][];
        }
        for(int i = 0; i < mat3d.length; i++){
            for(int j = 0; j < mat3d[i].length; j++){
                mat3d[i][j] = new int[i+j+1];
            }
        }
        
        return mat3d;
        
    }
    //Display array
    public static void show(int[][][] mat3d){
        
        //nested for loops print out each member of array
        for(int slab = 0; slab < mat3d.length; slab++){
            for(int row = 0; row < mat3d[slab].length; row++){
                for(int column = 0; column < mat3d[slab][row].length; column++){
                    mat3d[slab][row][column] = (int)(Math.random()*99);
                    System.out.print(mat3d[slab][row][column]+" ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
    //Find minimum value in entire array
    public static int findMin(int[][][] mat3d){
        int minValue = mat3d[0][0][0];
        
        //Nested for loop compares each member of array to other members
        for(int slab = 0; slab < mat3d.length; slab++){
            for(int row = 0; row < mat3d[slab].length; row++){
                for(int column = 0; column < mat3d[slab][row].length; column++){
                     if(mat3d[slab][row][column] < minValue){
                            minValue = mat3d[slab][row][column];
                        
                    }
                } 
            }
        }
       return minValue; 
    }
    
    //Sorts rows with insertion sort, members of rows with selection sort
    public static int[][] sort(int [][] mat3d){
        
        //Selection sort to sort members of rows in ascending order
        for(int row = 0; row < mat3d.length; row++){
            for(int column = 0; column < mat3d[row].length; column++){
                int minValue = mat3d[row][column];
                int minIndex = column;
                    
                for(int check = column+1; check < mat3d[row].length; check++){
                        
                    if(minValue > mat3d[row][check]){
                        minValue = mat3d[row][check];
                        minIndex = check;
                    }
                        
                }
                    
                if(minIndex != column){
                    mat3d[row][minIndex] = mat3d[row][column];
                    mat3d[row][column] = minValue;
                }
            } 
        }
        
        //insertion sorts sorts rows in ascending order
        for(int row = 0; row < mat3d.length; row++){
            int j = row;
            int[] temp;
            while(j > 0 && mat3d[j-1][0] > mat3d[j][0]){
                temp = mat3d[j-1];
                mat3d[j-1] = mat3d[j];
                mat3d[j] = temp;
                j--;
            }
            
        } 
      
    return mat3d;
    }
        
    
    
    public static void main(String arg[]){

        int mat3d[][][];
        mat3d = buildMat3d();
        show(mat3d);
        System.out.println("The smallest entry in the 3D matrix is "+
      			findMin(mat3d));
        System.out.println("After sorting the 3rd matrix we get");
        sort(mat3d[2]);
        
        for(int slab = 0; slab < mat3d.length; slab++){
            for(int row = 0; row < mat3d[slab].length; row++){
                for(int column = 0; column < mat3d[slab][row].length; column++){
                    System.out.print(mat3d[slab][row][column]+ " ");
                }
                System.out.println();
            }
            System.out.println();
        } 
    }
}