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

class DayOfProgrammer {

    /*
     * Complete the 'dayOfProgrammer' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts INTEGER year as parameter.
     */

    public static String dayOfProgrammer(int year) {
        int days = 0, count = 0;
        String result = "";
        int month[] = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
        for (int i = 0; i < 8; i++) {
            days += month[i];
            count = i;

        }
        if (year >= 1919) {
            if ((year % 4 == 0) && (year % 100 != 0)) {

                days = days + 1;
            }
            if (year % 400 == 0) {
                days = days + 1;
            }
        } else if (year <= 1917) {
            if (year % 4 == 0)
                days = days + 1;
        }
        if (year == 1918) {
            days = days - 13;
        }
        days = 256 - days;
        if (days < 10)
            result += "0" + days + ".09." + year;
        else
            result += days + ".09." + year;
        return result;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int year = Integer.parseInt(bufferedReader.readLine().trim());

        String result = Result.dayOfProgrammer(year);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}