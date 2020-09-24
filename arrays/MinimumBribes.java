package basic.arrays;

import java.util.Scanner;

public class MinimumBribes {

    static void minimumBribes(int[] q) {
    	int n = q.length;
    	int minBribes = 0;
    	
    	for(int i = 0; i < n; i++) {
    		if(q[i] > (i+1)) {
    			if(q[i] - i > 3) {
    				System.out.println("Too chaotic");
    				return;
    			}
    			minBribes += q[i] - (i+1);
    		}
    	}
    	System.out.println(minBribes);
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int t = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int tItr = 0; tItr < t; tItr++) {
            int n = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            int[] q = new int[n];

            String[] qItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int i = 0; i < n; i++) {
                int qItem = Integer.parseInt(qItems[i]);
                q[i] = qItem;
            }

            minimumBribes(q);
        }

        scanner.close();
    }
}
