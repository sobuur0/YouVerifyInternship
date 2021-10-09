package com.company;

import java.util.Arrays;
import java.util.Scanner;

class oneAway {
    static boolean oneEdit(String w1, String w2) {
        char[] word1 = w1.trim().toCharArray();
        char[] word2 = w2.trim().toCharArray();

        int length1 = word1.length;
        int length2 = word2.length;

        if (Math.abs(length2 - length1) > 1) return false;

        Arrays.sort(word1);
        Arrays.sort(word2);

        int length = word1.length >= word2.length ? word2.length : word1.length; //take the minimum length

        int falseCounter = 0;
        for (int i = 0; i < length; i++) {
            if (word1[i] != word2[i] && ++falseCounter > 1) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner input1 = new Scanner(System.in);
        String string1 = input1.nextLine();

        Scanner input2 = new Scanner(System.in);
        String string2 = input2.nextLine();

        System.out.println(oneEdit(string1, string2));
    }
}
