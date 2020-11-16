package org.course;

public class ReverseString {
public static void main(String[] args) {
	String R = " Rithika";
	String RI = "";
	for(int i = R.length()-1;i>0;i--) {
		char ch = R.charAt(i);
		RI = RI+ch;
		
		
	}
System.out.println(RI);

}
}
