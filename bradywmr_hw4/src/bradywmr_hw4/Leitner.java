package bradywmr_hw4;

import java.util.ArrayList;

import java.util.Random;
import bradywmr_hw4.Box;

/**
 * A class implementing the Leitner system for flashcard boxes.
 *
 * @invariant boxes != null
 */
public class Leitner
{
	
	private ArrayList<Box> boxes = new ArrayList<Box>(); //List of Boxes
	private FlashCard card = null; //Card choice
	private boolean sideChoice;
	private Box currentBox;
	
  /**
   * Constructs a new Leitner object.
   *
   * @precondition theBoxes != null
   */
  public Leitner(ArrayList<Box> theBoxes)
  {
    assert theBoxes != null;
    boxes = theBoxes;
  }

  /**
   * Picks a random card and side from all boxes.
   *
   * Cards in lower boxes receive higher weight (priority). The method
   * returns void, but the picked card's sides can be accessed through
   * getQuestion and getAnswer, the answer tested using checkAnswer.
   *
   * @precondition there must be at least one box with one card.
   */
  public void pickCard()
  {
	  Random random = new Random();
	  int totalWeight = 0;
	  for (Box box: boxes) {
		  totalWeight += (1 << (5 - box.id())) * box.size();
	  }
	  int randomInt = random.nextInt() * totalWeight;
	  int weight = 0;
	  for (Box box: boxes) {
		  weight += totalWeight;
		  if (weight >= randomInt) {
			  currentBox = box;
		  }
	  }
	  card = currentBox.get(random.nextInt(boxes.size()));
	  sideChoice = (random.nextInt(2) == 0);
  }

  /**
   * Returns the question for the last picked card.
   *
   * @return the question
   *
   * @precondtion a card has been picked and not been tested.
   */
  public String getQuestion()
  {
	  return sideChoice ? card.getChallenge() : card.getResponse();
  }

  /**
   * Returns the answer for the last picked card.
   *
   * @return the answer
   *
   * @precondtion a card has been picked and not been tested.
   */
  public String getAnswer()
  {
	  return sideChoice ? card.getChallenge() : card.getResponse();
  }

  /**
   * Validates the response against the last picked card.
   *
   * @param s the response.
   * @return true, if s was correct. s is assumed to be correct, if it is empty
   *         or the string returned by getAnswer equals s.
   *
   * @precondition s != null
   */
  public boolean testAnswer(String s)
  {
    assert s != null;
    boolean isRight = getAnswer().equals(s);
    return isRight;
  }

  /**
   * Computes the box number where the card will be placed
   * Moves card to next box if correct or moves card to last box 
   * if not already in the first box.
   *
   * @param box current box number
   * @param correct indicates whether response was correct.
   *
   * @precondition box is a valid box number
   */
  public void moveToTargetBox(int box, boolean correct){
	assert box != 0 && box <= 5;
    correct = testAnswer(getAnswer());
    if (correct) { 
    	boxes.get(box).remove(card);
    	boxes.get(box += 1).add(card); 
    }
    else {
    	if (box > 1) {
    		boxes.get(box).remove(card);
    		boxes.get(box -= 1).add(card);
    	}	
    }
  }
}



