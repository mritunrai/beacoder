package com.practice.ds.tree;

public class CreateTree {
    // Root of binary tree

    Node root;

    public void createTree() {
        Node current = null;
        if (root == null) {
            root = new Node("mritunjai", "Gorakhpur");

            root.setLeft(null);
            root.setRight(null);

            current = root;

        }

        current.setLeft(new Node("annu", "GKP"));

        current.setRight(new Node("annurai","Gorakhpur"));

        current = current.getLeft();

        current.setLeft(new Node("annuleft", "GKP"));

        current.setRight(new Node("annuraiRight","Gorakhpur"));
    }

    public static void main(String[] args) {
        CreateTree createTree = new CreateTree();
        createTree.createTree();
    }
}
