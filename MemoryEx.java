package com.task;

public class MemoryEx {

	public static void main(String[] args) {
		// mutable - non literal string , duplicate values- new memory & operations -share memory
        // stringbuilder refname = new stringbuilder ("value");- fast process , unsafe thread
		// stringbuffer refname = new stringbuffer ("value"); -slow process, safe thread
		// string refname = new ("value");
		System.out.println("++++++++++++++++++++++mutable+++++++++++++++++++++++++++++++++++++++");
		StringBuilder var = new StringBuilder("car");
	System.out.println(System.identityHashCode(var));
	StringBuilder var1 = new StringBuilder("car");
	StringBuilder var2 = new StringBuilder ("parking");
	System.out.println(System.identityHashCode(var1));
	String name = new String("pradeep");
	System.out.println(System.identityHashCode(name));
	String name1 = new String ("pradeep");
	System.out.println(System.identityHashCode(name1));
	System.out.println(System.identityHashCode(var1 = var1.append(var2)));
	System.out.println("++++++++++++++++++++++immutable+++++++++++++++++++++++++++++++++++++++");	
	// immutable - literal string , duplicate vaalue - share memory , concordination - new memory
	String prd = "jef";
	System.out.println(System.identityHashCode(prd));
	String prd1 = "jef";
	String lst = "jhonson";
	System.out.println(System.identityHashCode(prd1));
	System.out.println(System.identityHashCode(prd = prd+lst));
	
		
		
		
	}

}
