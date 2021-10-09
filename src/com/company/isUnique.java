package com.company;

import java.util.Scanner;

class isUnique {
    static boolean isCharactersUnique(String ch) {
        for (int i = 1; i < ch.length(); i++) {
            for (int j = 0; j < i; j++)
                if (ch.charAt(i) == ch.charAt(j)) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.print("Enter a set of String: ");
        Scanner checkString = new Scanner(System.in);
        String st = checkString.nextLine();
        if (isCharactersUnique(st)) {
            System.out.println("Has all unique characters");
        } else {
            System.out.println("Does not all contain unique characters");
        }
    }
}
