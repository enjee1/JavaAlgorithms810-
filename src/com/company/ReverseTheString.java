package com.company;

import java.sql.Array;
import java.util.Arrays;

public class ReverseTheString {
    private String originalString;
    private char[] originalChars;
    private int[] caseCheck;


    public ReverseTheString(String input) {
        originalString = input;
        originalChars = input.toCharArray();
    }

    public char[] checkString() {
        caseCheck = new int[originalString.length()];

        for (int i = 0; i < originalString.length(); i++){
            originalChars[i] = originalString.charAt(i);
            if (Character.isUpperCase(originalChars[i])){
                caseCheck[i] = 2;
            } else if (Character.isWhitespace(originalChars[i])) {
                caseCheck[i] = 0;
            } else {
                caseCheck[i] = 1;
            }
        }
        System.out.println(Arrays.toString(caseCheck));

        return originalChars;
    }

    public String getOriginalString() {
        return originalString;
    }


}

