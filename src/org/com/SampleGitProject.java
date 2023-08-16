package org.com;

public class SampleGitProject {
	public static void main(String[] args) {
		
		String s= "jA23Va";
		String r="";
		for (int i = 0; i < s.length(); i++) {
			
			char ch = s.charAt(i);
			if (Character.isUpperCase(ch)) {
				char c1 = Character.toLowerCase(ch);
				r=r+c1;
				
			}
			
		}	
	
		
	}	
	

}
