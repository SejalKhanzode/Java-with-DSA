package Pattern;

public class HollowDiamond {
        public static void main(String[] args) {
            for (int row=0 ; row<5 ; row++){
                for(int col=0; col<5-row-1 ; col++){
                   System.out.print(" ");
                }
                for(int col=0; col<2*row+1 ; col++){
                   if(col==0 || col==row*2)
                     System.out.print("*");
                   else
                     System.out.print(" ");
                }
                System.out.println();
            }
    
             for (int row=0 ; row<5 ; row++){
                for(int col=0; col<row ; col++){
                   System.out.print(" ");
                }
                for(int col=0; col<2*5-2*row-1 ; col++){
                   if(col==0 || col==2*5-2*row-2)
                     System.out.print("*");
                   else
                     System.out.print(" ");
                }
                System.out.println();
            }    
        }
    }

