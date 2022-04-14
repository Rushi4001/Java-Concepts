package practice;

import java.util.ArrayList;
import java.util.List;

public class collectionList {

	public static void main(String[] args) {
		
		List values = new ArrayList();
		values.add(4);
		values.add(5);
		values.add(6);
		values.add(2,2);   // add in between the array
		values.add("3");  // we can add any datatype beacuse it is object it internally consider as
						  // Integer v = new Integer();
		
		System.out.println(values);
		
		// for loop
		for(int i=0; i<values.size() ; i++)
		{
			System.out.println(values.get(i));
		}
		
		// Enhanced loop
		for(Object o : values)
		{
			System.out.println(o);
		}
	}

}
