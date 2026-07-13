package main.java;

public class CommonPrefixCharsInStringArray {

	public static void main(String[] args) {

		String[] arr = {"abk", "abc", "abd", "ab", "abacus"};
		if(arr == null || arr.length == 0) {
			System.out.println("no elements found in array");
		}
		if(arr.length == 1) {
			System.out.println("the prefix value is: " + arr[0]);
		}
		String first = arr[0];

		for(int i=0; i<first.length(); i++) {
			char ch = first.charAt(i);
			for(int j=1; j<arr.length; j++) {
				if(i>= arr[j].length() || arr[j].charAt(i) != ch) {
					System.out.println(first.substring(0, i));
				}
			}
		}
	
	}
// Not working above logic fully need to optimize and reqrite.
//	if we write separeate method for this logic and return common prefix String
//	that will print only once
}
