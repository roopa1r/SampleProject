package org.course;

public class Marklist extends Sample{
	public int a = 20;
	public void englishMark() {
		int a = 10; 
		System.out.println(a);
		System.out.println(this.a);
	    System.out.println(super.a);
	
		
	}
	
	public void scienceMark() {
		System.out.println(a);
		
	}

}
