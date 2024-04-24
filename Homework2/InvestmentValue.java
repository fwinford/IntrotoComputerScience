/*
Write a program that reads an investment amount, annual interest rate, and
the number of years, and displays the future investment value

	Faith Winford | 02/05/24
*/

import java.util.*;

public class InvestmentValue
	{
	public static void main(String[] args)
	{

	//declarations
	double investamt, numofyears, interestrate; //input
	double futureinvestvalue; //output

	Scanner values = new Scanner(System.in);


	// input
	// asks user for initial investment amount
	System.out.print("Enter the amount you would like to invest: ");
	investamt = values.nextDouble();

	// asks how many years user would like invest
	System.out.print("Enter how many years you would like to invest for: ");
	numofyears = values.nextDouble();

	// asks user for interest rate and converts to decimal format
	System.out.print("What is the interest rate of the account: ");
	interestrate = values.nextDouble()/100;


	// processing
	// calculates future investment value using compound interest formula
	futureinvestvalue = investamt * Math.pow(1 + (interestrate/12), numofyears * 12);


	// output
	// displays the future investment value and numbers of years
	System.out.println("Your account will be worth " + futureinvestvalue + " in " + numofyears + " year(s)");

	}
	}
