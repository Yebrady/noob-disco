package bradywmr_hw4;

import java.util.Scanner;

public class FlashCardViewer extends FlashCardApp {
	
	public static void main(String args[]) {
		
		int check;
		
		boolean loop = true;
		
		Scanner input = new Scanner(System.in);
		
		// This will ask you to choose to import a flashcard file,
		// or enter study mode to begin answering flashcards.
		while (loop) {
			System.out.println("Leitner FlashCard System");
			System.out.println("Please choose an option:");
			System.out.println("1. Import.");
			System.out.println("2. Leitner Study Mode.");
			check = input.nextInt();
			
			switch (check) {
				case 1:
					System.out.println("Work in progress.");
				case 2:
					System.out.println("Work in Progress.");
					check = input.nextInt();
					
				default:
					System.exit(0);
			}
		}
	}
}
