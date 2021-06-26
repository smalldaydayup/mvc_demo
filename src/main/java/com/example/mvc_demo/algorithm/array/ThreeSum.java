package com.example.mvc_demo.algorithm.array;

import java.util.*;

/**
 * @author zhangkun.d
 */
public class ThreeSum {

    public static void main(String[] args) {
        int[] arr = {-1,0,1,2,-1,-4};
        int[] arr1 = {3,0,-2,-1,1,2};
        List<List<Integer>> allList = threeSum(arr1);

        System.out.println(allList.size());
    }


    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> allList = new LinkedList<>();

        if (nums == null) {
            return allList;
        }

        if (nums.length < 3) {
            return allList;
        }

        Map<Integer, Set<Integer>> allExists = new HashMap<>();



        for (int i = 0; i < nums.length - 2; i++) {
            Map<Integer, Integer> sumMap = new HashMap<>();

            for (int j = i + 1; j < nums.length; j++) {
                int tar = 0 - nums[j];
                if (sumMap.containsKey(tar)) {
                    int index = sumMap.get(tar);
                    int val = tar - nums[index];

                    int min = 0;
                    int max = 0;

                    if (nums[j] < nums[index]) {
                         min = Math.min(nums[j], val);
                         max = Math.max(nums[index], val);
                    } else {
                         min = Math.min(nums[index], val);
                         max = Math.max(nums[j], val);
                    }

                    if (allExists.containsKey(min)) {
                        Set<Integer> set = allExists.get(min);
                        set.add(max);
                    } else {
                        Set<Integer> set = new HashSet<>();
                        set.add(max);
                        allExists.put(min, set);
                    }

                } else {
                    sumMap.put(nums[j] + nums[i], j);
                }
            }
        }

        allExists.forEach((x,y) -> {
            y.forEach(max -> {
                List<Integer> list = Arrays.asList(x, -(x + max), max);
                allList.add(list);
            });
        });

        return allList;
    }


}
