package basic;

import java.util.Scanner;

class JavaDataTypes {
	public static void main(String[] argh) {

		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();

		for (int i = 0; i < t; i++) {

			try {
				long x = sc.nextLong();
				System.out.println(x + " can be fitted in:");
				if (x >= -128 && x <= 127) {
					System.out.println("* byte");
				}
				if ((x < -128 && x >= -32768) || (x > 127 && x <= 32767)) {
					System.out.println("*short");
				}
				if ((x < 32_768 && x >= -2_147_483_648) || (x > 32_767 && x <= 2_147_483_647)) {
					System.out.println("*int");
				}
				if ((x < -2_147_483_648 && x >= -9_223_372_036_854_775_808L)
						|| (x > 2_147_483_647 && x <= 9_223_372_036_854_775_807L)) {
					System.out.println("*long");
				}
			} catch (Exception e) {
				System.out.println(sc.next() + " can't be fitted anywhere.");
			}

		}
		sc.close();
	}
}
