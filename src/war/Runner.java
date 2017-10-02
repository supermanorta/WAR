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
		
		GameEngine gameOne = new GameEngine();
		
		gameOne.setUpGame();
		
		/*Deck deck = new Deck();
		Pile playerOnePile = new Pile();
		Pile playerTwoPile = new Pile();
		
	
		deck.fillDeckContents();
		deck.shuffleDeckContents();
		deck.printDeckContents();
		*/
		
		/*
		 * We can refactor this and add it to the game engine class
		 * but this is one way of distributing the hands between
		 * two players.
		 * */
		
		
		/*System.out.println();
		System.out.println("Player One Hand: ");
		playerOnePile.printDeckContents();
		System.out.println();
		System.out.println("Player Two Hand: ");
		playerTwoPile.printDeckContents();
		*/
	}
	
}
