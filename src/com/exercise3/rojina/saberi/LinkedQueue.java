/*
 * lab 4 ex 3
 * this file is the queue implementation
 * it uses a singly linked list and keeps front and rear behavior through that structure
 * queue is fifo so enqueue happens at the end and dequeue happens at the front
 * concatenate is here because this class knows how to reconnect the queue pointers
 */
package com.exercise3.rojina.saberi;

/*
 * Rojina Saberi
 * 301533334
 * COMP254 Lab 4
 */

public class LinkedQueue<E> implements Queue<E> {
  private SinglyLinkedList<E> list = new SinglyLinkedList<>();   // an empty  list

  public LinkedQueue() { }                  // new queue relies on the initially empty list

  /**
   * Returns the number of elements in the queue.
   * @return number of elements in the queue
   */
  @Override
  public int size() { return list.size(); }

  /**
   * Tests whether the queue is empty.
   * @return true if the queue is empty, false otherwise
   */
  @Override
  public boolean isEmpty() { return list.isEmpty(); }

  /**
   * Inserts an element at the rear of the queue.
   * @param element  the element to be inserted
   */
  @Override
  public void enqueue(E element) { list.addLast(element); }

  /**
   * Returns, but does not remove, the first element of the queue.
   * @return the first element of the queue (or null if empty)
   */
  @Override
  public E first() { return list.first(); }

  /**
   * Removes and returns the first element of the queue.
   * @return element removed (or null if empty)
   */
  @Override
  public E dequeue() { return list.removeFirst(); }

  /**
   * Concatenates Q2 to the end of this queue.
   * Runs in O(1) time because it only reconnects pointers.
   */
  public void concatenate(LinkedQueue<E> Q2) {
    list.concatenate(Q2.list);
  }

  /**
   * Produces a string representation of the contents of the queue.
   */
  public String toString() {
    return list.toString();
  }
}
