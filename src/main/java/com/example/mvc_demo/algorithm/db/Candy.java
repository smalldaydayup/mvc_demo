package com.example.mvc_demo.algorithm.db;

/**
 * 分发糖果
 * 
 * @author zhangkun.d
 */
public class Candy {

    public static void main(String[] args) {
        int[] arr = {1,2,2};

        System.out.println(candy(arr));
    }

    public static int candy(int[] ratings) {
        int[] dp = new int[ratings.length];
        dp[0] = 1;

        for (int i = 1; i < ratings.length; i++) {
            if (ratings[i] > ratings[i -1]) {
                dp[i] = dp[i-1] + 1;
            } else {
                dp[i] = 1;
            }
        }

        for (int i = ratings.length-2; i >=0; i--) {
            if (ratings[i] > ratings[i+1]) {
                dp[i] = Math.max(dp[i], dp[i + 1] + 1);
            }
        }

        int sum = 0;
        for (int i = 0; i < ratings.length; i++) {
            sum += dp[i];
        }

        return sum;
    }
}
