import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'miniMaxSum' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void miniMaxSum(List<Integer> arr) {
        int size = arr.size();
        long res[] = new long[size];
        for (int i = 0; i < size; i++) {
            long sum = 0;
            for (int j = 0; j < size; j++) {
                if (i != j) {
                    sum += arr.get(j);
                }
                res[i] = sum;
            }
        }
        for (int k = 0; k < size; k++) {
            for (int l = 0; l < (size - k - 1); l++) {
                if (res[l] < res[l + 1]) {
                    long temp = res[l];
                    res[l] = res[l + 1];
                    res[l + 1] = temp;
                }
            }
        }
        System.out.println(res[size - 1] + " " + res[0]);

    }

}

public class MiniMaxSum {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        Result.miniMaxSum(arr);

        bufferedReader.close();
    }
}
