/**
 * 
 */
package war;

import java.util.ArrayList;
import java.util.Collections;

/**
 * @author super
 *
 */
public class Deck {
	
	ArrayList <Card> cardDeck = new ArrayList<Card>();
	public void fillDeckContents() {
		
		Card card;		
		
		for (Suit s : Suit.values()) {
		    for (Rank r : Rank.values()) {
		    	
		    	card = new Card(r, s);
		    	cardDeck.add(card);
		    	
		    }
		}
	}
	 
	public void printDeckContents(){
		
		for(Card card: cardDeck){
			
			System.out.println(card);
		}
	} 
	
	public void shuffleDeckContents(){
		
		Collections.shuffle(cardDeck);
	}
	
	
				
	public Card drawCardFromTop(){
		
		// Card topCardFromDeck = cardDeck.get(0);
		int retroSize = cardDeck.size()-1;
		Card topCardFromDeck = cardDeck.get( retroSize );
		cardDeck.remove(retroSize);
		
		return topCardFromDeck;
	}
	
	
}
