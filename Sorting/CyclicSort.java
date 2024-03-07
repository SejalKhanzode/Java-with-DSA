package Sorting;
import java.util.Arrays;

public class CyclicSort {
    public static void main(String[] args) {
        int[] arr= {5,3,2,4,1};
        cyclic(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void cyclic(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            int correct = arr[i]-1;
            if(arr[i] != arr[correct]){
                swap(arr, i , correct);
            }
        }
    }
    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
