package bradywmr_hw3;

public class FlashCard {

	private String front; //Front text of the flashcard.
	private String back; //Back text of the flashcard.
	
	/**
	 * Constructor for the FlashCard object. Takes two string arguments and signs them to the front or back.
	 * @param front
	 * @param back
	 */
	public FlashCard(String front, String back) {
		this.front = front;
		this.back = back;
	}
	
	/**
	 * Returns the text on the front of the flashcard.
	 * @return
	 */
	public String getFront() {
		return this.front;
	}
	
	/**
	 * Sets the text on the front of the flashcard.
	 * @param front
	 */
	public void setFront(String front) {
		this.front = front;
	}
	
	/**
	 * Returns the text on the back of the flashcard.
	 * @return
	 */
	public String getBack() {
		return this.back;
	}

	/**
	 * Sets the text on the back of the flashcard.
	 * @param back
	 */
	public void setBack(String back) {
		this.back = back;
	}
}
