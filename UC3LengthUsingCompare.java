package com.bridgelabz;

import java.util.Scanner;

public class UC3LengthUsingCompare {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome TO Line Computation Program");
		System.out.println("Enter Co-ordinates For Line1");
		System.out.println("Enter x1");
		int x1= sc.nextInt();
		System.out.println("Enter y1");
		int y1= sc.nextInt();
		System.out.println("Enter x2");
		int x2= sc.nextInt();
		System.out.println("Enter y2");
		int y2= sc.nextInt();
		double length1 = Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1));
		System.out.println("length of line1 is:"+length1);
		System.out.println("Enter Co-ordinates For Line2");
		System.out.println("Enter x3");
		int a1= sc.nextInt();
		System.out.println("Enter y3");
		int b1= sc.nextInt();
		System.out.println("Enter x4");
		int a2= sc.nextInt();
		System.out.println("Enter y4");
		int b2= sc.nextInt();
		double length2 = Math.sqrt(Math.pow((a2 - a1), 2)+Math.pow((b2 - b1), 2));
		System.out.println("length of line2 is:"+length2);

		if (Double.compare(length1, length2) == 0) {
			System.out.println("Both the lines are equal in length");
		}
		else if (Double.compare(length1, length2) < 0) {
			System.out.println("The second line greater than first line");
		}
		else {
			System.out.println("The first line is greater than second line");
		}
	}
}