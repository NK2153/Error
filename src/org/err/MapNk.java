package org.err;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapNk{
	public static void main(String[] args) {
		Map <String,Integer> aa = new LinkedHashMap();
		aa.put("NK", 1000000);
		aa.put("Ck", 9765468);
		aa.put("cj", 7657687);
		aa.put("cp", 98687576);
		
		System.out.println(aa);
		
		int size = aa.size();
		System.out.println(size);
		
		aa.put("KN", 76457658);
		System.out.println(aa);
		
		Integer integer = aa.get("cj");
		System.out.println(integer);
		
		aa.remove("KN");
		System.out.println(aa);
		
		
		
		Integer orDefault = aa.getOrDefault("NK", 1000000);
		System.out.println(orDefault);
		
		boolean containsKey = aa.containsKey("cp");
		System.out.println(containsKey);
		
		boolean containsValue = aa.containsValue(98687576);
		System.out.println(containsValue);
		
		Collection<Integer> values = aa.values();
		System.out.println(values);
		
		Set<String> keySet = aa.keySet();
		System.out.println(keySet);
		
		Set<Entry<String, Integer>> entrySet = aa.entrySet();
		System.out.println(entrySet);
		
		for (Entry<String, Integer> entry : entrySet) {
			System.out.println(entry);
		}
			
			for (Entry<String, Integer> entry : entrySet) {
			System.out.println(entry.getKey());
			System.out.println(entry.getValue());
			}
		
		
		
		
		
	}

}
