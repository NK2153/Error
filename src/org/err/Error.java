package org.err;

import java.awt.List;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class Error {
	public static void main(String[] args) {
		System.out.println("******ARRAY******");
		
		ArrayList aa = new ArrayList();
		
		aa.add(23);
		aa.add(90);
		aa.add(767);
		aa.add(56476);
		
		

		aa.size();
		System.out.println(aa);

		boolean contains = aa.contains(4);
		System.out.println(contains);
		
		int indexOf = aa.indexOf(767);
		System.out.println(indexOf);
		
		int lastIndexOf = aa.lastIndexOf(767);
		System.out.println(lastIndexOf);
		
		try {
			Object object = aa.get(6);
			System.out.println(object);
			
		} catch (Exception e) {
			System.out.println("57687");
			
		}finally {
			System.out.println("NK Project");
		}
		try {
			aa.remove(4);
			System.out.println(aa);

			
		} catch (Exception e) {
			System.out.println("675653");
			System.out.println("*****SET******");
		} 
	Set<Integer> a = new TreeSet<>();
	
	a.add(70);
	a.add(20);
	a.add(30);
	a.add(50);
	
	int size = a.size();
	System.out.println(size);
	
	boolean contains2 = a.contains(78);
	System.out.println(contains2);
	
	boolean empty = a.isEmpty();
	System.out.println(empty);
	
	a.remove(5);
	System.out.println(a);
	
	
	for (Integer integer : a) {
		System.out.println(integer);
	}
	System.out.println("*************MAP**************");
	
	
	}
	
	


	
	
	
	
	
	
}
