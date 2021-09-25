package com.practice.ds.graph;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Stack;

/*
https://www.geeksforgeeks.org/breadth-first-search-or-bfs-for-a-graph/

https://www.interviewbit.com/tutorial/depth-first-search/
 */
public class Graph1 {
    private int V; //No. of Vertices
    private LinkedList<Integer> adj[]; // Adjacency Lists
    private boolean visited[];

    public Graph1(int v) {
        V = v;
        adj = new LinkedList[v];
        for (int i = 0; i < v; i++) {
            adj[i] = new LinkedList<Integer>();
        }
        visited = new boolean[v];
    }

    public static void main(String[] args) {
        Graph1 graph1 = new Graph1(4);
        graph1.addEdge(0, 1);
        graph1.addEdge(0, 2);

        graph1.addEdge(1, 2);
        graph1.addEdge(2, 0);
        graph1.addEdge(2, 3);
        graph1.addEdge(3, 3);

        System.out.println("Following is Breadth First Traversal " +
                "(starting from vertex 2)");

        graph1.BFS(2);
    }

    public void addEdge(int v, int w) {
        adj[v].add(w);
    }

    public void BFS(int source) {
        // Create a queue for BFS
        LinkedList<Integer> queue = new LinkedList<Integer>();

        // Mark the current node as visited adn enqueue it.
        visited[source] = true;
        queue.add(source);

        while (queue.size() != 0) {
            source = queue.poll();
            System.out.println("source " + source + " ");

            Iterator<Integer> i = adj[source].listIterator();

            while (i.hasNext()) {
                int n = i.next();
                if (!visited[n]) {
                    visited[n] = true;
                    queue.add(n);
                }
            }

        }
    }

    // Using Recursion.
    public void DFSRec(int vertex) {
        visited[vertex] = true;
        System.out.println(vertex + "");

        Iterator itr = adj[vertex].listIterator();

        while (itr.hasNext()) {
            int adj_node = (int) itr.next();

            if (!visited[adj_node])
                DFSRec(adj_node);
        }
    }

    // Using Iterative Model.
    public void DFIterative(int vertex) {
        visited[vertex] = true;

        Stack<Integer> stack = new Stack<>();
        stack.push(vertex);

        while (!stack.isEmpty()) {

            vertex = stack.peek();
            stack.pop();

            System.out.println(vertex + "");
            visited[vertex] = true;

            Iterator itr = adj[vertex].listIterator();

            while (itr.hasNext()) {
                int adj_node = (int) itr.next();

                if (!visited[adj_node])
                    stack.push(adj_node);
            }
        }
    }
}