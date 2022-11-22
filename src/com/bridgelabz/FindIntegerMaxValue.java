package com.bridgelabz;

import java.util.Scanner;

public class FindIntegerMaxValue {

	public static void maxOfInteger(Integer x,Integer y,Integer z) {
		Integer max = x;
		if(y.compareTo(max) > 0) {
			max = y;
		}
		if(z.compareTo(max) > 0) {
			max = z;
		}
		System.out.println("Maximum Ingtegr Number is :"+max);
	}
	public static void main(String[] args) {
		Integer a,b,c;
		Scanner read = new Scanner(System.in);
		System.out.println("Enter the Integer Value of a");
		a = read.nextInt();
		System.out.println("Enter the Integer Value of b");
		b = read.nextInt();
		System.out.println("Enter the Integer Value of c");
		c = read.nextInt();
		read.close();
		maxOfInteger(a,b,c);
	}
}
