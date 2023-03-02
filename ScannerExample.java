package com.task;

import java.util.Scanner;

public class ScannerExample {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("enter your name: ");
		String name = input.nextLine();
		System.out.println();
		System.out.println("enter your age: ");
		int age = input.nextInt();
		System.out.println();
		System.out.println("enter your cgpa:");
		float cgpa = input.nextFloat();
		System.out.println();
		System.out.println("enter your phone no:");
		long phno = input.nextLong();
		System.out.println();
		System.out.println("enter your initial ");
		char initial = input.next().charAt(6);
		input.close();
		
		System.out.println("user name is "+name);
		System.out.println("user age is "+age);
		System.out.println("user cgpa is "+cgpa);
		System.out.println("user phone no is "+phno);
		System.out.println("user initial is "+initial);
		
				
		

	}

}
