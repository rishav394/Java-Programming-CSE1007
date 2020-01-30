// Write a program to demonstrate the knowledge of students in advanced concepts of Java string handling.

import java.util.*;

public class q4 {
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);
        String test = src.nextLine();
        int index = 1;
        while (true) {
            index = test.indexOf("ATG", index + 1);
            if (index == -1)
                break;
            String TAG = test.indexOf("TAG", index + 1) != -1 ? test.substring(index, test.indexOf("TAG", index + 1))
                    : "";
            String TAA = test.indexOf("TAA", index + 1) != -1 ? test.substring(index, test.indexOf("TAA", index + 1))
                    : "";
            String TGA = test.indexOf("TGA", index + 1) != -1 ? test.substring(index, test.indexOf("TGA", index + 1))
                    : "";
            String min = test;
            for (String x : new String[] { TAG, TAA, TGA }) {
                if (x.length() == 0 || x.length() % 3 != 0) {
                } else {
                    min = x.length() < min.length() ? x : min;
                }
            }
            System.out.println(min.replaceFirst("ATG", ""));
        }
    }
}