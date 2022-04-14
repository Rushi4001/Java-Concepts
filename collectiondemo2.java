package practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class collectiondemo2 {

	public static void main(String[] args) {
		
		List<Integer> values = new ArrayList();
		values.add(464);
		values.add(598);
		values.add(679);
		values.add(275);
		
		//////////////////////////////////////////////////////////////////////////////////////////////////////
		Comparator<Integer> c = new Comparator<Integer>() {
			
			@Override
			public int compare(Integer i , Integer j) {
				if(i%10>j%10)
					return 1;
				else
					return -1;
			}
		};
		//////////////////////////////    Lambda Expression     /////////////////////////////////////////////
		
		// Comparator<Integer> c = (i,j)  -> i%10>j%10?1:-1;
		
		////////////////////////////////////////////////////////////////////////////////////////////////////
		Collections.sort(values, c);
		//Collections.reverse(values);
		//Collections.shuffle(values);
		
		for(Integer o : values)
		{
			System.out.println(o);
		}

	}

}
