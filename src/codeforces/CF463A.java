package codeforces;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class CF463A {

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] initialData = reader.readLine().split(" ");
        int cents = Integer.valueOf(initialData[1])*100;

        String line;

        int max = -1;

        while ((line = reader.readLine()) != null) {
            String[] cost = line.split(" ");
            int sugarCents = Integer.valueOf(cost[0]) * 100 + Integer.valueOf(cost[1]);
            if (cents >= sugarCents) {
                int tmpmax = (cents - sugarCents) % 100;
                if (tmpmax > max) {
                    max = tmpmax;
                }
            }
        }

        reader.close();

        System.out.println(max);
    }
}
