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
     * Complete the 'timeConversion' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

    public static String timeConversion(String s) {
    String str = "";
    int st = Integer.parseInt(s.substring(0,2));
  
    String prefix = s.substring(s.length()-2);
      if(prefix.equals("PM"))
    {
        if(st < 12)
        st = st + 12;
        
    }
    if(prefix.equals("AM"))
    {
        if(st == 12)
        str += "00" + s.substring(2,s.length()-2);
        else if(st < 10)
        {
            str += "0"+st +  s.substring(2,s.length()-2);
        }
        else
    {
        str += st +  s.substring(2,s.length()-2);
        
    }
    }
    else
    {
        str += st +  s.substring(2,s.length()-2);
    }
    return str;

    }

}

public class TimeConversion {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = bufferedReader.readLine();

        String result = Result.timeConversion(s);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
