import java.util.*;

public class simpleAndCompoundInterest {
	public static void main(String args[]) {
		Scanner src = new Scanner(System.in);
		System.out.print("Enter P: ");
		int p = src.nextInt();
		System.out.print("Enter rate(r) per month: ");
		int r = src.nextInt();
		System.out.print("Enter time(t) in months: ");
		int t = src.nextInt();
		double si = p * r * t / 100.00;
		System.out.println("Simple interest = " + si);
		double ci = p * Math.pow(1 + r * 1.00 / 1, t);
		System.out.println("Compund interest = " + ci);
	}
}
