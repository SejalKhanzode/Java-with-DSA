package Searching;

import java.util.Scanner;

public class Binary_search {
    public static void main(String[] args) {
        int[] arr = {5,7,7,7,7,8,8,10};
        int size = arr.length;
       int ans = binary(arr,size , 7);
    }

    static int binary(int[] arr, int size, int target) {
        int start = 0;
        int end = size - 1;
        int mid = start + (end - start) / 2;

        while (start <= end) {
            int element = arr[mid];
            if (target == element) {
                return mid;
            } else if (target < element) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
            mid = start + (end - start) / 2;
        }

        return -1;
    }
}
