package practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class collectionDemo {

	public static void main(String[] args) {
		
		ArrayList values = new ArrayList();
		values.add(4);
		values.add(5);
		values.add(6);
		
		/// 1
		System.out.println(values);
		
		
		Iterator it = values.iterator();
		
		// 2
//		System.out.println(it.next());
//		System.out.println(it.next());
//		System.out.println(it.next());
//		
		//3
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
	}

}
