package map;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class MainClass {

	public static void main(String args[]) {
//		Map<String,Integer> numbers =new HashMap<>();
//		Map<String,Integer> numbers1 =new HashMap<>();
//
//		numbers1.put("e",1);
//
//		numbers1.put("f",1);
//
//		numbers1.put("g",1);
//
//		numbers.put("a",1);
//		
//		numbers.put("a",1);
//		numbers.put("b",2);
//		numbers.put("c",3);
//		numbers.put("d",4);numbers.putIfAbsent("a",6);
//		
//		numbers.putAll(numbers1);
//		System.out.println(numbers);
//		System.out.println(numbers.containsKey("f"));
//		System.out.println(numbers.values());
//		System.out.println(numbers.entrySet());
//		
//		
//		
//		for(Entry<String,Integer> entries: numbers.entrySet()) {
//			entries.setValue(entries.getValue()*1000);
//		}
//		System.out.println(numbers.entrySet());
		
	System.out.println(getHash("CAT"));
	System.out.println(getHash("DOG"));
	System.out.println(getHash("BALL"));
}
	public static int getHash(String s) {
	
		int hash=0;
		for (int i=0;i<s.length();i++) {
			hash+=s.charAt(i);
		}	
		return hash;
	
		}

	}	