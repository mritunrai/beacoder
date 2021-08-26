package com.practice.ds.queue;

import java.util.PriorityQueue;

public class PriorityQueu {

    public static void main(String[] args) {
        PriorityQueue<String> pq = new PriorityQueue<>();

        pq.add("mkrai");
        pq.add("mk");
        pq.add("annu");

        pq.add("a");

        System.out.println("Accessed Element: " + pq.peek());
    }
}
