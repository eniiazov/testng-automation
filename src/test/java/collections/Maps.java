package collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Maps {
	
	public static void main(String[] args) {
		Map<String, String> phoneNumbers = new HashMap<>();
		
		phoneNumbers.put("Esen", "608-123-4567");
		phoneNumbers.put("sn", "608-123-4567");
		phoneNumbers.put("hi", "Hello");
//		System.out.println(phoneNumbers.get("hi"));
		System.out.println("ending");
		
		Set<String> keys = phoneNumbers.keySet();
		
		for(String key: keys) {
			System.out.println(phoneNumbers.get(key));
		}
	}

}

















