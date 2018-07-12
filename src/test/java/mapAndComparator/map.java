package mapAndComparator;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class map {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Map < String,Integer> name=new HashMap<>();
name.put("a", 23);
name.put("b", 23);name.put("k", 23);
for(Entry<String, Integer> maps:name.entrySet()) {
	System.out.println(maps.getKey());
	System.out.println(maps.getValue());
}



}}
