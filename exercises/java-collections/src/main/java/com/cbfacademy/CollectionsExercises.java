package com.cbfacademy;

import java.util.*;

public class CollectionsExercises {

    public LinkedList<Integer> useLinkedList() {
        // TODO: create an empty linked list
        LinkedList<Integer> intLinkedList = new LinkedList<Integer>();
        //  - add 4 as the first element of the list
        intLinkedList.add(4);
        //  - then add 5, 6, 8, 2, 9 to the list
        intLinkedList.add(5);
        intLinkedList.add(6);
        intLinkedList.add(8);
        intLinkedList.add(2);
        intLinkedList.add(9);
        //  - add another 2 as the last element of the list
        intLinkedList.addLast(2);
        //  - add 4 as the 3rd element of the list
        intLinkedList.add(2, 4);
        //  - invoke the method element() on the list and print the result on the screen
        System.out.println(intLinkedList.element());
        //  - return the list
        return intLinkedList;
    }

    public Stack<Integer> useStack() {
        // TODO: create an empty
        Stack<Integer> intStack = new Stack<Integer>();
        //  - add 5, 6, 8, 9 to the stack
        intStack.push(5);
        intStack.push(6);
        intStack.push(8);
        intStack.push(9);
        //  - print the first element of the stack on the screen
        System.out.print(intStack.firstElement());
        //  - print the last element of the stack on the screen
        System.out.print(intStack.lastElement());
        //  - invoke the method pop() on the stack and print the result on the screen
        System.out.print(intStack.pop());
        //  - invoke the push(4) method on the stack
        intStack.push(4);
        //  - return the stack
        return intStack;
    }

    public ArrayDeque<Integer> useArrayDeque() {
        // TODO: create an empty arrayDeque
        ArrayDeque<Integer> intArrayDeck= new ArrayDeque<Integer>();
        //  - add 5, 6, 8, 9 to the stack
        intArrayDeck.add(5);
        intArrayDeck.add(6);
        intArrayDeck.add(8);
        intArrayDeck.add(9);
        //  - print the first element of the queue on the screen
        System.out.print(intArrayDeck.peekFirst());
        //  - print the last element of the queue on the screen
        System.out.print(intArrayDeck.peekLast());
        //  - invoke the method poll() on the queue and print the result on the screen
        System.out.print(intArrayDeck.poll());
        //  - invoke the element() method on the queue and print the result on the screen
        System.out.print(intArrayDeck.element());
        //  - return the queue
        return intArrayDeck;
    }

    public HashMap<Integer, String> useHashMap() {
        // TODO: create an empty hash map
        HashMap<Integer, String> newHashMap = new HashMap<Integer, String>();
        //  - add {1, TypeScript} entry to the map
        newHashMap.put(1, "TypeScript");
        //  - add {2, Kotlin} entry to the map
        newHashMap.put(2, "Kotlin");
        //  - add {3, Python} entry to the map
        newHashMap.put(3, "Python");
        //  - add {4, Java} entry to the map
        newHashMap.put(4, "Java");
        //  - add {5, JavaScript} entry to the map
        newHashMap.put(5, "JavaScript");
        //  - add {6, Rust} entry to the map
        newHashMap.put(6, "Rust");
        //  - determine the set of keys from the map and print it on the screen
        System.out.print(newHashMap.keySet());
        //  - determine the set of keys from the map and print it on the screen
        System.out.print(newHashMap.values());
        //  - determine whether the map contains "English" as a language and print the result on the screen
        System.out.print(newHashMap.containsValue("English"));
        //  - return the map
       return newHashMap;
    }

    public String getName() {
        return "Collections Exercises";
    }
}
