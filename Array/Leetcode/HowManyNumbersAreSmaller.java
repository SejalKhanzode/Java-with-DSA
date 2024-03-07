// https://leetcode.com/problems/how-many-numbers-are-smaller-than-the-current-number/description/

package Array.Leetcode;

public class HowManyNumbersAreSmaller {
    public static void main(String[] args) {
        int[] nums= {8,1,2,2,3};       
        int[] smaller = new int[nums.length];
       
        for(int i=0;i<nums.length;i++){
             int count=0;
            for(int j=0;j<nums.length;j++){
                if(j!=i && nums[j]<nums[i]){
                    count++;
                }
            }
            smaller[i]=count;
            System.out.print(smaller[i] +" ");
        }
       
    }
    
}
