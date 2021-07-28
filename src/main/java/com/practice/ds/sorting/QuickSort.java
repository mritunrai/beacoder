package com.practice.ds.sorting;

public class QuickSort {

    /*
    Find pivot from array and pivot can be any element in array only condition is
    while sorting small element should come in left of the pivot element and greater
    value should be right side of the pivot value.
     */
    public void quickSort(int[] arr, int lb, int ub) {
        int pi;
        if (lb < ub) {
            pi = partition(arr, lb, ub);

            quickSort(arr, lb, pi - 1);
            quickSort(arr, pi + 1, ub);
        }

    }

    /*
    Elelment lesss than Pivot should bein left side and element greater thank pivot should   be in right side of pivot.

    start : Move if element is less than pivot.
    end : if element is greater than pivot then decrease.

    else stop both start and end pointer .
    and swap start and end value

    Once start become greater to end then swap pivot value to end  adn return end index to array.
    https://www.youtube.com/watch?v=QN9hnmAgmOc
     */
    private int partition(int[] arr, int lb, int ub) {

        int pivot = arr[lb];
        int start = lb;
        int end = ub;

        while (start < end) {
            while (arr[start] <= pivot) {
                start++;
            }

            while (arr[end] > pivot) {
                end--;
            }

            if (start < end) {
                swapElements(arr, start, end);
            }
        }

        swapElements(arr, lb, end);  // swap if start cross to end and swap pivot with end  and return end.

        return end;
    }

    private void swapElements(int[] arr, int start, int end) {
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }
}
