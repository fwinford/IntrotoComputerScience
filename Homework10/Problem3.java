/*
Faith Winford | Homework 10 Problem 3 | Creates array with 10 random integers, tells user if index is out of bounds
 */
package Homework10;
import java.util.*;

public class Problem3 {
    public static void main (String[] args) {
        // creates random object
        Random random = new Random();

        // create array to store 100 integers
        int[] array = new int[100];

        // fills array with random integers between 0 and 100
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(101);
        }

        // gets index from user
        Scanner input = new Scanner(System.in);
        System.out.print("enter index of the array: ");
        int index = input.nextInt();

        try {
            // prints value at specified inde
            System.out.println("Value at index " + index + ": " + array[index]);
        }catch (ArrayIndexOutOfBoundsException e) { //where index is out of bound
                System.out.println("Out of Bounds");
            }
        }
    }
