package com.practice.ds.tree;

public class Node {
    private String name;
    private String city;
    private Node left;
    private Node right;

    public Node(String name, String city) {
        this.name = name;
        this.city = city;
        left = right = null;
    }

    public Node() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Node getLeft() {
        return left;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public Node getRight() {
        return right;
    }

    public void setRight(Node right) {
        this.right = right;
    }
}
