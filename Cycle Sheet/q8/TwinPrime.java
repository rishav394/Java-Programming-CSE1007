import java.util.Scanner;
import primespackage.Primes;

public class TwinPrime {
    public static void main(String[] args) {
        Primes p = new Primes();
        Scanner src = new Scanner(System.in);
        System.out.println("Enter the number for twin prime (1-n) : ");
        int n = src.nextInt();
        int prime = -1;
        for (int i = 2; i <= n; i++) {
            if (p.checkForPrimes(i)) {
                if (i - prime == 2)
                    System.out.println(String.format("(%d,%d)", prime, i));
                prime = i;
            }
        }
    }
}
