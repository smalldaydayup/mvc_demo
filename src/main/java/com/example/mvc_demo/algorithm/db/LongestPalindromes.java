package com.example.mvc_demo.algorithm.db;

/**
 * 最长回文子串
 *
 * @author zhangkun.d
 */
public class LongestPalindromes {
    public static String maxStr = "";
    public static int max = 0;

    public static void main(String[] args) {
        System.out.println(new LongestPalindromes().longestPalindromeWithDp("aaaa"));
    }

    public String longestPalindromeWithDp(String s) {
        if (s.length() == 1) {
            return s;
        }

        char[] arr = s.toCharArray();
        int[] dp = new int[arr.length];
        dp[0] = 1;
        int max = 1;
        String maxStr = String.copyValueOf(arr, 0, 1);

        for (int i = 1; i < arr.length; i++) {
            int cur = dp[i - 1];

            if (arr[i] == arr[i - 1]) {
                dp[i] = 2;

            }

            if (i > 1 && arr[i] == arr[i - 2]) {
                dp[i] = 3;
            }

            if (cur > 1 && (i - cur) > 0 && arr[i - cur - 1] == arr[i]) {
                dp[i] = cur + 2;
            }

            if (dp[i] > max) {
                max = dp[i];
                maxStr = String.copyValueOf(arr, i - dp[i] + 1, dp[i]);
            }

        }

        return maxStr;
    }

    public String longestPalindrome(String s) {
        if (s == null) {
            return "";
        }
        if (s.length() == 1) {
            return s;
        }

        char[] arr = s.toCharArray();
        maxStr = String.copyValueOf(arr, 0, 1);
        max = 1;

        for (int i = 0; i < s.length(); i++) {
            findLongest(arr, i);
            findLongestV2(arr, i);
        }

        return maxStr;
    }

    private void findLongest(char[] arr, int index) {
        int i = index - 1;
        int j = index + 1;

        int maxS = 1;
        while (i >= 0 && j < arr.length && arr[i] == arr[j]) {

            maxS += 2;

            if (maxS > max) {
                max = maxS;
                maxStr = String.copyValueOf(arr, i, j - i + 1);
            }

            i--;
            j++;
        }


    }

    private void findLongestV2(char[] arr, int index) {
        int i = index;
        int j = index + 1;

        int maxS = 0;
        while (i >= 0 && j < arr.length && arr[i] == arr[j]) {

            maxS += 2;
            if (maxS > max) {
                max = maxS;
                maxStr = String.copyValueOf(arr, i, j - i + 1);
            }
            i--;
            j++;
        }
    }
}
