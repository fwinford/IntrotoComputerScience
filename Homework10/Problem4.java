/*
Faith Winford | Homework 10 Problem 4 | converts binary string to decimal number
 */
package Homework10;
import java.util.*;

public class Problem4 {
    // convert binary string to decimal
    public static int bin2Dec(String binaryString) {
        int decimal = 0;
        int strLength = binaryString.length();
        // loop through each character of binary string
        for (int i = 0; i < strLength; i++) {
            // check if the character is a valid binary digit (0 or 1)
            if (binaryString.charAt(i) != '0' && binaryString.charAt(i) != '1')
                throw new NumberFormatException("Not Binary");

             // convert binary to decimal
            decimal += (int) ((binaryString.charAt(i) - '0') * Math.pow(2, strLength - 1 - i));
        }
        return decimal;
    }

    public static void main(String[] args)
    {
        // gets binary string input from user
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Binary Value: ");
        String str = input.nextLine();

        try{
            // convert binary string to decimal
            System.out.println("Value = " + bin2Dec(str));
        }
        // if input is not valid binary number
        catch(NumberFormatException e){
            System.out.println("Error: " + e.getMessage());
        }
    }
}