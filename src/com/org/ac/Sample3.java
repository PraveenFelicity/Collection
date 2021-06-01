package com.org.ac;

import java.util.ArrayList;
import java.util.List;

public class Sample3 {
public static void main(String[] args) {
	List <String> r = new ArrayList<> ();
	r.add("Thalapathi");
	r.add("Annamalai");
	r.add("Basha");
	r.add("Muthu");
	r.add("Arunachalam");
	r.add("Padayappa");
	System.out.println(r);
	
	for (int i = 0; i < r.size(); i++) {
		String v = r.get(i);
		System.out.println(v);
	}
	
	
	
	
}
	
}
