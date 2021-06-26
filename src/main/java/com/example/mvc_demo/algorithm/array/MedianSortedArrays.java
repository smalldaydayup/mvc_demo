package com.example.mvc_demo.algorithm.array;

/**
 * @author zhangkun.d
 */
public class MedianSortedArrays {
    public static void main(String[] args) {
        int[] nums1 = new int[]{1, 2};
        int[] nums2 = new int[]{3, 4};
        System.out.println(findMedianSortedArrays(nums1, nums2));
    }

    public static double findMedianSortedArraysV2(int[] nums1, int[] nums2) {
        if (nums1.length == 0) {
            return findMedianSortedArray(nums2);
        }

        if (nums2.length == 0) {
            return findMedianSortedArray(nums1);
        }

        int len1 = nums1.length;
        int len2 = nums2.length;

        int mid = (len1 + len2 + 1) / 2;

        int mid1 = (len1-1) / 2;
        int mid2 = len2 / 2;

        // 找到下标为 mid 的为止
        boolean flag = true;
        while (mid1 < len1 && mid2 < len2 && mid1 >= 0 && mid2 >= 0) {

        }

        return 0;
    }

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        if (nums1.length == 0) {
            return findMedianSortedArray(nums2);
        }

        if (nums2.length == 0) {
            return findMedianSortedArray(nums1);
        }

        int len1 = nums1.length;
        int len2 = nums2.length;

        int[] nums = new int[len1 + len2];

        int i = 0;
        int j = 0;
        int k = 0;
        while (i < len1 && j < len2) {
            if (nums1[i] < nums2[j]) {
                nums[k] = nums1[i];
                i++;
                k++;
            } else {
                nums[k] = nums2[j];
                j++;
                k++;
            }
        }

        if (i >= len1 && j >= len2) {
            return findMedianSortedArray(nums);
        } else if (i >= len1) {
            while (j < len2) {
                nums[k] = nums2[j];
                j++;
                k++;
            }
        } else {
            while (i < len1) {
                nums[k] = nums1[i];
                i++;
                k++;
            }
        }

        return findMedianSortedArray(nums);
    }

    public static double findMedianSortedArray(int[] nums) {
        int len = nums.length;

        if (len % 2 == 0) {
            return (double) (nums[(len - 1) / 2] + nums[len / 2]) / 2;
        } else {
            return (double) nums[len / 2];
        }

    }
}