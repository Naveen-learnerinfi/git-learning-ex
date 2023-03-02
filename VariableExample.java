package com.task;

public class VariableExample {
	int score = 152; // class variable - outside method ,inside class.
	int wicket;// declare
	boolean opposite ;
	byte overs = 12;
	
	//--------------------------------------------------------//
	// static variable - outside class , can call without creating object in main method.can use the variable in method
	static String movie = "Varanam Ayiram";
	static int watched = 20;
	static char rating = 'U';
	
	private static void favmovie() {
		System.out.println("my favmovie is "+movie);
		System.out.println("i watched this movie "+watched+" times");
		System.out.println("This movie is "+rating+" certified");
	}
	
	
	private void message() {
		// local variable -- inside in method ,declaration is not possible 
		int age =12;// initialisation
		String name = "naveen";
		char grade = 'A';
		byte overs = 20; // local variable has high priority than class variable .
		System.out.println("Hi i am "+name);
		System.out.println("my age is "+age);
		System.out.println("my grade is "+grade);
		System.out.println("my score is "+score);
		System.out.println("wicket for 5 overs is "+wicket);
		System.out.println("opposite team won the match is it true or false , no it is "+opposite);
		System.out.println("total overs is "+overs);
		
	}

	public static void main(String[] args) {
		VariableExample msg1 = new VariableExample();
		msg1.message();
		System.out.println("***************************************************************");
		favmovie();
		
		
     
	}

}
