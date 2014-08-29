package codeforces;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class CF1A {

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String line = reader.readLine();
        reader.close();

        String[] tokens = line.split(" ");

        int n = Integer.valueOf(tokens[0]);
        int m = Integer.valueOf(tokens[1]);
        double a = Double.valueOf(tokens[2]);

        System.out.println((long)(Math.ceil(n / a) * Math.ceil(m / a)));

    }
}
