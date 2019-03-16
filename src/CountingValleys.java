
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class CountingValleys {

    // Complete the countingValleys function below.
    static int countingValleys(int n, String s) {
        StringBuffer steps = new StringBuffer(s);
        int up = 0;
        int down = 0;
        int valleys = 0;
        for(int i = 0; i < steps.length(); i++){
             char stepType = steps.charAt(i);
            if(stepType == 'U')
                up++;
            else
                down++;
            if(stepType == 'D' && (up - down == -1)){
                valleys++;
            }      
        }
       // System.out.println(valleys);
        return (valleys);
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String s = scanner.nextLine();

        int result = countingValleys(n, s);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
