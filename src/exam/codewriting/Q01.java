package exam.codewriting;

import edu.princeton.cs.introcs.StdDraw;

public class Q01 {

    public static void recursiveCarpet(double xCtr, double yCtr, double halfLength) {
        if (halfLength < 0.01) {
			return;
		}

        double childHalf = halfLength / 3.0;

        // Draw the center square of this 3x3 subdivision
        StdDraw.filledSquare(xCtr, yCtr, childHalf);

        // Recurse into the 5 sub-squares that stay “active” in the Vicsek fractal
        recursiveCarpet(xCtr, yCtr, childHalf);                       // center
        recursiveCarpet(xCtr - childHalf*2, yCtr - childHalf*2, childHalf); // bottom-left
        recursiveCarpet(xCtr - childHalf*2, yCtr + childHalf*2, childHalf); // top-left
        recursiveCarpet(xCtr + childHalf*2, yCtr - childHalf*2, childHalf); // bottom-right
        recursiveCarpet(xCtr + childHalf*2, yCtr + childHalf*2, childHalf); // top-right
    }

	public static void main(String[] args) {
		//Your task is to complete the above method to draw the image
		//shown in "image01.png" in the images folder.

		//Your solution must use recursion

		double halfCarpetLength = 0.5 ;
		recursiveCarpet ( 0.5 , 0.5 , halfCarpetLength );
	}

}
