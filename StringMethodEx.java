package com.task;

public class StringMethodEx {

	public static void main(String[] args) {
		String names[]= {"naveen","john","abdullah","ifthi","hari"};
		for (String student : names) {
			System.out.println(student);// for each loop

		}

		String msg = "welcome all to tet23 seminar";
		String prd = "i like icecream";
		String prd1 = " and choclate";
		String c = "life";
		String f = "Life";		
		int len1 = 	msg.length();
		System.out.println(len1);
		System.out.println(msg.equals(prd));
		System.out.println(c.equalsIgnoreCase(f));
		String cmsg = msg.toUpperCase();
		System.out.println(cmsg);
		String lmsg = msg.toLowerCase();
		System.out.println(lmsg);
		boolean suff = c.endsWith("e");
		System.out.println(suff);
		boolean pref = c.startsWith("l");
		System.out.println(pref);
		System.out.println(prd.contains("like"));	
	int firstindex = 	prd1.indexOf('c');
	System.out.println(firstindex);
	int lastindex = prd1.lastIndexOf('c');
	System.out.println(lastindex);
    String fullmsg = prd.concat(prd1);
    System.out.println(fullmsg);
  String updmsg =  msg.replace('3', '4');
  System.out.println(updmsg);
  String[] splitex = msg.split(" ");
  for (String strl : splitex) {
	  
	  System.out.println(strl);
	
}
	
}

	}


