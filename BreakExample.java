package com.task;

public class BreakExample {

	public static void main(String[] args) {
		String content[]= new String[5];
		content[0] = "summary";
		content[1] = "introduction";
		content[2] = "content";
		content[3] = "skip";
		content[4] = "conclusion";
		for (int i = 0;i<content.length;i++) {
			if(content[i] == "skip") {
				continue;
			}
			System.out.println(content[i]);
			
		}
		
	}

}
