package com.task;

public class Login_Details implements Insta_login,Facebook_login {

	@Override
	public void userid() {
		System.out.println("naveen21");
		
	}

	@Override
	public void phNumber() {
	System.out.println("+91-45124789");
		
	}

	@Override
	public void emailId() {
		System.out.println("ex@gmail.com");
		
	}

	@Override
	public void userName() {
		System.out.println("naveenkumar");
		
	}
	public static void main(String[] args) {
		Login_Details user1 = new Login_Details();
		user1.emailId();
		user1.userName();
		user1.userName();
		user1.phNumber();
		
	}
	

}
