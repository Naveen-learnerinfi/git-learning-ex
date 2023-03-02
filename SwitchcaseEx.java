package com.task;

import java.util.Scanner;

public class SwitchcaseEx {

	public static void main(String[] args) {
	String power []= new String[4];
	power[0]= "shutdown";
	power[1]= "sleep";
	power[2]= "restart";
	power[3]= "options";
	Scanner admin = new Scanner(System.in);
	System.out.println("enter 0-4 for controlling power functions in your system:");
	int i = admin.nextInt();
	switch (i) {
	case 0:
		System.out.println("system is going to "+power[i]);
		break;
	case 1:
		System.out.println("system is going to "+power[i]);
		break;
	case 2 :
		System.out.println("system is going to "+power[i]);
		break;
	case 3:
		System.out.println("Explore "+power[i]);
		break;
	default:
		System.out.println("invalid input");
		
	}

	}

}
