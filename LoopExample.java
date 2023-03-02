package com.task;

public class LoopExample {

	public static void main(String[] args) {
		System.out.println("for loop:");
		for(int i = 1; i<=5;i++) {
			System.out.print(" "+i);
		}
		System.out.println("\nwhile loop:");
		int j = 20;
		while(j<=25) {
			System.out.print(" "+j);
			j++;
		}
		System.out.println("\nDo while loop:");
		int k = 10;
		do {
			System.out.print(" "+k);
			k++;
		} while(k<=15);
		
	}

}
