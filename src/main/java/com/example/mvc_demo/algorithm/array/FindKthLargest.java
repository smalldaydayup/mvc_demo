package com.example.mvc_demo.algorithm.array;

/**
 * 数组中的第K个最大元素
 *
 * @author zhangkun.d
 */
public class FindKthLargest {
    public static void main(String[] args) {
        int[]  arr = {3,2,3,1,2,4,5,5,6};
        System.out.println(findKthLargest(arr, 4));
    }

    public static int findKthLargest(int[] nums, int k) {

        int value = quickSelect(nums, k , 0, nums.length - 1);
        return value;
    }

    public static int quickSelect(int[] nums, int k, int left, int right) {
        int tmp = nums[left];
        int i = left;
        int j = right;

        if (j > i) {
            while (j > i) {
                while (j > i && nums[j] <= tmp) {
                    j --;
                }
                if (j > i) {
                    swap(nums, i,j);
                    i++;
                }


                while (j > i && nums[i] >= tmp) {
                    i ++;
                }
                if (j > i) {
                    swap(nums, i, j);
                    j --;
                }

            }

            if ( i == k -1) {
                return nums[i];
            } else if (i < k -1) {
                if (right >= j + 1) {
                    return quickSelect(nums, k, j + 1, right);
                }

            } else {
                if (i >= left + 1 ) {
                    return quickSelect(nums, k, left, i -1);
                }
            }
        } else {
            if (i == k - 1) {
                return nums[i];
            }
        }

        return -1;
    }

    public static void swap(int[] nums, int i, int j) {
        int k = nums[i];
        nums[i] = nums[j];
        nums[j] = k;
    }
}
