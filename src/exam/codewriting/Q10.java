package exam.codewriting;

import java.util.Scanner;

import edu.princeton.cs.introcs.StdDraw;

public class Q10 {

	/*
	We wish to create a method to print a string n times all on 
	the same line, where n is a positive integer. For example:

		repeat("hi", 5) would print hihihihihi
		repeat("bye", 3) would print byebyebye

	Complete the method. You may use either iteration or recursion.
	 */
	public static String repeatIt (String text, int n) {

		String fin = "";
		for (int times = 0; times < n; times++) {
			fin = fin + text;
		}

		return fin;
	}

	public static String repeatRec (String text, int n) {

		if (n == 0) {
			return "";
		}

		return repeatRec(text, n-1) + text;
	}

	public static void main ( String[] args ) {
		repeatIt("hi", 5);
		repeatRec("bye", 3);

		System.out.println(repeatIt("hi", 5));
		System.out.println(repeatRec("bye", 3));
	}

}
