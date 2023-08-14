package Array;

import java.util.Scanner;

public class MaxandMin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = { 1000, 11, 445, 1, 330, 3000 };

        // Arrays.sort(arr);
        // System.out.println(arr[0]);
        // System.out.println(arr[arr.length-1]);

        int max = 0, min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length - 1; j++) {
                if (arr[i] > max) {
                    max = arr[i];
                }
                if (arr[j] < min) {
                    min = arr[j];
                }
            }
        }
        System.out.println("max = " + max);
        System.out.println("min = " + min);
    }
}
