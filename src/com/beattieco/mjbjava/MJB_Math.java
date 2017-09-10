package com.beattieco.mjbjava;

import java.util.Scanner;

/**MJB_Math is a collection of methods for use when calculators aren't
 * possible.  Inverse_Factorial is a class with one method:  inverseFactorial.  This
 * method takes a number n as input and returns the factorial x! = n.
 * 
 * September 6, 2017
 * @author Matthew J. Beattie
 * @param name
 */

import java.lang.Math;

public class MJB_Math {

	//  inverseFactorial takes a number n as input and returns the factorial x! = n.
	public static double inverseFactorial(double num)
	{
		double x = 1;
		double j = 0;
		while (x < num)
		{
			j +=1;
			x = x * j;
		}
		return j;
	}
	
	/* nlognSolve takes a number num and solves for n in nlogn = num.
	 * This method only returns an ESTIMATE because it increases by integer steps.
	 * The method also uses base 2 for log, which is common for algortihm
	 * calculations.  Note that we assume that num is very large, hence j
	 * must increase a great amount for each step.
	 */
	public static double nlognSolve(double num)
	{
		double x = 0.0;
		double j = 0.0;
		while (x < num)
		{
			j += 1000.0;
			x = j * Math.log10(j)/Math.log(2);
		}
		return j;
	}
	
	public static double log(double num, double base)
	{
		return Math.log(num)/Math.log(base);
	}

	
	//  The main() method is used for calculation efforts
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter a number to investigate (num):  ");
		double num = keyboard.nextDouble();
		System.out.println("The factorial that generates num is " + MJB_Math.inverseFactorial(num));
		System.out.println("The solution for nlog(n) = num is n = " + MJB_Math.nlognSolve(num));
		
		System.out.println("\n\nEnter the base of the exponent:  ");
		num = keyboard.nextDouble();
		System.out.println("Enter the exponent:  ");
		double e = keyboard.nextDouble();
		System.out.println(num + " raised to " + e + " is:  " + Math.pow(num,e));
		
		
		System.out.println("Log in base 2 of 64 is:  " + MJB_Math.log(64, 2));
		
		keyboard.close();

	}
	
}
