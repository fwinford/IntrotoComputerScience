/*
Faith Winford | Homework 10 Problem 2 | Return inion of two ArrayList
 */
package Homework10;

import java.util.ArrayList;
import java.util.Scanner;

public class Problem2 {
    public static void main(String[] args) {
        // create scanner
        Scanner input = new Scanner(System.in);

        // create arraylists
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();

        // get first list
        System.out.print("Enter 5 integers: ");
        for (int i = 0; i < 5; i++) {
            list1.add(input.nextInt());
        }
         // get second list
        System.out.print("Enter 5 integers: ");
        for (int i = 0; i < 5; i++) {
            list2.add(input.nextInt());
        }

        // new list with union of list
        ArrayList<Integer> finallist = union(list1, list2);

        // displays final list without duplicates
        System.out.print("List without duplicates: ");
        for (int i = 0; i < finallist.size(); i++) {
            System.out.print(finallist.get(i) + " ");

        }
    }
        // computes union of two ArrayLists
        public static ArrayList<Integer> union(ArrayList<Integer> list1, ArrayList<Integer> list2){
            // creates new ArrayList to store union
            ArrayList<Integer> newList = new ArrayList<>();

            // add all elements of list1 to newList
            newList.addAll(list1);

            // iterate through list2
            for (int i = 0; i < list1.size(); i++){
                // if an element from list2 is not already in newList, add it
                if (!newList.contains(list2.get(i)))
                    newList.add(list2.get(i));
            }

            // return final union list
            return newList;
        }

}
