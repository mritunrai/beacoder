package com.practice.easy.math;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int[] twoSum1(int[] nums, int target) {
        int r[] = new int[2];

        for (int i = 0; i <= nums.length; i++) {
            for (int j = i + 1; j <= nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    r[0] = i;
                    r[1] = j;

                    return r;
                }
            }
        }
        return r;
    }

    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] == target - nums[i]) {
                    return new int[]{i, j};
                }
            }
        }
        throw new IllegalArgumentException("No two sum solution");
    }

    public int[] twoSumUsingHashMap(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];

            if (map.containsKey(complement) && map.get(complement) != i) {
                return new int[]{i, map.get(complement)};

            }
        }

        throw new IllegalArgumentException("No two sum solutions");
    }

    public int[] twoSumUsingHashMapWithMoreOptimizedCode(int[] nums, int target) {
        HashMap<Integer, Integer> hashMap = new HashMap<Integer, Integer>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];

            if (hashMap.containsKey(complement)) {
                return new int[]{nums[i], hashMap.get(complement)};
            }
            hashMap.put(complement, nums[i]);

        }
        throw new IllegalArgumentException("No two sum solutions");
    }

    public static int reverse(int x) {
        int div;
        int sum = 0;

        int b = x;

        if(b<0)
        {
            b = -b;
        }

        while (b > 0) {
            div = b % 10;
            b = b / 10;

            sum = sum * 10 + div;
        }

        return (x<0)? sum * -1 : sum;
    }

    public static void main(String[] args) {
        // extracted();

        System.out.println("Integer value reverse :" + reverse(-123));


    }

    private static void extracted() {
        Solution sol = new Solution();

        int[] nums = {2, 3, 5};
        int[] j = sol.twoSum(nums, 5);

        for (int i :
                j) {
            System.out.println("elelemt :" + i);

        }
    }
}
