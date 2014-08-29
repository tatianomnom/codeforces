package codeforces;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class CF236A {

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String line = reader.readLine();
        reader.close();

        System.out.println(line.chars().distinct().count() % 2 == 0 ? "CHAT WITH HER!" : "IGNORE HIM!");

    }
}
