package main.java;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class StringCharsCountUsingCompute {

	public static void main(String[] args) {

		String str = "viswanathbalisetty";
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		
	// APPROACH-1
		for(char ch : str.toCharArray()) {
			map.compute(ch, (k, v) -> (v == null) ?1:++v); // Using compute method
		}
		System.out.println(map);
		map.clear();
		
    // APPROACH-2
		for(char ch : str.toCharArray()) {
			if(map.containsKey(ch))
				map.put(ch, map.get(ch)+1);
			else
				map.put(ch, 1);
		}
		System.out.println(map);
	// APPROACH-3
		Map<Character, Long> map3= str.chars()
				.mapToObj(c ->(char)c)
				.collect(Collectors.groupingBy(c->c, Collectors.counting()));
		System.out.println(map3);
	}

}
