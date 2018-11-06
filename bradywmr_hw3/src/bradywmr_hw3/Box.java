package bradywmr_hw3;

import java.util.ArrayList;
import java.util.List;

public class Box {
	
	private List<FlashCard> flashCards;
	
	
	/**
	 *  Constructor for Box type. Makes Box an ArrayList of FlashCard objects.
	 */
	public Box() {
		flashCards = new ArrayList<FlashCard>();
	}
	
	/**
	 * Adds a flashcard to a box.
	 * 
	 * @param flashCard
	 */
	public void addFlashCard(FlashCard flashCard) {
		flashCards.add(flashCard);
	}
	
	/**
	 * Removes a flashcard from a box.
	 * @param flashCard
	 */
	public void removeFlashCard(FlashCard flashCard) {
		flashCards.remove(flashCard);
	}
	
	/**
	 * Returns the list of flashcards in the box.
	 * @return
	 */
	public List<FlashCard> getFlashCards() {
		return flashCards;
	}
}
