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
	
		deck.fillDeckContents();
		deck.shuffleDeckContents();
		deck.printDeckContents();
	
	}

}
