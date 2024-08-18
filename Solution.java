import java.awt.desktop.SystemSleepListener;
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

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String t = sc.next();
        try {
            BigInteger a = new BigInteger(s);
            BigInteger b= new BigInteger(t);
            BigInteger c = a.add(b);
            BigInteger d = a.add(b);
            System.out.println(c);
            System.out.println(d);

        } catch (Exception e) {
            System.out.println(e);
        }
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String n = bufferedReader.readLine();

        try {
            BigInteger b = new BigInteger(n);

            System.out.println((isProbablePrime(b))?"Yes":"NO");
            
        } catch (Exception e) {
            System.out.println(e);
        }

        bufferedReader.close();


        
    }
}