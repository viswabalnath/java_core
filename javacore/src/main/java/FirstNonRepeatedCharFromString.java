package main.java;

import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepeatedCharFromString {

	public static void main(String[] args) {

		String str = "swiss";
		
		Map<Character, Integer> map = new LinkedHashMap<Character, Integer>();
		for(char ch : str.toCharArray()) {
			map.compute(ch, (k, v) -> (v == null) ?1:++v); // Using compute method
		}
		for(Map.Entry<Character, Integer> entry : map.entrySet()) {
			if(entry.getValue() ==1) {
				System.out.println("First Non Repeated Character: " + entry.getKey());
				break;
			}
		}
	}

}
