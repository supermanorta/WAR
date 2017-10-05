package war;

/**
 * The Deck class defines a Deck object that has 
 * a list of cards.
 */

import java.util.ArrayList;
import java.util.Collections;

public class Deck {
	
	/**
	 * The list of cards that makes this Deck
	 */
	ArrayList <Card> cardDeck = new ArrayList<Card>();
	
	/**
	 * Fills the list of cards or the Deck with Cards.
	 */
	public void fillDeckContents() {
		
		Card card;		
		
		for (Suit s : Suit.values()) {
		    for (Rank r : Rank.values()) {
		    	
		    	card = new Card(r, s);
		    	cardDeck.add(card);
		    	
		    }
		}
	}
	
	/**
	 * Prints the contents or the cards of this Deck.
	 */
	public void printDeckContents(){
		
		for(Card card: cardDeck){
			
			System.out.println(card);
			
		}
	} 
	
	/**
	 * Randomizes or shuffles the cards in the Deck.
	 */
	public void shuffleDeckContents(){
		
		Collections.shuffle(cardDeck);
		
	}
	
	/**
	 * Returns the Card from the top of the Deck.
	 * @return A Card specifying the card that was removed
	 */
	public Card drawCardFromTop(){
		
		Card topCardFromDeck = cardDeck.get(0);
		cardDeck.remove(0); //For Brandon: remove() returns the removed Object
		
		return topCardFromDeck;
	}
}
