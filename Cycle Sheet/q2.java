// Write a program to demonstrate the knowledge of students in multidimensional arrays and looping constructs. 

import java.util.*;

public class q2 {
    public static void main(String args[]) {
        int slow[] = new int[4];
        int full = 0;
        Scanner src = new Scanner(System.in);
        int[][] multi = new int[4][];
        for (int i = 0; i < 4; i++) {
            System.out.print("Enter slow learners in batch " + (i + 1) + ": ");
            slow[i] = src.nextInt();
            double temp = slow[i] / 4.0;
            int size = new Double(Math.ceil(temp)).intValue();
            multi[i] = new int[size];
            Arrays.fill(multi[i], 4);
            if (slow[i] % 4 != 0) {
                multi[i][size - 1] = slow[i] % 4;
            } else {
                full++;
            }
        }

        for (int[] multiIn : multi) {
            for (int n : multiIn) {
                System.out.print(n + " ");
            }
            System.out.println("");
        }
        System.out.println("The number of teachers who have full batches is " + full);
    }
}