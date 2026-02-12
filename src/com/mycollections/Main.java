/**
 *  Java program to demonstrate LinkedHashSet.
 */

package com.mycollections;

import java.util.LinkedHashMap;
import java.util.LinkedList;

/**
 *  Main class.
 */
public class Main {

    // Main method to drive java program.
    public static void main(String[] args) {

        // Creating an empty linked list.
        LinkedHashMap<Integer, Integer> myLinkedList = new LinkedHashMap<>();

        // Initializing the map.
        myLinkedList.put(2, 3);
        myLinkedList.put(3, 4);
        myLinkedList.put(4, 5);
        myLinkedList.put(5, 6);

        // Printing the map to console. Notice: elements print in order they are added.
        System.out.println(myLinkedList); // Output: {2=3, 3=4, 4=5, 5=6}

        // Removing element with key 4.
        myLinkedList.remove(4);

        // Printing the map to console.
        System.out.println(myLinkedList); // Output: {2=3, 3=4, 5=6}

        // Removing all elements from myLinkedList.
        myLinkedList.clear();

        // Printing size of myLinkedList.
        System.out.println(myLinkedList.size()); // Output: 0.

    }
}