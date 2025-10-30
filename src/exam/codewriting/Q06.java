package exam.codewriting;

import java.util.Scanner;

import edu.princeton.cs.introcs.StdDraw;

public class Q06 {

	/*
	Examine the following iterative implementation of a method that computes the square root
	of a given value using the Babylonian method:
	 */
	public static double sqrt ( double x) {
		double xOld = x;
		double xNew = x / 2;
		while ( Math .abs( xOld - xNew ) > 0.001) { // absolute value
			xOld = xNew ;
			xNew = ( xNew + (x / xNew )) / 2;
			System .out. println ( xOld );
		}
		return xNew ;
	}
	
	//Your task is to write a recursive implementation of the above method.
	//You should use a helper method as part of your recursive implementation.

	private static double helper(double x, double guess, double precision) {

		double newGuess = (x/guess + guess)/2;

		if (Math.abs(newGuess - guess) <= precision) {
			return newGuess;
		}

		return helper(x, newGuess, precision);	

	}


	public static double sqrtR( double x ) {
		return helper(x,x/2,0.001);
	}

	

	public static void main ( String[] args ) {
		System.out.println(sqrt(5)); //given method
		System.out.println(Math.sqrt(5));
		System.out.println(sqrtR(5)); //your recursive method
		
	}

}
