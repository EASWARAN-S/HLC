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
     * Complete the 'plusMinus' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void plusMinus(List<Integer> arr) {
    int size = arr.size();
    double zero = 0,positive = 0 , negative = 0 ;
    for(int i = 0 ; i < size ; i++)
    {
        if(arr.get(i) == 0) zero++;
        if(arr.get(i) < 0) negative++;
        if(arr.get(i) > 0) positive++;
       
    }
 System.out.printf("%6f",positive/size);
 System.out.println();
 System.out.printf("%6f",negative/size);
  System.out.println();
 System.out.printf("%6f",zero/size);
  System.out.println();

    }

}

public class PlusMinus {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        Result.plusMinus(arr);

        bufferedReader.close();
    }
}
