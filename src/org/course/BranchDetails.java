package org.course;

public class BranchDetails {
	
	public void chennai() {
		System.out.println("chennai");
	}
	
	public void staffDetails() {
		System.out.println("staffDetails");
	}

	public static void main(String[] args) {
		BranchDetails B = new BranchDetails();
		B.chennai();
		B.staffDetails();
	}
}
