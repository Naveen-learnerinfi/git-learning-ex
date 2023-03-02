package com.task;

public class Bankinfo {
	public void user_Id() {
		System.out.println("Id is uni7414");	
	}
	
	public void  user_password(String code) {
		System.out.println("password is "+code);
		
	}
	public void otp(int key) {
		System.out.println("otp is "+key);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bankinfo user1 = new Bankinfo();
		user1.user_Id();
		user1.user_password("atap57@*lpo");
		user1.otp(8745);

	}

}
