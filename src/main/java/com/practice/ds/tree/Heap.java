package com.practice.ds.tree;

import java.util.Arrays;

// youtube :https://www.youtube.com/watch?v=NEtwJASLU8Q
public class Heap {
    public void insertInMaxHeap(int[] a, int n, int element) {
        int[] heap = Arrays.copyOf(a,a.length+1);
        n = n + 1;

        heap[n] = element;
        int i = n;

        while (i >= 1) {
            int parent = i / 2;

            if (heap[parent] <= heap[i]) {
                swap(heap, parent, i);
                i = parent;
            } else
                return;

        }
    }

    private void swap(int[] heap, int parent, int i) {
        int k;

        k = heap[parent];
        heap[parent] = heap[i];
        heap[i] = k;
    }

    public static void main(String[] args) {
        int[] a = {70,50,40,45,35,39,16,10,9};

        Heap heap = new Heap();

        heap.insertInMaxHeap(a,a.length-1,60);

        System.out.println("max heap insertion is  done");

    }
}
