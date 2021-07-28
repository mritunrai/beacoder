package com.practice.ds.graph;

public class CallingFucntion {
    public static void main(String[] args) {
        GraphCreation graphCreation = new GraphCreation();
       // usingMatrix();

        graphCreation.graphUsing_AdjacencyList();

    }

    private static void usingMatrix(GraphCreation graphCreation) {
             graphCreation.graphUsingmatrix();
    }
}
