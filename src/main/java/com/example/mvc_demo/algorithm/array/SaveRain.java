package com.example.mvc_demo.algorithm.array;

/**
 * @author zhangkun.d
 */
public class SaveRain {

    public static void main(String[] args) {
        int[] arr = {0,1,0,2,1,0,1,3,2,1,2,1};

        int[] arr1= {4,2,0,3,2,5};
        System.out.println(trap(arr1));
    }

    public static int trap(int[] height) {
        int indexHigh = indexMastHigh(height);
        int cap = 0;

        int cur1 = 0;
        int cur2 = 0;


        for (int i = 0; i < indexHigh; i++) {
            if (height[i] > cur1) {
                int tmp = (height[i] - cur1) * (indexHigh - 1 - i);
                cap += tmp;
                cap -= cur1;
                cur1 = height[i];
            } else if (height[i] <= cur1) {
                cap -= height[i];
            }
        }

        for (int i = height.length - 1; i > indexHigh; i--) {
            if (height[i] > cur2) {
                int tmp = (height[i] - cur2) * ( i - 1 - indexHigh);
                cap += tmp;
                cap -= cur2;
                cur2 = height[i];
            } else if (height[i] <= cur2) {
                cap -= height[i];
            }
        }
        
        return cap;
    }

    public static int indexMastHigh(int[] height) {
        int max = -1;
        int index = -1;
        for (int i = 0; i < height.length; i++) {
            if (height[i] > max) {
                max = height[i];
                index = i;
            }
        }

        return index;
    }


}
