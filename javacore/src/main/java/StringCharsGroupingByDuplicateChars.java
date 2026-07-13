package main.java;

import java.util.Comparator;
import java.util.stream.Collectors;

public class StringCharsGroupingByDuplicateChars {

	public static void main(String[] args) {

		String str = "viswanathbalisettyiamfrombangalore";
	
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
