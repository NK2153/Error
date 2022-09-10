package org.err;

import java.util.Scanner;



public class Mersal {
	Scanner s= new Scanner(System.in);
	
	private void marks() {
		int mark1 = s.nextInt();
		System.out.println(mark1);
		
		int mark2 = s.nextInt();
		System.out.println(mark2);
		
		int mark3 = s.nextInt();
		System.out.println(mark3);
		
		int mark4 = s.nextInt();
		System.out.println(mark4);
		
		
	}
	
	private int total() {
		int nextInt = s.nextInt();
		int mark2 = 39;
		int mark3 =90;
		int mark4 = 56;
		int mark1 = 40;
		int total = mark1+mark2+mark3+mark4;
//		int mark1=10;
//		int mark2=10;
//		int mark3=10;
//		int mark4=10;
		
		System.out.println(nextInt);
		return nextInt;
	}
	
	
	public static void main(String[] args) {
		Mersal aa = new Mersal();
		aa.marks();
		aa.total();
	
		
		
	}

}
