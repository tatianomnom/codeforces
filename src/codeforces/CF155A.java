package codeforces;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class CF155A {

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        short numOfLines = Short.valueOf(reader.readLine());
        String line = reader.readLine();

        reader.close();

        String[] tokens = line.split(" ");

        short max = Short.valueOf(tokens[0]);
        short min = max;

        short num = 0;

        for (int i = 1; i < numOfLines; i++) {
            short current = Short.valueOf(tokens[i]);
            if (current > max) {
                max = current;
                num++;
            } else if (current < min) {
                min = current;
                num++;
            }
        }

        System.out.println(num);

    }
}
