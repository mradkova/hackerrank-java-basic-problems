package basic;

import java.util.*;

public class EasyStrings {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String A = sc.next();
		String B = sc.next();

		System.out.println(A.length() + B.length());

		if (A.compareTo(B) <= 0) {
			System.out.println("No");
		} else {
			System.out.println("Yes");
		}

//        Character firstLetterA = Character.toUpperCase(A.charAt(0));
//        Character firstLetterB = Character.toUpperCase(B.charAt(0));

		String capitalA = A.substring(0, 1).toUpperCase() + A.substring(1);
		String capitalB = B.substring(0, 1).toUpperCase() + B.substring(1);
		System.out.println(capitalA + " " + capitalB);

		sc.close();
	}
}
