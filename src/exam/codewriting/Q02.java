package exam.codewriting;

import edu.princeton.cs.introcs.StdDraw;

public class Q02 {

	/**
	* Draw a dashed line from (x,0) to (x,1)
	* on a standard StdDraw canvas. The length of the
	* dashes and the space between the dashes should
	* both be 0.02.
	* @param x is the x coordinate for the dashed line
	*
	**/
	public static void dashedLine(double x) {
		StdDraw.setPenColor(0,0,0);
		for (double index = 0; index <=1; index = index + 0.04) {
			StdDraw.line(0.25, index, 0.25, index+0.02);
		}
	}

	public static void main(String[] args) {
		dashedLine(0.25);
	}

}
