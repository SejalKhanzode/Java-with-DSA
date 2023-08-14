package Pattern;

import java.util.Scanner;

public class NumericHollow {
    public static void main(String[] args) {
        int start = 1;
        Scanner sc= new Scanner(System.in);
     int n=sc.nextInt();
        for (int row = 0; row < n; row++) {
            for (int col = 0; col < n - row - 1; col++) {
                System.out.print(" ");
            }
            for (int col = 0; col < 2 * row + 1; col++) {
                if (row == 0 || row == 5 - 1) {
                    if (col % 2 == 0) {
                        System.out.print(start);
                        start = start + 1;
                    } else {
                        System.out.print(" ");
                    }

                } else {
                    if (col == 0) {
                        System.out.print("1");
                    } if (col == 2 * row) {
                        System.out.print(row);
                        start = start + 1;
                    } else {
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }
    }
}
