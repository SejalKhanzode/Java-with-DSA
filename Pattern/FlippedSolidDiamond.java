package Pattern;

// import java.util.Scanner;
public class FlippedSolidDiamond {
    public static void main(String[] args) {
    //   Scanner sc= new Scanner(System.in);
    //  int n=sc.nextInt();
        for (int row=0 ; row<8 ; row++){
            for(int col=0; col<8-row ; col++){
               System.out.print("*");
            }
            for(int col=0; col<2*row+1 ; col++){
               System.out.print(" ");
            }
            for(int col=0; col<8-row ; col++){
               System.out.print("*");
            }
            System.out.println();
        }    


        for (int row=7; row>0 ; row--){
            for(int col=0; col<8-row ; col++){
               System.out.print("*");
            }
            for(int col=0; col<2*row+1 ; col++){
               System.out.print(" ");
            }
            for(int col=0; col<8-row ; col++){
               System.out.print("*");
            }
            System.out.println();
        }
    }
}
