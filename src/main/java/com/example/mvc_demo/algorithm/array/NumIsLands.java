package com.example.mvc_demo.algorithm.array;

/**
 * @author zhangkun.d
 */
public class NumIsLands {

    public static void main(String[] args) {

        int[][] arr1 = {{1,1,1,1,0},{1,1,0,1,0},{1,1,0,0,0},{0,0,0,0,0}};
        int[][] arr2 = {{1,1,0,0,0},{1,1,0,0,0},{0,0,1,0,0},{0,0,0,1,1}};

        System.out.println(numIsLands(arr1));
    }

    public static int numIsLands(int[][] arr) {
        if (arr == null || arr.length == 0) {
            return 0;
        }

        int row = arr.length;
        int col = arr[0].length;

        int num = 0;

        int[][] records = new int[row][col];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (records[i][j] == 0 && arr[i][j] == 1) {
                    travelDeep(arr, records, i, j);
                    num ++;
                }
            }
        }

        return num;
    }

    public static void travelDeep(int[][] arr, int[][] records, int x, int y) {
        records[x][y] = 1;

        int row = arr.length;
        int col = arr[0].length;

        // 向上搜寻
        if (y > 0) {
            if (arr[x][y -1] == 1 && records[x][y-1] == 0) {
                travelDeep(arr, records, x, y-1);
            }
        }

        // 向下搜寻
        if (y < col - 1) {
            if (arr[x][y + 1] == 1 && records[x][y+1] == 0) {
                travelDeep(arr, records, x, y+1);
            }
        }

        // 向后搜寻
        if (x > 0) {
            if (arr[x -1][y] == 1 && records[x-1][y] == 0) {
                travelDeep(arr, records, x - 1, y);
            }
        }

        // 向前搜寻
        if (x < row -1) {
            if (arr[x + 1][y] == 1 && records[x+1][y] == 0) {
                travelDeep(arr, records, x + 1, y);
            }
        }
    }
}
