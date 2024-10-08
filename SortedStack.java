/**
 * Kambal Vaidya
 * Module 5
 * Programming Assignment
 * Software Design and Documentation
 * 
 * Command to run javadoc: javadoc SortedStack.java
 * Commands to run program 
 * 1. javac -d bin *.java 
 * 2. java -cp bin .\SortedStack.java

 */

import java.util.Collections;
import java.util.Scanner;
import java.util.Stack;

/**
 * This class takes integer input from the user and stores the result into a sorted stack.
 * It uses the Collections Stack as a base to build the program off.
 * It also uses the Collections to sort the list.
 */
public class SortedStack {
    /**
     * The main method runs the program
     * This start by promting the user for input using scanner
     * It will add to the stack and sort before printing and asking again
     * The program will end when the user types in Done
     * @param args not used, but allows running the program
     */
    public static void main(String[] args) {

        /**  Create a Stack to store integers
         * This is an example of code reuse as we already have the Stack
         * class created so we don't need to make it, and we can use the given methods to access 
         * and add to it.
         * 1 of the lines changed for maintenance task for changing linkedlist to stack
         * Changing the storage type neede to replace the list version of linkedlist directly with the stack class
         */
        Stack<Integer> sortStack = new Stack<>();
        
        // Create a Scanner object for reading input
        Scanner scanner = new Scanner(System.in);

        // Read integers from input
        System.out.println("Please enter integers (type 'done' to finish):");
        while (scanner.hasNext()) {
            if (scanner.hasNextInt()) {

                /** Add the integer to the linked list
                 *  This is code reuse since the function to add is a part of stack class imported
                 * Changed line from adding to the list to adding into the stack
                */
                sortStack.add(scanner.nextInt());
                
                /** 
                 * Sort the stack after each input
                 * Using the imported collections.sort
                 * Good use of code reuse since using a given code that sorts the specific collection of stack
                 * 1 of the lines changed for maintenance task for changing linkedlist to stack 
                 */ 
                Collections.sort(sortStack);

                // Display the stack after sorting
                System.out.println("Current sorted Stack: " + sortStack);
            } else if (scanner.next().equalsIgnoreCase("done")) {
                // Break the loop when user types "done"
                break;
            } else {
                System.out.println("Please enter a valid integer or 'done' to finish.");
            }
        }

        // Closing the scanner
        scanner.close();

        // Print the final stack
        System.out.println("Final Sorted Stack: " + sortStack);
    }
}
