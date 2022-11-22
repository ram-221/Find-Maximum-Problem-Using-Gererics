package com.bridgelabz;

import java.util.Scanner;

public class FindFloatMaxValue {

	public static void maxOfFloat(Float x,Float y,Float z) {
		Float max = x;
		if(y.compareTo(max) > 0) {
			max = y;
		}
		if(z.compareTo(max) > 0) {
			max = z;
		}
		System.out.println("Maximum Float Number is :"+max);
	}
	
	public static void main(String[] args) {
		Float a,b,c;
		Scanner read = new Scanner(System.in);
		System.out.println("Enter the Float Value of a");
		a = read.nextFloat();
		System.out.println("Enter the Float Value of b");
		b = read.nextFloat();
		System.out.println("Enter the Float Value of c");
		c = read.nextFloat();
		maxOfFloat(a,b,c);
		read.close();
	}
}
