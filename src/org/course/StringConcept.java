package org.course;

public class StringConcept {
	public static void main(String[] args) {
		String S = " Roopa";
		String R = "";
		for(int i = S.length()-1; i>0; i--) {
			char ch = S.charAt(i);
			R = R+ch;

					
		}
		
		System.out.println(R);

		
	}

}
