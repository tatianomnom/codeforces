package codeforces;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class CF465A {

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int cellSize = Integer.valueOf(reader.readLine());

        String stringNum = new StringBuilder(reader.readLine()).reverse().toString();
        BigInteger number = new BigInteger(stringNum, 2);

        reader.close();

        number = number.add(BigInteger.ONE);

        BigInteger result = number.remainder(BigInteger.valueOf(2).pow(cellSize));

        String resultingString = padLeft(result.toString(2), cellSize).replace(' ', '0');

        int i = 0;

        for (int j = 0; j < resultingString.length(); j++) {
            if (stringNum.charAt(j) != resultingString.charAt(j)) i++;
        }

        System.out.println(i);

    }

    private static String padLeft(String s, int n) {
        return String.format("%1$" + n + "s", s);
    }
}
