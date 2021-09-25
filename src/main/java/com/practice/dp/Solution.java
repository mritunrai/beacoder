package com.practice.dp;

public class Solution {
    /*
    Fib Series implementation without DP.
    Watch Aditya Verma youtube videos .
     */
    public static int fibSeriesWithoutDP(int n) {
        int result;

        if (n == 0)
            return 0;

        if (n == 1 || n == 2)
            return 1;
        else
            return result = fibSeriesWithoutDP(n - 1) + fibSeriesWithoutDP(n - 2);
    }

    /*
    Fib series implementation with DP .
     */

   static int[] memo = new int[1000];

    public static int fibWithDP(int n) {


        int result;

        if (memo[n] != 0)
            return memo[n];

        if (n == 0)
            return 0;

        if (n == 1 || n == 2)
            return 1;
        else
            result = fibWithDP(n - 1) + fibWithDP(n - 2);
            memo[n] = result;
            return result;
    }

    public static void main(String[] args) {
        int maxNumber = 10;
        System.out.print("Fibonacci Series of " + maxNumber + " numbers: ");
       // extracted(true, maxNumber);

        extracted(true, maxNumber);
    }

    private static void extracted(Boolean flag, int maxNumber) {

        if (!flag) {
            for (int i = 0; i < maxNumber; i++) {
                System.out.print(fibSeriesWithoutDP(i) + " ");
            }
        } else {

            for (int i = 0; i < maxNumber; i++) {
                System.out.print(fibWithDP(i) + " ");
            }
        }

    }
}
