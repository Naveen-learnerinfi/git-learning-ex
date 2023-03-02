package com.task;

public class TypecastExample {

	public static void main(String[] args) {
		System.out.println("Widening typecasting");
		byte length = 14; //  widening typecasting -> low memory to high memory
		double length1 = length;
		System.out.println(length1);

		char initial = 'k';
		int initial1 = initial;
		System.out.println(initial1); // ascii values

		float weight = 454.222f;
		double weight1 = weight;
		System.out.println(weight1);
		System.out.println("============================================================");
		System.out.println("Narrow typecasting");// high memory to low memory
		// datatype refname = (datatype) variablename;
		byte count = 14;
		double count1 = (double) count;
		System.out.println(count1);
		long val = 53145l;
		float val1 = (float)val;
		System.out.println(val1);

	}

}
