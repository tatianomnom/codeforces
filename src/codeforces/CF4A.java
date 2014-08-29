package codeforces;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class CF4A {

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int w = Integer.valueOf(reader.readLine());

        reader.close();

        boolean result = w > 3 && w % 2 == 0;

        System.out.println(result ? "YES" : "NO");
    }
}
