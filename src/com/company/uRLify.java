package com.company;

import java.util.Scanner;

class uRLify {

    static void substituteSpace(char[] string, int lengthOfString) {
        int spaceCount = 0;
        int i = 0;
        int index;
        for (i=0; i<lengthOfString; i++) {
            if (string[i] == ' ') {
                spaceCount++;
            }
        }
        //Since we are to replace space with 3 characters
        //And we start counting from 0
        index = lengthOfString + spaceCount * 2;
        if (lengthOfString < string.length) {
            string[lengthOfString] = '\0';
        }
        //iterate from back and replace space with "%20"
        for(i=lengthOfString-1; i>0; i--) {
            if (string[i] == ' ') {
                string[index-1] = '0';
                string[index-2] = '2';
                string[index-3] = '%';
                index = index -3;
            }else {
                string[index-1] = string[i];
                index--;
            }
        }
        System.out.println(string);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String string = input.nextLine();

        substituteSpace(string.toCharArray(), string.trim().length());
    }
}