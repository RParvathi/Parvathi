import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class RepeatedString {

    // Complete the repeatedString function below.
    static long repeatedString(String s, long n) {
              
            int strlen = s.length();
            long repeat = n/strlen;
            long end = n % strlen;
            String a = null;
            long count = 0;
            int c = 0;
            
            for(int i = 0; i < s.length(); i++) {
                if('a' == s.charAt(i)) {
                    c++;
                }
            }
            count = c * repeat;
        
        if ( end < strlen ) {
                a = s.substring(0, (int)end);
            for(int i = 0; i < a.length(); i++) {
                if('a' == a.charAt(i)) {
                    count++;
                }
            }
            }

        return count;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scanner.nextLine();

        long n = scanner.nextLong();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        long result = repeatedString(s, n);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
