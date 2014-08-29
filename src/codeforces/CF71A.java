package codeforces;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class CF71A {

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        reader.readLine();

        String line;

        StringBuilder sb = new StringBuilder();

        while ((line = reader.readLine()) != null) {
            if (sb.length() > 0) {
                sb.append('\n');
            }
            if (line.length() <= 10) {
                sb.append(line);
            } else {
                sb.append(line.charAt(0)).append(line.length()-2).append(line.charAt(line.length()-1));
            }
        }

        reader.close();

        System.out.println(sb.toString().trim());
    }
}
