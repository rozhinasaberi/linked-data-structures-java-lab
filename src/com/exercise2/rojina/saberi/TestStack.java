/*
 * lab 4 ex 2
 * this is the stack test file i actually run
 * i use it to show lifo behavior with push top and pop
 * main is here on purpose so the implementation file is not full of test output
 */
package com.exercise2.rojina.saberi;

// Rojina Saberi
// Student ID: 301533334
// COMP254 Lab 4

public class TestStack {

    public static void main(String[] args) {

        // create a new stack
    	//last in, first out 
        LinkedStack<Integer> stack = new LinkedStack<>();

        // push elements onto the stack
        // push runs in O(1)
        stack.push(10);
        stack.push(20);
        stack.push(30);

        // print stack after pushes
        System.out.println("Stack after pushes:");
        System.out.println(stack);

        // check top element
        // top runs in O(1)
        System.out.println("Top element: " + stack.top());

        // pop element
        // pop runs in O(1)
        System.out.println("Popped element: " + stack.pop());

        // print stack after pop
        System.out.println("Stack after pop:");
        System.out.println(stack);

        // check stack size
        System.out.println("Stack size: " + stack.size());

        // check if stack is empty
        System.out.println("Is stack empty? " + stack.isEmpty());
    }
}
