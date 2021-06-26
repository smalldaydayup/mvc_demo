package com.example.mvc_demo.algorithm.db;

/**
 * 买卖股票的最佳时机 V2
 *
 * @author zhangkun.d
 */
public class MaxProfitV2 {

    public static void main(String[] args) {
        int[] arr = {7,6,4,3,1};
        System.out.println(maxProfit(arr));
    }

    public static int maxProfit(int[] prices) {

        int max = 0;
        int cur = prices[0];

        for (int i = 0; i < prices.length; i++) {
            if (prices[i] > cur) {
                max += (prices[i] - cur);
                cur = prices[i];
            } else if (prices[i] < cur) {
                cur = prices[i];
            }
        }

        return max;
    }
}
