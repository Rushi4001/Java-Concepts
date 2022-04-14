package practice;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class mapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String,String> map = new HashMap<>();
		map.put("my name", "navin");
		map.put("actor", "rushi");
		map.put("ceo", "john");
		
		Set<String> keys = map.keySet();
		
		for(String key : keys)
		{
			System.out.println(key + " " + map.get(key));
		}
		
		
	}

}
