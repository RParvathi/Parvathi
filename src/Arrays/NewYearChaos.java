package Arrays;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class NewYearChaos {

    // Complete the minimumBribes function below.
    static void minimumBribes(int[] q) {

            boolean chaos = false;
            boolean finished = false;
            int count = 0;
        
        int[] inputLine = q;
        int n = q.length;
        int[] outputFrequencyDistribution = new int[n+1];
            while (!finished) {
                finished = true;
                
                for (int a = 0; a < n - 1; a++) {
                    if (inputLine[a] > inputLine[a + 1]) {
                       
                        outputFrequencyDistribution[inputLine[a]]++;
                       
                        if (outputFrequencyDistribution[inputLine[a]] > 2) {
                            finished = true;
                            chaos = true; // if it's too chaotic, break out
                            break;
                        }
                        count++;
                        int temp = inputLine[a];
                        inputLine[a] = inputLine[a + 1];
                        inputLine[a + 1] = temp;
                        finished = false;
                    }
                }
            }
            if (chaos) {
                System.out.println("Too chaotic");
            } else {
                System.out.println(count);
            }
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
