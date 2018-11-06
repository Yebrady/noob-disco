package bradywmr_hw4;

import java.util.ArrayList;

import bradywmr_hw4.FlashCard;
import bradywmr_hw4.Leitner;

/**
 * Class implementing a flashcard application
 *
 * @invariant boxes != null && boxes.size() > 0
 */
public class FlashCardApp
{
	
	private ArrayList<Box> boxes = new ArrayList<Box>(); //List of Boxes;
	
  /** Number of boxes. */
  private final int MAX_BOXES = 5;

  /** Constructs a new flashcard app object and initializes the boxes. */
  public FlashCardApp()
  {
	for (int i = 1; i <= MAX_BOXES; i++) {
		boxes.add(new Box(i));
	}
  }

  /** Returns an object according to the Leitner study method. */
  public Leitner leitner()
  {
    return new Leitner(boxes);
  }

  /**
   * Returns an arraylist containing all flashcards in the system.
   *
   * @return ArrayList<FlashCard>
   */
  public ArrayList<FlashCard> getAllCards()
  {
    ArrayList<FlashCard> allCards = new ArrayList<FlashCard>();
    for (Box box: boxes) {
    	allCards.addAll(box.getAllCards());
    }
    return allCards;
  }

  /**
   * Returns an arraylist containing all flashcards that contain a pattern.
   *
   * @param pattern search pattern for texts on flashcards.
   * @return ArrayList<FlashCard> where all elements contain pattern in either
   *         front or back of the card.
   *
   * @precondition pattern != null
   */
  public ArrayList<FlashCard> getCardsWith(String pattern)
  {
//    assert pattern != null;
//
//    ArrayList<FlashCard> cardsWith = new ArrayList<FlashCard>();
//    for (Box box: boxes) {
//    	for (FlashCard flashcard : box.getAllCards()) {
//    		if (FlashCard.getChallenge() == pattern) {
//    			
//    		}
//    	}
//    }
	  return null;
  }

  /**
   * Returns an arraylist that contains all flash cards in a given box.
   *
   * @param boxid Leitner box id.
   * @return ArrayList<FlashCard> with all cards in box boxid.
   *
   * @precondition 0 < boxid <= number of boxes in the app
   */
  public ArrayList<FlashCard> getCards(int boxid)
  {
    assert boxid > 0 && boxid <= MAX_BOXES;

    return boxes.get(boxid).getAllCards();
  }


  /**
   * Creates a new flashcard and adds it to the first box.
   *
   * @precondition challenge != null && response != null
   */
  public void create(String challenge, String response)
  {
    assert challenge != null && response != null;

    boxes.get(0).add(new FlashCard(challenge, response));
  }

  /* TODO: add private data members. */
}

