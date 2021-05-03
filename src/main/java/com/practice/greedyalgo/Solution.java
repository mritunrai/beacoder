package com.practice.greedyalgo;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static List<Integer> smallestCoinProblem(int total, int[] coins) {
        int i = 0;
        int sum =0;
        List<Integer> coinsSet = new ArrayList<>();

        while (sum <= total && i<= coins.length-1) {

            if (sum + coins[i] > total ) {
                i++;

            } else {
                sum = sum + coins[i];
                coinsSet.add(coins[i]);
            }
        }

        return coinsSet;
    }

    public static void main(String[] args) {

        int[] coins = {5, 2, 1};
        List<Integer> coinList = smallestCoinProblem(28, coins);

        coinList.forEach(s -> System.out.println(s));
    }
}