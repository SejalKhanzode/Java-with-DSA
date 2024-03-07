package Searching;

public class Floor {
    public static void main(String[] args) {
        int[] arr = { 2, 3, 5, 9, 14, 16, 18 };
        int size = arr.length;
        int target = 15;
        int index = floor(arr, size, target);

       
            System.out.println("Target floor value is at index " + index);
        
    }

    static char letters(int[] letters, int size, char target) {
        int start = 0;
        int end = size - 1;
        int mid = start + (end - start) / 2;

        while (start <= end) {
            char element = letters[mid];
            if (target == element) {
                return mid;
            } else if (target < element) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
            mid = start + (end - start) / 2;
        }

        return letters[start % letters.length];
    }
}
