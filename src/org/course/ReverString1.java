package org.course;

public class ReverString1 {
	public static void main(String[] args) {
		String S = " Roopa";
		String  R = "";
		for(int i=S.length()-1; i>0;i--) {
			char ar = S.charAt(i);	
			R = R+ar;
			
			
		}
		
		System.out.println(R);
	}

}
