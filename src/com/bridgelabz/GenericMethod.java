package com.bridgelabz;

public class GenericMethod {

	  public static <T extends Comparable<T>> T maxOfValues(T a1, T a2, T a3) {
	        T max = a1;
	        if (a2.compareTo(max) > 0)
	            max = a2;
	        if (a3.compareTo(max) > 0)
	            max = a3;
	        System.out.println("Maximum Value is: "+max);
	        return max;
	    }

	    public static void main(String[] args) {
	    	maxOfValues(2,6,9);
	        maxOfValues(13.5, 4.47, 9.91);
	        maxOfValues("Class", "Method", "Object");
	    
	}
}
