/*
Write a program that prompts the user to enter the vertices of a triangle 
(x1,y1), (x2, y2), (x3, y3) and displays its area.

	Faith Winford | 02/05/24
*/

import java.util.*;

public class AreaofTriangle
{
	public static void main(String[] args)
	{

	//declarations
	double x1, y1, x2, y2, x3, y3, side1, side2, side3, s; //input
	double area; //output

	Scanner triangle = new Scanner(System.in);

	//input
	// asks user for first set of coordinates
	System.out.print("Enter coordinates of one point of the triangle (x1 y1) seperated by a space: ");
	x1 = triangle.nextDouble();
	y1 = triangle.nextDouble();

	// asks user for second set of coordinates
	System.out.print("Enter coordinates of another point of the triangle (x2 y2) seperated by a space: ");
	x2 = triangle.nextDouble();
	y2 = triangle.nextDouble();

	// asks user for third set of coordinates
	System.out.print("Enter coordinates of the last point of the triangle (x3 y3) seperated by a space: ");
	x3 = triangle.nextDouble();
	y3 = triangle.nextDouble();

	// processing
	// calculuates length of each side based on coordinate points (distance formula)
	side1 = Math.sqrt(Math.pow((x2 - x1), 2)+ Math.pow((y2 - y1), 2));
	side2 = Math.sqrt(Math.pow((x1 - x3), 2)+ Math.pow((y1 - y3), 2));
	side3 = Math.sqrt(Math.pow((x3 - x2), 2)+ Math.pow((y3 - y2), 2));

	// calculates s value
	s = ((side1+side2+side3)/2);

	// calculates area of the triangle
	area = Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));

	// output
	// displays the calculated area of the triangle
	System.out.println("The area of the triangle is " + area);

	}


}