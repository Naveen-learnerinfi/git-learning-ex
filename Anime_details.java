package com.task;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Anime_details extends Anime_List { // access abstract class using extend keyword

	
	@Override
	public void animeName() {
		System.out.println("Naruto shippuden");
		
	}

	@Override
	public void ott() {
		// TODO Auto-generated method stub
		System.out.println("Netflix");
	}
	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		Anime_details anime1 = new Anime_details();
		anime1.animeName();
		anime1.ott();
		
		File file = new File("confiq.properties");
		System.out.println(file.getAbsolutePath());
	System.out.println(file.exists());	
	System.out.println(file.canRead());
	}

}
