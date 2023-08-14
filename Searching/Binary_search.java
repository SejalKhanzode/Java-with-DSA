package Searching;

import java.util.Scanner;

public class Binary_search {
    public static void main(String[] args) {
        int[] arr = { 1, 11, 330, 445, 1000, 3000 };
        int size = arr.length;
        int target = 1000;
        int index = binary(arr, size, target);
        
        if(index == -1){
            System.out.println(" Target not found");
        }
        else{
            System.out.println(" Target found at "+index);
        }
    }

    static int binary(int[] arr, int size, int target) {
        int start = 0;
        int end = size;
        int mid = (start + end) / 2;

        while (start <= end) {
            int element = arr[mid];
            if (element == arr[mid]) {
                return mid;
            } else if (element < arr[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
            mid = (start + end) / 2;

        }

        return -1;

    }
}
