/*
Faith Winford | Homework 10 Problem 1 | Method to remove duplicates in an array list
 */

package Homework10;
import java.util.*;

public class Problem1 {
    public static void main(String[] args){
        // create scanner
        Scanner input = new Scanner(System.in);

        // create arraylist
        ArrayList<Integer> list = new ArrayList<>();

        // get 10 integers from user and add to array list
        System.out.print("Enter 10 integers: ");
        for (int i = 0; i < 10; i++){
            list.add(input.nextInt());
        }

        // removes duplicates from the list
        removeDuplicates(list);

        // displays new list
        System.out.print("List without duplicates: ");
        for (int i = 0; i < list.size(); i++){
            System.out.print(list.get(i) + " ");
        }

    }
    // remove duplicates from an ArrayList
    public static void removeDuplicates(ArrayList<Integer> list){
        // loop through each element of list
        for (int i = 0; i < list.size() - 1; i++){
            // compare curernt element with elements after it
            for (int j = i + 1; j < list.size(); j++){
                // if duplicate is found remove it
                if (list.get(i) == list.get(j))
                    list.remove(j);
            }
        }
    }
}
