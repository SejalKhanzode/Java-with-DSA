package Pattern;

public class Fancy {
    public static void main(String[] args) {
         for (int row=0 ; row<5 ; row++){
            for(int col=0; col<row+1 ; col++){
                System.out.print(row+1);    
                if(col!=row) {
                    System.out.print("*");  
                }       
            }
            System.out.println();
        }

        for (int row=0 ; row<5 ; row++){
            for(int col=0; col<5-row ; col++){
                System.out.print(5-row);  
                 if(col!=5-row-1) {
                    System.out.print("*");  
                }             
            }
            System.out.println();
        }
    }
}
