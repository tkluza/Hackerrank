package com.tkluza.hackerrank.tasks.warm_up;

import com.tkluza.hackerrank.tasks.AbstractTask;

public class JumpingOnTheClouds extends AbstractTask {

    private int[] testData;
    private int cloudSteps;

    @Override
    protected void printTaskName() {
        System.out.println("Jumping on the Clouds");
    }

    @Override
    protected void initTestData() {
        testData = new int[]{0, 0, 1, 0, 0, 1, 0};
    }

    @Override
    protected void solve() {
        cloudSteps = jumpingOnTheClouds(testData);
    }

    public static int jumpingOnTheClouds(int[] cloudsArr) {
        int steps = 0;

        for (int i = 0; i < cloudsArr.length; ) {
            int farestSafecloud = findSafeCloud(cloudsArr, i);
            if (farestSafecloud == 0) {
                break;
            } else {
                steps++;
                i = farestSafecloud;
            }
        }

        return steps;
    }

    private static int findSafeCloud(int[] cloudsArr, int currentIndex) {
        for (int i = currentIndex + 1; i < cloudsArr.length; i++) {
            int currentCloud = cloudsArr[i];
            int nextCloudIndex = i + 1;
            if (nextCloudIndex < cloudsArr.length && cloudsArr[nextCloudIndex] == 0) {
                return nextCloudIndex;
            } else if (currentCloud == 0) {
                return i;
            }
        }
        return 0;
    }

    @Override
    public void printResult() {
        System.out.println(cloudSteps);
    }
}
