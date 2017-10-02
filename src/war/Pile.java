package war;

public class Pile extends Deck{
	
	
	
	public void addCardToBottom(Card wonCard){
		
		cardDeck.add(cardDeck.size(), wonCard);
	
	}
	
	public void addCardToTop(Card drawnCard){
		
		cardDeck.add(drawnCard);
	}
	

}
