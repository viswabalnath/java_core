package main.java;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupingByFirstChar {

	public static void main(String[] args) {

		List<String> list = List.of("aaa", "abcx", "arts", "bugs", "ask", "bag", "cup", "carpet", "cat","did");

		Map<Character, List<String>> map = list.stream().collect(Collectors.groupingBy(e -> e.charAt(0)));
	
		map.entrySet().stream().forEach(e -> System.out.println(e.getKey() +"="+e.getValue()));
	
		Map<Object, List<String>> map2 = list.stream().collect(Collectors.groupingBy(e -> e.length()));
		
		System.out.println(map2);
	}

}
