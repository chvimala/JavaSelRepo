package coreJava.collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class CharCountUsingHashMap {

	public static void main(String[] args) {


		String name="Rama";

		char[] c = name.toCharArray();

		HashMap<Character, Integer> countMap = new HashMap<Character, Integer>();


		for(char x : c)
		{

			if(countMap.containsKey(x)) {
				countMap.put(x, countMap.get(x)+1);
			}else {
				countMap.put(x, 1);
			}
		}

		for(Map.Entry<Character, Integer> entry : countMap.entrySet()) {

			System.out.println(entry.getKey()+" "+entry.getValue());
		}

	}

}
