import java.util.Scanner;

public class FractionTest {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("***<>Fraction Calculator<>*** \nEnter Numerator and Denominator of First Fraction: ");
		
		Integer n1 = scan.nextInt();
		Integer d1;
		do {
			d1 = scan.nextInt();
			if (d1 == 0)
				System.out.println("Denominator cannot equal 0. Please choose another integer.");
		}	while(d1 == 0);
		
		Fraction f1 = new Fraction(n1, d1);
		
		System.out.println("Enter Numerator and Denominator of Second Fraction: ");
		
		Integer n2 = scan.nextInt();
		Integer d2 = scan.nextInt();
		Fraction f2 = new Fraction(n2, d2);
		
		System.out.println("Fraction 1 + Fraction 2 = " + f2.add(f1));
		System.out.println("Fraction 1 - Fraction 2 = " + f2.sub(f1));
		System.out.println("Fraction 1 * Fraction 2 = " + f2.mul(f1));
		System.out.println("Fraction 1 / Fraction 2 = " + f2.div(f1));
		System.out.println("Remainder of Fraction 1: " + f1.getRemainder() + "\nRemainder of Fraction 2: " + f2.getRemainder());
		System.out.println("Quotient of Fraction 1: " + f1.getQuotient() + "\nQuotient of Fraction 2: " + f2.getQuotient());
		System.out.println("Quotient of Fraction 1 as a Float: " + f1.doubleValue() + "\nQuotient of Fraction 2 as a Float: " + f2.doubleValue());
		
		scan.close();
	}
}
