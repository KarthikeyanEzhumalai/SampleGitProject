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
			
			else if (Character.isLowerCase(ch)) {
				
				char c2 = Character.toUpperCase(ch);
				
				r=r+c2;
				
				
			}
			else {
				
				r = r+ch;
			}
			
		}		
	
		System.out.println(r);
	}

}
