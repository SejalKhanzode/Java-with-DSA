// https://leetcode.com/problems/shuffle-the-array/

package Array.Leetcode;

public class ShuffletheArray {
    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 4, 4, 3, 2, 1 };
        int[] ans = shuffle(nums);
        System.out.println(ans);
    }

    static int[] shuffle(int[] nums) {
        int n = 4;
        int[] rev = new int[2*n];
        int j=0;
        for(int i=0;i<n;i++){
            rev[j] = nums[i];
            j+=2;
        }
        int k=1;
        for(int i=n;i<2*n;i++){
            rev[k] = nums[i];
            k+=2;
        }
        return rev;
    
    }
}
