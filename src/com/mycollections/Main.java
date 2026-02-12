/**
 *  Java program to demonstrate LinkedHashMap.
 */

package com.mycollections;

import java.util.LinkedHashMap;

/**
 *  Main class.
 */
public class Main {

    // Main method to drive java program.
    public static void main(String[] args) {

        // Creating an empty LinkedHashMap.
        LinkedHashMap<Integer, Integer> myLinkedMap = new LinkedHashMap<>();

        // Initializing the map.
        myLinkedMap.put(2, 3);
        myLinkedMap.put(3, 4);
        myLinkedMap.put(4, 5);
        myLinkedMap.put(5, 6);

        // Printing the map to console. Notice: elements print in order they are added.
        System.out.println(myLinkedMap); // Output: {2=3, 3=4, 4=5, 5=6}

        // Removing element with key 4.
        myLinkedMap.remove(4);

        // Printing the map to console.
        System.out.println(myLinkedMap); // Output: {2=3, 3=4, 5=6}

        // Removing all elements from myLinkedMap.
        myLinkedMap.clear();

        // Printing size of myLinkedMap.
        System.out.println(myLinkedMap.size()); // Output: 0.

    }
}
