package com.bridgelabz;

import java.util.Scanner;
public class UC2LengthEquals {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x1,y1,x2,y2;
		double Line1=0.0;
		System.out.println("Welcome TO Line Computation Program");
		System.out.println("Enter Co-ordinates For Line");
		System.out.println("Enter x1");		
		x1=sc.nextInt();
		System.out.println("Enter x2");		
		x2=sc.nextInt();
		System.out.println("Enter y1");		
		y1=sc.nextInt();
		System.out.println("Enter Y2");		
		y2=sc.nextInt();
		Line1 = Math.sqrt(Math.pow((x2 - x1), 2)+Math.pow((y2 - y1), 2));
		System.out.println("Length of Line is"+Line1);

		int a1,b1,a2,b2;
		double Line2=0.0;
		System.out.println("Enter Co-ordinates For Line2");
		System.out.println("Enter a1");		
		a1=sc.nextInt();
		System.out.println("Enter a2");		
		b1=sc.nextInt();
		System.out.println("Enter a3");		
		a2=sc.nextInt();
		System.out.println("Enter a4");		
		b2=sc.nextInt();
		Line2 = Math.sqrt(Math.pow((a2 - a1), 2)+Math.pow((b2 - b1), 2));
		System.out.println("Length of Line is"+Line2);

		String str1=Double.toString(Line1);
		String str2=Double.toString(Line2);
		if(str1.equals(str2)==true)
		{
			System.out.println("Lines is Equal");
		}
		else 
			System.out.println("Lines are not equal");


	}
}
