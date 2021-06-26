package com.example.mvc_demo.algorithm.db;

/**
 * 买卖股票的最佳时机
 *
 * @author zhangkun.d
 */
public class MaxProfit {

    public static void main(String[] args) {
        int[] arr = {7,6,4,3,1};
        System.out.println(maxProfit(arr));
    }

    public static int maxProfit(int[] prices) {
        int max = 0;

        // 当前的最小值
        int cur = prices[0];

        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > cur) {
                max = Math.max(max, prices[i] - cur);
            } else if(prices[i] < cur) {
                cur = prices[i];
            }
        }

        return max;
    }
}
