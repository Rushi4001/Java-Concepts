package practice;

import java.util.HashSet;
import java.util.Set;

public class set {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Set<Integer> values = new HashSet<>();
		values.add(5);
		values.add(8);
		values.add(7);
		values.add(8);
		
		for(int i : values)
		{
			System.out.println(i);
		}
	}

}
