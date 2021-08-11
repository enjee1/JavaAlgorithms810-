package com.company;

import java.util.Arrays;

public class PerfectSquarePatch {
    private int[][] outputArray;

    public PerfectSquarePatch(int num) {
        outputArray = new int[num][num];
        for (int i = 0; i < num ; i++) {
            for (int j = 0; j < num ; j++) {
                outputArray[i][j] = num;
            }
        }
    }

    public static void run(){
        PerfectSquarePatch testArray4 = new PerfectSquarePatch(3);
        PerfectSquarePatch testArray5 = new PerfectSquarePatch(5);
        PerfectSquarePatch testArray6 = new PerfectSquarePatch(1);
        PerfectSquarePatch testArray7 = new PerfectSquarePatch(0);
        System.out.println(testArray4);
        System.out.println(testArray5);
        System.out.println(testArray6);
        System.out.println(testArray7);
    }

    @Override
    public String toString() {
        return Arrays.deepToString(outputArray);

    }




}
