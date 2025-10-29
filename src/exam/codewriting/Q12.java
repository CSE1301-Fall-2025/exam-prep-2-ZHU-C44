package exam.codewriting;

import edu.princeton.cs.introcs.StdDraw;

public class Q12 {

	public static void circle (double x, double y, double r) {
		if (r < 0.001) return;

		StdDraw.circle(x,y,r);

		circle(x-r,y+r,r/2);
		circle(x+r,y-r,r/2);
	}

	public static void square (double x, double y, double l) {
		if (l < 0.06) return;

		StdDraw.square(x,y,l);

		square(x-l,y+l,l/2);
		square(x+l,y-l, l/2);
	}

	public static void rDraw ( double xCtr , double yCtr , double size ) {
		square(xCtr,yCtr,size);

		double xCir = 0.125/2;
		double yCir = 1-0.125/2;

		for (int index = 0; index <= 8; index++) {
			circle(xCir, yCir, size/8);
			xCir = xCir + 0.125;
			yCir = yCir - 0.125;
		}
	}


	public static void main(String[] args) {
		//Your task is to complete the above method to draw the image
		//shown in "image03.png" in the images folder.

		//Your solution must use recursion

		StdDraw.setPenColor(0,0,0);

		rDraw (0.5 , 0.5 , 0.25);
	}

}
