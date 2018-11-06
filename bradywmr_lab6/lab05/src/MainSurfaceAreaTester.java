import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class MainSurfaceAreaTester {
	
	public static void main (String[] args) throws FileNotFoundException {
		
		boolean b = true;
		Scanner inS = new Scanner(System.in);
		
		while(b) {
			
			System.out.println("Please enter your command: ");
			
			String s1 = inS.nextLine();
			
			//when the input is import INPUT
			if (s1.equals("import INPUT")) {
				
				Scanner inF = new Scanner(new File("INPUT.txt"));
				
				while(inF.hasNextLine()) {
					String s = inF.next();
					
					if (s.equals("Rectangle")) {
						int width = inF.nextInt();
						int length = inF.nextInt();
						
						Rectangle rectangle = new Rectangle(width, length);
						
						System.out.println("Rectangle: Width " + width + " Length " + length + " and Area " + rectangle.getArea());
						
					} else if (s.equals("ThreeDRectangle")) {
						int width = inF.nextInt();
						int length = inF.nextInt();
						int height = inF.nextInt();
						
						ThreeDRectangle threeD = new ThreeDRectangle(width, length, height);
						
						System.out.println("3D Rectangle: Width " + width + " Length " + length + " Height " + height + " and Surface Area " + threeD.getSurfaceArea());
					}
					
				}
				
				b = false;
				inF.close();
			}
			
			
			// when the input is !exit
			else if (s1.equals("!exit")) {
				
				System.exit(0);
			}
		
			// when the input is other strings
			else{
				System.out.println("Invavid command");
			}
		}
		
		inS.close();
	}
}
