/*
 * lab 4 ex 3
 * this is the queue test file for the demo
 * i create two queues here and show enqueue plus my concatenate method
 * the point of this main is to show q2 can be attached to q1 in o(1)
 */
package com.exercise3.rojina.saberi;

// Rojina Saberi
// Student ID: 301533334
// COMP254 Lab 4

public class TestQueue {

    public static void main(String[] args) {

        // create two queues
        LinkedQueue<Integer> Q1 = new LinkedQueue<>();
        LinkedQueue<Integer> Q2 = new LinkedQueue<>();

        // add elements to Q1
        // each enqueue runs in O(1)
        Q1.enqueue(10);
        Q1.enqueue(20);
        Q1.enqueue(30);

        // add elements to Q2
        // each enqueue runs in O(1)
        Q2.enqueue(40);
        Q2.enqueue(50);
        Q2.enqueue(60);

        // print queues before concatenation
        System.out.println("Before concatenation:");
        System.out.println("Q1: " + Q1);
        System.out.println("Q2: " + Q2);

        // concatenate Q2 to Q1
        // this runs in O(1) because we only reconnect pointers
        Q1.concatenate(Q2);

        // print queues after concatenation
        System.out.println("\nAfter concatenation:");
        System.out.println("Q1: " + Q1);
        System.out.println("Q2: " + Q2);
    }
}
