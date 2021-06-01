package com.org.ac;

import java.util.ArrayList;
import java.util.List;

public class SampleList {

	public static void main(String[] args) {
	
		List v = new ArrayList();
		v.add("Rajini");
		v.add("1950");
		v.add('@');
		v.add("Rajini");
		System.out.println(v);
		int e = v.size();	
		System.out.println(e);
		Object o = v.get(3);
		System.out.println(o);
		
		List <String> r = new ArrayList<> ();
		r.add("Thalapathi");
		r.add("Annamalai");
		r.add("Basha");
		r.add("Muthu");
		r.add("Arunachalam");
		r.add("Padayappa");
		System.out.println(r);
		int st = r.size();
		System.out.println(st);
		Boolean b = r.contains("Muthu");
		System.out.println(b);
		int i = r.indexOf("T");
		System.out.println(i);
		r.set(4, "Thalapathi");
		System.out.println(r);
		r.add(4, "Baba");
		System.out.println(r);
		r.remove(4);
		System.out.println(r);
		
		
	}
	
}
