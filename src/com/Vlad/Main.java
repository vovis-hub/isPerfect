package com.Vlad;

public class Main {

    public static void main(String[] args) {
        for (int i = 0; i < 10001; i++) {
            if (isPerfectNumber(i)) {
                System.out.println(i + " is a perfect number");
            }
        }
    }

    public static boolean isPerfectNumber(int a) {
        if (a < 0) {
            return false;
        }
        int sum = 0;
        for (int i = 1; i < a; i++) {
            if (a % i == 0) {
                sum += i;
            }
        }
        return (sum == a);
    }
}
