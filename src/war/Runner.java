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
		
		String rank = Rank.ACE.stringOfRank();
		String suit = Suit.CLUBS.stringOfSuit();
		
		
		System.out.println(rank);
		System.out.print(suit);
	}

}
