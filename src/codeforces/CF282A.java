package codeforces;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class CF282A {

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        reader.readLine();

        String line;

        short result = 0;

        while ((line = reader.readLine()) != null) {
            if (line.contains("+")) {
                result++;
            } else result--;
        }

        reader.close();

        System.out.println(result);
    }
}
