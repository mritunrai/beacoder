package com.javalearning.javaconcepts.collection;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorDemo {
    public static void main(String[] args) {
        // CReate a linked List

        List<String> names = new LinkedList<>();
        names.add("Welcome");
        names.add("TO");
        names.add("GFG");

        // Getitng LustIterator
        ListIterator<String> namesIterator
                = names.listIterator();

        // Traversing elements
        while (namesIterator.hasNext()){
            System.out.println(namesIterator.next());
        }

        // for-each loop create Internal Iterator here.

        for (String s : names)
        {
            System.out.println(s);
        }


    }
}
