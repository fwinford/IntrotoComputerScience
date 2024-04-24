/*
Write a program that prompts the user to enter two points (x1, y1) and (x2,y2) and displays the distance between them. 

	Faith Winford | 02/03/24
*/

import java.util.*;

public class DistanceFormula
{
		public static void main(String[] args)
		{

		//declarations

		double x1, x2, y1, y2; //input for coordinates
		double distance; // output for distance formula

		Scanner coordinates = new Scanner(System.in);


		//input 
		// asks user for first two cooordinates
		System.out.print("Enter two coordinates seperated by a space: ");
		x1 = coordinates.nextDouble();
		y1 = coordinates.nextDouble();

		// asks user for second sext of coordinates
		System.out.print("Enter two new coordinates seperated by a space: ");
		x2 = coordinates.nextDouble();
		y2 = coordinates.nextDouble();


		//processing
		// calculates distance using distance formula
		distance = Math.sqrt(Math.pow((x2 - x1), 2)+ Math.pow((y2 - y1), 2));


		//output
		// displays the caculated distance between the two points
		System.out.println("The distance between the two points you provided is " + distance);
		}
}