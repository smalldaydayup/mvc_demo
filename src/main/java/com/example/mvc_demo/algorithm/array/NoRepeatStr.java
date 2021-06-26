package com.example.mvc_demo.algorithm.array;

import java.util.HashMap;
import java.util.Map;

/**
 * @author zhangkun.d
 */
public class NoRepeatStr {

    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("pwwkew"));
    }

    public static int lengthOfLongestSubstring(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }

        char[] arr = s.toCharArray();

        return doLengthOfLongestSubstring(arr);
    }

    private static int doLengthOfLongestSubstring(char[] arr) {
        int len = arr.length;
        int end = 1;
        int cur = 1;
        int max = 1;


        Map<Character, Integer> indexMap = new HashMap<>();
        indexMap.put(arr[0], 0);

        while (end < len) {
            if (indexMap.containsKey(arr[end])) {
                int index = indexMap.get(arr[end]);
                end = index + 2;
                cur = 1;
                indexMap.clear();
                indexMap.put(arr[index + 1], index + 1);
            } else {
                cur += 1;
                indexMap.put(arr[end], end);
                if (max < cur) {
                    max = cur;
                }
                end ++;
            }
        }

        return max;
    }
}
