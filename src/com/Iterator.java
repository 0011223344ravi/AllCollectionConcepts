package com;
//having read and remove methods
//works only in single direction forward direction
//can be used any collection object

import java.util.ArrayList;

public class Iterator {

	public static void main(String[] args) {
		ArrayList  al = new ArrayList();
		for(int i =0; i<10; i++) {
			al.add(i);
			
		}
		
		
		 java.util.Iterator itr =   al.iterator();
		 while (itr.hasNext()) {
			 Integer i = (Integer) itr.next();
			 if(i%2==0)
				 System.out.println(""+i);
			 else 
				itr.remove();
			 
		 }
		 

	}

}
