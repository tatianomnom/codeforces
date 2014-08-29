package codeforces;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.BitSet;

import static java.lang.Character.*;

public class CF131A {

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String word = reader.readLine();

        reader.close();

        byte length = (byte) word.length();

        BitSet bitSet = new BitSet(length);

        for (int i = 0; i < length; i++) {
            bitSet.set(i, isLowerCase(word.charAt(i)));
        }

        if (bitSet.isEmpty() || bitSet.get(0) && bitSet.get(1, bitSet.size()).isEmpty()) {
            Character first = valueOf(word.charAt(0));
            word = (isUpperCase(first) ? toLowerCase(first) : toUpperCase(first)) + word.substring(1).toLowerCase();
        }

        System.out.println(word);
    }

}
