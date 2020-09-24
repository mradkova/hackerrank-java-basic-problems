package basic;

import java.util.Scanner;

public class Pallindrome {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String A = sc.next();
		char[] A_charArray = A.toCharArray();
		char[] A_reversed = new char[A_charArray.length];
		for (int i = 0; i < A_charArray.length; i++) {
			A_reversed[A_charArray.length - 1 - i] = A_charArray[i];
		}
		String B = new String(A_reversed);
		System.out.println(A.equals(B));

		sc.close();
	}

}
