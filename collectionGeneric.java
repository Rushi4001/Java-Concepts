package practice;

import java.util.ArrayList;
import java.util.List;

public class collectionGeneric {

	public static void main(String[] args) {
		
		List<Integer> values = new ArrayList();
		values.add(4);
		values.add(5);
		values.add(6);
		values.add(2,2);   // add in between the array
		//values.add("3");   // String data type you can not add in integer list
		
		System.out.println(values);
		
		// Enhanced loop
		for(Integer o : values)
		{
			System.out.println(o);
		}
		
	}

}
