package com;

import java.util.Enumeration;
import java.util.Vector;
//universal Enumeration only works with legecay classes
//does not have remove method
//single direction forward direction

public class EnumerationExample {

	public static void main(String[] args) {
		 Vector v = new Vector<Integer>();
		 for (int i =0; i<10; i++) {
			 v.add(i);
			 
			 
		 }
		 
		 Enumeration enm = v.elements();
		 while(enm.hasMoreElements()){
			Integer i = (Integer) enm.nextElement(); 
			if(i%2==0)
				System.out.println(i);
			
		 }
		 
		  
			 System.out.println(v);

	}

}
