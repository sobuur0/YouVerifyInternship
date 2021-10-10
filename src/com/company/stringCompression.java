/*
    A function that performs basic string compression on a string input
    using the counts of repeated characters
 */
package com.company;

import java.util.Scanner;

class stringCompression {

    static String compress(String in) {
        if (in.length() < 3) return in;

        int n = in.length(), i, o = 0;
        char[] out = new char[n + 1];
        out[o++] = in.charAt(0);
        out[o++] = '1';
        for (i = 1; i < n && o < n; i++) {
            if (in.charAt(i) == in.charAt(i - 1) && out[o - 1] != '9') {
                // Continued streak
                out[o - 1]++;
            } else {
                // New streak
                out[o++] = in.charAt(i);
                out[o++] = '1';
            }
        }
        return (i == n && o < n) ? new String(out, 0, o) : in;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String st = input.nextLine();

        System.out.println(compress(st));
    }
}
