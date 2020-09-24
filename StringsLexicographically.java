package basic;

import java.util.ArrayList;
import java.util.Scanner;

public class StringsLexicographically {
	
	public static String getSmallestAndLargest(String s, int k) {
		String smallest = "";
		String largest = "";

		ArrayList<String> substringsSorted = getSubstrings(s,k); 
		smallest = substringsSorted.get(0);
		largest = substringsSorted.get(s.length() - 1);
		return smallest + "\n" + largest;
	}
	
	private static ArrayList<String> getSubstrings(String s, int length) {
		ArrayList<String> result = new ArrayList<>(); 
		for(int i = 0; i < s.length() - length; i++) {
			result.add(s.substring(i, i + length - 1));
		}
		
		//sort ArrayList lexicographically
		for(int i = 0; i < result.size(); i++) {
			for(int j = i + 1; j < result.size(); j++) {
				String first = result.get(i);
				String second = result.get(j);
				
				if(first.compareTo(second) > 0) {
					String temp = first;
					result.set(i, second);
					result.set(j, temp);
				}
			}
		}		
		return result;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.next();
		int k = scan.nextInt();
		scan.close();

		System.out.println(getSmallestAndLargest(s, k));
	}
}
