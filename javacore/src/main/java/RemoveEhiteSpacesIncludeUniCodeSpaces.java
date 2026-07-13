package main.java;

public class RemoveEhiteSpacesIncludeUniCodeSpaces {

	public static void main(String[] args) {

		String s1 = "\t \n    hello \t   \n";
		
		String s2 = "\u2002    hello    \u2002";
		
		System.out.println(s1.trim()); 
		System.out.println(s2.trim());// this will remove whitespaces not removes Unicode white spaces
		
		System.out.println(s2.strip()); //removes all spaces
//		System.out.println(s2.stripIndent());
		System.out.println(s2.stripLeading()); // removes starting spaces
		System.out.println(s2.stripTrailing());  // removes ending spaces
	}

}
