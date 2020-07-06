package com.tkluza.hackerrank.tasks.arrays;

import com.tkluza.hackerrank.tasks.AbstractTask;

public class ArrayDS extends AbstractTask {

    int[][] testData;
    int hourglassSum = Integer.MIN_VALUE;

    @Override
    protected void printTaskName() {
        System.out.println("2D Array - DS");
    }

    @Override
    protected void initTestData() {
        testData = new int[][]{
            new int[]{-1, -1, 0, -9, -2, -2},
            new int[]{-2, -1, -6, -8, -2, -5},
            new int[]{-1, -1, -1, -2, -3, -4},
            new int[]{-1, -9, -2, -4, -4, -5},
            new int[]{-7, -3, -3, -2, -9, -9},
            new int[]{-1, -3, -1, -2, -4, -5}};
    }

    @Override
    protected void solve() {
        hourglassSum = hourglassSum(testData);
    }

    private int hourglassSum(int[][] arr) {
        int hourglassSum = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (i < arr.length - 2 && j < arr[i].length - 2) {
                    int hourglassForIndexes = getHourglassForIndexes(i, j, arr);
                    if (hourglassForIndexes > hourglassSum) {
                        hourglassSum = hourglassForIndexes;
                    }
                }
            }
        }

        return hourglassSum;
    }

    private static int getHourglassForIndexes(int i, int j, int[][] arr) {
        int a = arr[i][j];
        int b = arr[i][j + 1];
        int c = arr[i][j + 2];
        int d = arr[i + 1][j + 1];
        int e = arr[i + 2][j];
        int f = arr[i + 2][j + 1];
        int g = arr[i + 2][j + 2];

        System.out.println();
        return a + b + c + d + e + f + g;
    }

    @Override
    public void printResult() {
        System.out.println(hourglassSum);
    }
}
