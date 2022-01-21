package com.bridgelabz;

import java.util.Scanner;
public class UC1LineLength {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int x1,y1,x2,y2;
	double Line=0.0;
	System.out.println("Welcome TO Line Computation Program");
	System.out.println("Enter Co-ordinates For Line");
	System.out.println("Enter First co-ordinate");		
	x1=sc.nextInt();
	System.out.println("Enter Second co-ordinate");		
	x2=sc.nextInt();
	System.out.println("Enter Third co-ordinate");		
	y1=sc.nextInt();
	System.out.println("Enter Fourth co-ordinate");		
	y2=sc.nextInt();
	Line = Math.sqrt(Math.pow((x2 - x1), 2)+Math.pow((y2 - y1), 2));
	System.out.println("Lenth of Line is"+Line);
	}

}
