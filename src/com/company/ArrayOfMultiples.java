package com.company;

import java.sql.Array;
import java.util.Arrays;

public class ArrayOfMultiples {
    private int[] outputArray;

    public ArrayOfMultiples(int num, int length) {
        outputArray = new int[length];
        outputArray[0] = num;

        for (int i = 1; i < outputArray.length; i++) {
            outputArray[i] = (outputArray[i - 1] + num);
        }
    }

    public static void run() {
        ArrayOfMultiples testArray1 = new ArrayOfMultiples(7, 5);
        ArrayOfMultiples testArray2 = new ArrayOfMultiples(12, 10);
        ArrayOfMultiples testArray3 = new ArrayOfMultiples(17, 6);
        System.out.println(testArray1);
        System.out.println(testArray2);
        System.out.println(testArray3);
    }

    @Override
    public String toString() {
        return Arrays.toString(outputArray);

    }


}
