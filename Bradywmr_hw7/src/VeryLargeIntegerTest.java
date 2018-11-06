import java.util.Scanner;

public class VeryLargeIntegerTest {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Choose number 1:");
		VeryLargeInteger n1 = new VeryLargeInteger(in.nextLine());
		
		System.out.println("Choose number 2:");
		VeryLargeInteger n2 = new VeryLargeInteger(in.nextLine());
		
		System.out.println("Choose a number: \n1. Add \n2. Subtract \n3. Multiply");
		int response = in.nextInt();
		
		switch(response) {
		case 1:
			VeryLargeInteger sum = n1.add(n2);
			System.out.println(n1 + " + " + n2 + " =\n" + sum);
			
		case 2:
			VeryLargeInteger diff = n1.sub(n2);
			System.out.println(n1 + " - " + n2 + " =\n" + diff);
		case 3:
			VeryLargeInteger prod = n1.mul(n2);
			System.out.println(n1 + " * " + n2 + " =\n" + prod);
		}
		in.close();
	}
}
