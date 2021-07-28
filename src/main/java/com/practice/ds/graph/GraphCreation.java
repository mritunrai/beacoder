package com.practice.ds.graph;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class GraphCreation {
    public void graphUsingmatrix() {
        int[][] arr = new int[4][4];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (i == j)
                    arr[i][j] = 0;
                if (i == 1 && j == 4)
                    arr[i][j] = 1;
                if (i == 1 && j == 2)
                    arr[i][j] = 1;
                if (i == 2 && j == 3)
                    arr[i][j] = 1;

                if (i == 2 && j == 4)
                    arr[i][j] = 1;

                if (i == 3 && j == 4)
                    arr[i][j] = 1;
            }
        }

        System.out.println("printing graph value!");

        for (int i = 0; i < arr.length; i++) {
            System.out.print("Node" + (i + 1) + " ");

            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j]);
                System.out.print("");
            }

            System.out.println("");
        }

    }

    public void graphUsing_AdjacencyList() {
        List<Node> list = new ArrayList<>();

        Set<String> nodeValue = new HashSet<>();
        nodeValue.add("Mritunjia");
        nodeValue.add("Annu");
        nodeValue.add("AnnuRai");

        list.add(createNodeList(nodeValue));

        nodeValue = new HashSet<>();

        nodeValue.add("gorakhpur");
        nodeValue.add("Bangalore");
        nodeValue.add("Mysore");

        list.add(createNodeList(nodeValue));
    }

    private Node createNodeList(Set<String> node) {
        Node header = null;
        Node current = null;

        // Iterating though the set.

        if (header == null) {
            for (String value : node) {

                System.out.println(value + ", ");

                Node node1 = new Node();
                node1.setName(value);

                if (header == null) {
                    header = node1;
                    current = header;
                } else {
                    current.setNext(node1);
                    current = current.getNext();
                }
            }
        }

        return header;
    }
}
