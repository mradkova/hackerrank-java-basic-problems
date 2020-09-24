package basic;

import java.util.Scanner;

public class StaticInitializers {

	private static int B;
	private static int H;
	private static boolean flag;

	static {
		Scanner sc = new Scanner(System.in);
		try {
			B = sc.nextInt();
			H = sc.nextInt();
			flag = (B > 0 && H > 0) ? true : false;
			if(!flag)
				System.out.println("java.lang.Exception: Breadth and height must be positive");
		} catch (Exception ex) {
			System.out.println(ex.getMessage());
		}
		finally {
			sc.close();
		}
	}

	public static void main(String[] args) {
		if (flag) {
			int area = B * H;
			System.out.print(area);
		}

	}// end of main

}// end of class
