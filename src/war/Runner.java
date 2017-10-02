/**
 * 
 */
package war;
/**
 * @author super
 *
 */
public class Runner {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
			
		Deck deck = new Deck();
		Pile playerOnePile = new Pile();
		Pile playerTwoPile = new Pile();
		
	
		deck.fillDeckContents();
		deck.shuffleDeckContents();
		deck.printDeckContents();
		
		/*
		 * We can refactor this and add it to the game engine class
		 * but this is one way of distributing the hands between
		 * two players.
		 * */
		for(int i = 0; i < 52; i++){
			if(i % 2 == 0){
				playerOnePile.addCardToBottom(deck.drawCardFromTop());
			}
			else{
				playerTwoPile.addCardToBottom(deck.drawCardFromTop());
			}
		}
		System.out.println();
		System.out.println("Player One Hand: ");
		playerOnePile.printDeckContents();
		System.out.println();
		System.out.println("Player Two Hand: ");
		playerTwoPile.printDeckContents();
		
	}
	
}
