package com.practice.ds.sorting;

import java.util.Arrays;

public class MainSorting {
    public static void main(String[] args) {
        //   mergesorting();

        QuickSort quickSort = new QuickSort();


        int arr[] = {9,1, 4, 2, 8, 9, 4, 5, 78};
        quickSort.quickSort(arr, 0, arr.length-1);

        System.out.println("Printing array " + Arrays.toString(arr));

    }

    private static void mergesorting() {
        MergeSort mergeSort = new MergeSort();

        int arr[] = {1, 4, 2, 8, 9, 4, 5, 78};
        arr = mergeSort.divideArray(arr, 0, 7);

        System.out.println("Printing array " + Arrays.toString(arr));
    }
}
