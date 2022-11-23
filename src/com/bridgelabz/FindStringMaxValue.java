package com.bridgelabz;

import java.util.Scanner;

public class FindStringMaxValue {

	public static void maxOfString(String str1,String str2,String str3) {
		String max = str1;
		if(str2.compareTo(str3) > 0) {
			max = str2;
		}
		if(str3.compareTo(str3) > 0) {
			max = str3;
		}
		System.out.println("Mmaximum String length is :"+max);
	}
	public static void main(String[] args) {
		String str1,str2,str3;
		Scanner read = new Scanner(System.in);
		System.out.println("Enter the First String");
		str1 = read.next();
		System.out.println("Enter the Second String");
		str2 = read.next();
		System.out.println("Enter the Third String");
		str3 = read.next();
		maxOfString(str1,str2,str3);
		read.close();
	}
}
