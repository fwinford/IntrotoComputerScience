/*
Write a program that prompts the user to enter a temperature between -58oF and 41oF and a wind speed greater than or equal to 2 mph
and displays the wind-chill temperature.

	Faith Winford | 02/05/24
*/

import java.util.*;

public class WindChillTemperature
{
	public static void main(String[] args)
	{

	// declarations
	double windspeeds, temperature; // input
	double windchilltemp; // output

	Scanner temp = new Scanner(System.in);


	// input
	//asks user for temperature
	System.out.print("Enter a temperature between -58F and 41F (numbers only) ");
	temperature = temp.nextDouble();

	//asks user for windspeed
	System.out.print("Enter a windspeed greater than or equal to 2mph (numbers only) ");
	windspeeds = temp.nextDouble();


	//processing & output
	// checks if temp is within vald range
	if ((temperature > -58) && (temperature < 41))
	{
		// checks if windpseeds is within valid range
		if (windspeeds >= 2)
		{
			
			windchilltemp = 35.74 + (0.6215) * (temperature) - 35.75 * (Math.pow(windspeeds, 0.16)) + 0.4275 * (temperature) * (Math.pow(windspeeds, 0.16));
			System.out.println("The wind-chill temperature is " + windchilltemp);
		}
		else
		{
			//prints error message if windspeed is invalid
			System.out.println("The windspeed you entered is not greater than or equal to 2mph");
		}
	}
	else
	{
		//prints error message if temp out of range
		System.out.println("The temperature you entered is not between -58F and 41F");

	}
	}
}
