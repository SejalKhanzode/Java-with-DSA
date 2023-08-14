// https://leetcode.com/problems/richest-customer-wealth/

package Array.Leetcode;

public class RichestCustomerWealth {
    public static void main(String[] args) {
        int[][] accounts = { { 1, 5 }, { 7, 3 }, { 3, 5 } };
        int wealth = 0;
        for (int i = 0; i < accounts.length; i++) {
            int sum = 0;
            for (int j = 0; j < accounts[0].length; j++) {
                sum = sum + accounts[i][j];

            }
            if (sum > wealth) {
                wealth = sum;
            }
        }
        System.out.println(wealth);
    }

}
