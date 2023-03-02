package com.task;

import java.util.Scanner;

public class ConditionExample {
	private void criteria() {
		Scanner input = new Scanner(System.in);
		int age = input.nextInt();
		if (age>=18&& age <=50) {
			System.out.println("user is adult");
		} else if (age>50) {
			System.out.println("user is senior citizen");
			
		}else {
			System.out.println("user is child");
			
		}
	}
	public static void main(String[] args) {
		System.out.println("enter the age :");
		ConditionExample user1 = new ConditionExample();
		user1.criteria();
		System.out.println("enter the age :");
		ConditionExample user2 = new ConditionExample();
		user2.criteria();
		
	}
	
}
	
	