package com.company;

import java.util.Scanner;

class palindromePermutation {
    static boolean aPermutaionOfPalindrome(String input) {
        int[] char_counts = new int[128];
        for (int i=0; i<input.length(); i++) {
            char_counts[input.charAt(i)]++;
        }
        int count = 0;
        for (int i=0; i<128; i++) {
            count += char_counts[i] % 2;
        }
        return count <=1;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();

        System.out.println(aPermutaionOfPalindrome(str));
    }
}
