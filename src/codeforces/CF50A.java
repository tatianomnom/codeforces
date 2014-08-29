package codeforces;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class CF50A {

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] s = reader.readLine().split(" ");

        reader.close();

        System.out.println(Integer.valueOf(s[0]) * Integer.valueOf(s[1]) / 2);
    }
}
