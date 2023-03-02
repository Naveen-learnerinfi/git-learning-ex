package com.task;

public class Gpay extends Bankinfo{//methodoverriding
	@Override
	public void user_Id() {

		super.user_Id();
	}
	@Override
	public void user_password(String code) {
		
		super.user_password(code);
	}
	@Override
	public void otp(int key) {
		
		super.otp(key);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
Gpay userg = new Gpay();
userg.user_Id();
userg.user_password("412jkn$");
userg.otp(4517);
	}

}
