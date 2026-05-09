/*
 * lab 4 ex 1
 * this is the file i run for the demo
 * linkedpositionallist is created here and i test insert, traversal, and searching
 * i kept the testing in a separate main file so the data structure class stays cleaner
 */
package com.exercise1.rojina.saberi;

// Rojina Saberi
// Student ID: 301533334
// COMP254 Lab 4

public class TestPositionalList {

    public static void main(String[] args) {

        // create a new positional list
        LinkedPositionalList<Integer> plist = new LinkedPositionalList<>();

        // add elements to the list
        // each insertion runs in O(1)
        plist.addLast(10);
        plist.addLast(20);
        plist.addLast(30);
        plist.addLast(40);

        // print the list
        System.out.println("List contents:");
        for (Integer e : plist) {
            System.out.print(e + " ");
        }

        System.out.println();

        // search for an element
        // findPosition runs in O(n) because it may traverse the list
        Position<Integer> p = plist.findPosition(40);

        if (p != null) {
            System.out.println("Found element: " + p.getElement());
        } else {
            System.out.println("Element not found");
        }

        // search for an element that does not exist
        Position<Integer> p2 = plist.findPosition(100);

        if (p2 == null) {
            System.out.println("100 not found");
        }
    }
}
