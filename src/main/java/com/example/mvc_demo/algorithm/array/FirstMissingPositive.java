package com.example.mvc_demo.algorithm.array;

/**
 * @author zhangkun.d
 */
public class FirstMissingPositive {

    public static void main(String[] args) {
        int[] arr = {1,1};

        System.out.println(firstMissingPositive(arr));
    }

    public static int firstMissingPositive(int[] nums) {
        if (nums == null) {
            return 0;
        }

        int i = 0;
        while (i < nums.length) {
            if (nums[i] > 0 && nums[i] <= nums.length && nums[i] != (i + 1)) {
                int tmp = nums[i];


                nums[i] = nums[tmp - 1];
                nums[tmp - 1] = tmp;

                if (nums[i] == nums[tmp - 1]) {
                    i++;
                }

            } else {
                i ++;
            }

        }


        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != j + 1) {
                return j + 1;
            }
        }

        return nums.length + 1;
    }
}
