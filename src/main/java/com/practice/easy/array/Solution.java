package com.practice.easy.array;

public class Solution {

    /*
    Remove Duplicates from Sorted Array

    Given a sorted array nums, remove the duplicates in-place such that each element appears only once and returns the new length.

    Do not allocate extra space for another array, you must do this by modifying the input array in-place with O(1) extra memory.
     */

    public static int removeDuplicates(int[] nums) {

        int m = 0;
        int k = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length - k; j++) {
                if (nums[i] == nums[j]) {
                    nums[j] = nums[nums.length - 1 - k];
                    nums[nums.length - 1 - k] = 0;
                    k++;
                }
            }
        }

        for (int i :
                nums) {
            System.out.println(i);

        }
        return (nums.length) - k;

    }

    public static int removeDuplicatesUsingPointers(int[] nums) {
        if (nums.length < 0) return 0;

        int i = 0;

        for (int j = 1; j < nums.length - 1; j++) {

            if (nums[j] != nums[i]) {
                i++;
                nums[i] = nums[j];
            }
        }
        return i + 1;

    }

    /*
    Given an array nums and a value val, remove all instances of that value in-place
    and return the new length.

    Do not allocate extra space for another array, you must do this by modifying the
    input array in-place with O(1) extra memory.

    Input: nums = [3,2,2,3], val = 3
    Output: 2, nums = [2,2]
     */
    public static int removeElementFromArray(int[] nums, int val) {

        int i = 0;

        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != val) {
                nums[i] = nums[j];
                i++;
            }
        }
        return i;
    }

    /*
    Given an integer array nums, find the contiguous
    subarray (containing at least one number) which has the
    largest sum and return its sum.

     Example 1:

    Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
    Output: 6
    Explanation: [4,-1,2,1] has the largest sum = 6.
     */
    public static int maximumSubArray(int[] nums) {

        int maxSubarray = Integer.MIN_VALUE;
        int l = 0, m = 0;
        for (int i = 0; i <= nums.length-1; i++) {
            int avg = 0;

            for (int j = i ; j < nums.length; j++) {
                avg +=  nums[j];

               // maxSubarray = Math.max(maxSubarray, avg);

                if (avg > maxSubarray) {
                    maxSubarray = avg;
                    l = i;
                    m = j;
                }
            }
        }

        System.out.println("Largest sequence sum :" + maxSubarray);
        System.out.println("from index " + l + "to:" + m);

        return maxSubarray;

    }

    public static int maximumSubArrayOptimize(int[] nums) {

        int max_ending_here = 0;
        int max_so_far = Integer.MIN_VALUE;

        for(int i=0 ; i<nums.length;i++)
        {
            max_ending_here = max_ending_here +nums[i];

            if(max_so_far < max_ending_here)
            {
                max_so_far = max_ending_here;
            }

            if(max_ending_here < 0)
            {
                max_ending_here = 0;
            }
        }
        return max_so_far;
    }

    public static void main(String[] args) {

        int[] nums = new int[]{1, 1, 2, 1, 3, 3};

        int[] subArray = new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4};

        // System.out.println("Array length after removing duplicate elements :"
        //   + removeDuplicates(nums));

        // System.out.println("Array length after removing duplicate elements" + removeDuplicatesUsingPointers(nums));

        //System.out.println("Removing element :"+ removeElementFromArray(nums,1));

      //  System.out.println("Maximum sub array :" + maximumSubArray(subArray));

        System.out.println("Maximum sub array :" + maximumSubArrayOptimize(subArray));
    }
}