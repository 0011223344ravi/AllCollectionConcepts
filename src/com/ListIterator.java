package com;
//it can be used for both direction and can be used for set and update.
//applicable only for the list objects 

import java.util.ArrayList;

public class ListIterator {

	public static void main(String[] args) {
		 ArrayList<Integer > al =new ArrayList<Integer>();
		 for (int i =0; i<10; i++)
			 al.add(i);
		 java.util.ListIterator<Integer>  li = al.listIterator();
		 while (li.hasNext()) {
			 Integer i = li.next();
			 if(i%2==0) {
				 li.set(i+1);
			 }
			 else {
				 li.set(i+2);
			 }
		 }
		 
		 
  System.out.println(al);
	}

}
