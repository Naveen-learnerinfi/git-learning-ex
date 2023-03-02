package com.task;

public class Daughter extends Mother {
	public void degree() {
		System.out.println("MBBS");
	}
	
public static void main(String []args) {
	Daughter gift = new Daughter();
	gift.degree();
	gift.loan();
	gift.property();
	
}
}
