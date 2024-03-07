package Searching;

public class Ceiling {
    public static void main(String[] args) {
        int[] arr = { 2, 3, 5, 9, 14, 16, 18 };
        int size = arr.length;
        int target = 15;
        int index = ceiling(arr, size, target);

            System.out.println("Target ceiling value is at index " + index);
        
    }

    static int ceiling(int[] arr, int size, int target) {
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

        return start;
    }
}
