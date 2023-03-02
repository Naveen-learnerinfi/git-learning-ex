package com.task;

import java.util.ArrayList;
import java.util.List;

public class Listex {

	public static void main(String[] args) {
		List <Object> register = new ArrayList<Object>();
        // List - interface , ArrayList - class 
		register.add("Naveen");
		register.add(4588);
		register.add("blue");
		register.add("Kumar");
		register.add(5.9);
		register.add("bike");
		System.out.println(register);
		int size = register.size();
		System.out.println("the size of the list is "+size);
		boolean contains = register.contains("bike");
		System.out.println(contains);
		register.add(6, "car");
		System.out.println(register);
		Object object = register.get(3);
		System.out.println(object);
		Object remove = register.remove(2);
		System.out.println(remove);
		System.out.println(register);
		register.
		
		
		
	}

}
