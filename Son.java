package com.task;

public class Son extends Mother {
	public void education() {
		System.out.println("BTECH");
	}
	
public static void main(String []args) {
	Son gift = new Son();
	gift.loan();
	gift.education();
	gift.property();
}
}
