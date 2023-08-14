// Define two methods to print the maximum and the minimum number respectively among three numbers entered by the user.

package Methods;

import java.util.Scanner;

public class LargenSmall {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st :");
        int n1 = sc.nextInt();
        System.out.print("Enter 2nd :");
        int n2 = sc.nextInt();
        System.out.print("Enter 3rd :");
        int n3 = sc.nextInt();

        int large = large(n1, n2, n3);
        System.out.println("largest " + large);

         int small = small(n1, n2, n3);
        System.out.println("smallest " + small);
    }

    static int large(int n1, int n2, int n3) {
        int large = n1;
        if (n2 > large)
            large = n2;
        if (n3 > large)
            large = n3;
        return large;
    }

    static int small(int n1, int n2, int n3) {
        int small = n1;
        if (n2 < small)
            small = n2;
        if (n3 < small)
            small = n3;
        return small;
    }
}
