package main.java;

import java.util.Comparator;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupingByStringChars {

	public static void main(String[] args) {

		String str = "viswanathbalisettyiamfrombangalore";
		Map<Character, Long> map = str.chars()
				.mapToObj(c->(char)c)
				.collect(Collectors.groupingBy(c->c, 
						Collectors.counting()));
	
		map.entrySet().stream().forEach(e -> System.out.print(e.getKey() + "-" + e.getValue() +", "));
	
		str.chars()
				.mapToObj(c->(char)c)
				.collect(Collectors.groupingBy(c->c, 
						Collectors.counting()))
				.entrySet().stream()
				.filter(e -> e.getValue() > 1)
				.sorted(Comparator.comparing(e->e.getKey()))
				.forEach(System.out::println);
	
	
		
	}

}
