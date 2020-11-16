package org.course;

public class ReverseString2 {
	public static void main(String[] args) {
		String R = " Rithika";
		String A = "";
		for(int i =R.length()-1; i>0;i--) {
			char ch = R.charAt(i);
			A = A+ch;
			
		}
		
		System.out.println(A);
	}

}
