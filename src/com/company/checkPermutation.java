package com.company;

import java.util.Arrays;
import java.util.Scanner;

class checkPermutation {
    // This considers the solution to be case-sensitive
    //Example -- "youVerify" is not a permutation of "verifyyou"

    static String sort(String string) {
        char[] content = string.toCharArray();
        Arrays.sort(content);
        return new String(content);
    }

    static boolean permutation(String first, String second) {
        if (first.length() != second.length()) {
            return false;
        }
        return sort(first).equals(sort(second));
    }

    public static void main(String[] args) {
        System.out.print("Enter First String: ");
        Scanner firstString = new Scanner(System.in);
        String first = firstString.nextLine();

        System.out.print("Enter Second String: ");
        Scanner secondString = new Scanner(System.in);
        String second = secondString.nextLine();

        System.out.println(permutation(first, second));
    }
}
