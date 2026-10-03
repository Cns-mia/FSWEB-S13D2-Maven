package org.example;

// Sprint 13 Gün 2 çözümü

public class Main {
    public static void main(String[] args) {
        System.out.println(isPalindrome(-1221));
        System.out.println(isPerfectNumber(28));
        System.out.println(numberToWords(1010));
    }

    public static boolean isPalindrome(int number) {
        int value = Math.abs(number);
        int reversed = 0;
        int temp = value;
        while (temp > 0) {
            reversed = reversed * 10 + temp % 10;
            temp /= 10;
        }
        return reversed == value;
    }

    public static boolean isPerfectNumber(int number) {
        if (number < 1) {
            return false;
        }
        int sum = 0;
        for (int i = 1; i <= number / 2; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }
        return sum == number;
    }

    public static String numberToWords(int number) {
        if (number < 0) {
            return "Invalid Value";
        }
        String[] words = {"Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};
        String digits = String.valueOf(number);
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < digits.length(); i++) {
            if (i > 0) {
                result.append(" ");
            }
            result.append(words[digits.charAt(i) - '0']);
        }
        return result.toString();
    }
}
