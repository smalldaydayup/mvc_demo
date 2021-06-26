package com.example.mvc_demo.algorithm.array;

/**
 * @author zhangkun.d
 */
public class FindLength {

    public static void main(String[] args) {
        int[] num1 = {1,2,3,2,1};
        int[] num2 = {3,2,1,4,7};
        int[] num3 = {3,1,4,7};
        int[] num4 = {8,5,4,7};

        System.out.println(findLength(num3, num4));
    }

        public static int findLength(int[] nums1, int[] nums2) {
            int minLen = 0;

            int len1 = nums1.length;
            int len2 = nums2.length;


            int len = len1 + len2 - 1;

            if (len1 > len2) {
                for (int i = 1; i <= len; i++) {
                    int eqLen = 0;
                    if (i > len1) {
                        int cnt = len2 + len1 - i;

                        for (int j = 0; j < cnt; j++) {

                            if (nums1[j + len1 - cnt] == nums2[j]) {
                                eqLen++;

                                if (eqLen > minLen) {
                                    minLen = eqLen;
                                }
                            }
                        }
                    } else {
                        int cnt = Math.min(i, len2);
                        for (int j = 0; j < cnt; j++) {
                            if (nums1[j + i - cnt] == nums2[len2 - cnt + j]) {
                                eqLen++;

                                if (eqLen > minLen) {
                                    minLen = eqLen;
                                }
                            }
                        }
                    }
                }
            } else {
                for (int i = 1; i <= len; i++) {
                    int eqLen = 0;
                    if (i > len2) {
                        int cnt = len2 + len1 - i;

                        for (int j = 0; j < cnt; j++) {

                            if (nums2[j + len2 - cnt] == nums1[j]) {
                                eqLen++;

                                if (eqLen > minLen) {
                                    minLen = eqLen;
                                }
                            }
                        }
                    } else {
                        int cnt = Math.min(i, len1);
                        for (int j = 0; j < cnt; j++) {
                            if (nums2[j + i - cnt] == nums1[len1 - cnt + j]) {
                                eqLen++;

                                if (eqLen > minLen) {
                                    minLen = eqLen;
                                }
                            }
                        }
                    }
                }
            }

            return minLen;
        }

}
