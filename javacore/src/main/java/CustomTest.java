package main.java;

import java.util.Comparator;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CustomTest {

	public static void main(String[] args) {

		System.out.println("Custom Test");
		String str = "viswanath balisetty";
		Map<Character, Long> map = str.chars().mapToObj(c -> (char) c).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		
	System.out.println(map);
	
	map.entrySet()
		.stream()
		.sorted((a,b) -> a.getValue().compareTo(b.getValue()))
		.forEach(e -> System.out.println(e.getKey() +" - " + e.getValue()));
	}

}
