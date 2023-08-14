package Practice_Que;

import java.util.Scanner;

public class Pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // Hollow Square
        // for (int i = 0; i < n; i++) {
        //     for (int j = 0; j < n; j++) {
        //         System.out.print("x ");
        //     }
        //     System.out.println();
        // } 

        // Hollow inverted half pyramid
        for (int row = 0; row < n; row++) {
            for (int col = 0; col < n; col++) {
                if(col == n-row-1 || col==0 || row==0){
                    System.out.print("x");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
