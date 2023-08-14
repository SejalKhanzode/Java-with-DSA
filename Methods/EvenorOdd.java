// Define a program to find out whether a given number is even or odd.

package Methods;

import java.util.Scanner;

public class EvenorOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Num :");
        int num = sc.nextInt();

        if (num == 0) {
            System.out.println("Neighter even nor odd");
        } else {
            Boolean number = findevenorodd(num);
            System.out.println("findevenorodd " + number);
        }

    }

    static Boolean findevenorodd(int num) {
        Boolean result;
        if (num % 2 == 0) {
            result = true;
        }

        else {
            result = false;
        }
        return result;
    }

}
