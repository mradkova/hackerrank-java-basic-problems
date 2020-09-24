package basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Calendar;

class Result {

	/*
	 * Complete the 'findDay' function below.
	 *
	 * The function is expected to return a STRING. The function accepts following
	 * parameters: 1. INTEGER month 2. INTEGER day 3. INTEGER year
	 */

	public static String findDay(int month, int day, int year) {

		// 08 05 2015
		// m d yyyy
		
		Calendar calendar = Calendar.getInstance();
		calendar.set(year, month - 1, day);
		
		int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);
		String result = null;

		switch (dayOfWeek) {
		case 1:
			result = "Sunday";
			break;
		case 2:
			result = "Monday";
			break;
		case 3:
			result = "Tuesday";
			break;
		case 4:
			result = "Wednesday";
			break;
		case 5:
			result = "Thursday";
			break;
		case 6:
			result = "Friday";
			break;
		case 7:
			result = "Saturday";
			break;
		}

		System.out.println(calendar);
		System.out.println(result);

		return result.toUpperCase();
	}

}

public class DateTime {
	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

		int month = Integer.parseInt(firstMultipleInput[0]);
		int day = Integer.parseInt(firstMultipleInput[1]);
		int year = Integer.parseInt(firstMultipleInput[2]);

		String res = Result.findDay(month, day, year);
		System.out.println("The day of week is: " + res);
		bufferedReader.close();
	}
}
