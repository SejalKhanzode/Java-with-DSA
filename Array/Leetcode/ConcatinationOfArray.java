// https://leetcode.com/problems/concatenation-of-array/

package Array.Leetcode;

public class ConcatinationOfArray {
    public static void main(String[] args) {
        int[] nums = {1,3,2,1};
        int[] ans = concatination(nums);
        System.out.println(ans);
    }
    static int[] concatination(int[] nums){
        int[] ans = new int[2*nums.length];
        int n = nums.length;
        for(int i=0;i<ans.length;i++){
            ans[i] = nums[i];
            ans[i+n] = nums[i];
        }
        return ans;
    }
}
