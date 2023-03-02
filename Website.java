package com.task;

public class Website { // constructor - dont have return type
	
	
	public Website() { // default constructor
		this("Naveen");
		System.out.println("Welcome to E-website ");
		
	}
	
	public Website(String name) { // parameterised constructor
		this("n@gmail.com",24);
		System.out.println("user name is "+name);
		
	}
	public Website(String emailid, int age) { 
		this(6786786745l);
		System.out.println("user emailid is "+emailid+" and user age is "+age);
		
	}
	
	public Website(long phone) { 
		System.out.println("user phone number is "+phone);
	}
	
	// this keyword used in constructor

	public static void main(String[] args) {
		Website user1 = new Website();
		/*
		 * Website user1name = new Website("Naveen"); Website user1info = new
		 * Website("ve@gmail.com", 24); Website user1ph = new Website(989787679l);
		 */
		

	}

}
