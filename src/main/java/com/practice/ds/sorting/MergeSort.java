package com.practice.ds.sorting;

public class MergeSort {

    /*
    Use divide and conquer approach first then club array and apply sorting subsequently.
     */
    public int[] divideArray(int[] arr, int l, int r) {
        if (l == r || l > r)
            return arr;

        if (l < r) {
            int m = (l + r) / 2;

            divideArray(arr, l, m);
            divideArray(arr, m + 1, r);
            merge(arr, l, m, r);
        }

        return arr;
    }

    private void merge(int[] arr, int l, int m, int r) {

        for (int i = l; i <= r - 1; i++) {
            for (int j = i + 1; j <= r; j++) {
                int temp = -1;
                if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
}
