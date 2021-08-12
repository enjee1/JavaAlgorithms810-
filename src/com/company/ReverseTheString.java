package com.company;

import java.sql.Array;
import java.util.Arrays;

public class ReverseTheString {

    public static String specialReverseString(String str) {
        String reversed = new StringBuilder(str).reverse().toString().replaceAll(" ","");
        System.out.println(reversed);
        StringBuilder s = new StringBuilder();
        int i = 0;
        for (char c : str.toCharArray()) {
            if (Character.isUpperCase(c))
                s.append(Character.toUpperCase(reversed.charAt(i)));
            else if (!Character.isSpaceChar(c))
                s.append(Character.toLowerCase(reversed.charAt(i)));
            else {
                s.append(c);
                i--;
            }
            i++;
        }
        return s.toString();
    }


    public static void run() {

        System.out.println(specialReverseString("Tibade"));
        System.out.println(specialReverseString("UPPER lower"));
        System.out.println(specialReverseString("1 23 456"));

    }
}




