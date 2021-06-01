package com.org.ac;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;



public class Maps {

	public static void main(String[] args) {
	
		Map<String, Float> mt = new LinkedHashMap<>();
		mt.put("Rajinikanth",175000.50f);
		mt.put("Vijay", 100000.50f);
		mt.put("AjithKumar", 125000.50f);
		mt.put("Surya", 75000.50f);
		System.out.println(mt);
		
		Float s= mt.get("Vijay");
		System.out.println(s);
		Set<String> w = mt.keySet();
		System.out.println(w);
		Collection <Float> ft = mt.values();
		System.out.println(ft);
		Set<Entry<String, Float>> wt = mt.entrySet();
		for( Entry<String, Float> x : wt) {
		System.out.println(x);
		System.out.println(x.getKey());
		System.out.println(x.getValue());
		boolean t = mt.containsKey("Raghuvaran");
	System.out.println(t);
       boolean tp = mt.containsValue(75000.50f);
        System.out.println(tp);
	
		}
		
	}
	
	
}
