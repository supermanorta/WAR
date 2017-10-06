package war;

import java.util.ArrayList;
import java.util.Comparator;



public class GameOne implements GameEngine, Comparator<Player> {

	public Player playerOne = new Player("Jack");
	public Player playerTwo = new Player("Jill");
	static ArrayList<Card> warDeck = new ArrayList<Card>();
	
	public final int orginalDeckSize  = 52;
	
	
	
	@Override
	public void roundResult() {
		int result = compare( playerOne, playerTwo );
		int score = 0;
		switch(result) {
			case 0:	/// DULL case
				break;
			case 1:
//				this.playerOne.updateScore(playerOne.getFaceUpPile().sizeOfPile());
				this.playerOne.updateScore( playerOne.getSizeOfFaceUpPile() + playerTwo.getSizeOfFaceUpPile() );
				if(warDeck.size() > 0) { this.playerOne.updateScore( warDeck.size() ); }
				gameResult(1);
				break;
			case 2:
				this.playerTwo.updateScore( playerOne.getSizeOfFaceUpPile() + playerTwo.getSizeOfFaceUpPile() );
				if(warDeck.size() > 0) { this.playerTwo.updateScore( warDeck.size() ); }
				gameResult(2);
				break;
		}
		
	}
	
	public void gameResult(int winner) {
		if(winner ==1) {
			System.out.println("Player One wins this round");
		}else {
			System.out.println("Player Two wins this round");
		}
	}
	
	@Override
	public int compare(Player one, Player two) {
		
		// Maybe get the card....eval the two card object, a
		
		if( one.getPlayersMainPileValue() < two.getPlayersMainPileValue() ){
			System.out.println("P2 WON");
			System.out.println("P1 less than 26 b/c of loss "
		     + one.playersMainPile.cardDeck.size()  );
			
			Rank testRank = null; 
			Suit testSuit = null;
			Card testCard = new Card(testRank.KING, testSuit.SPADES);
			System.out.println("P2 MainPileSize: " + two.playersMainPile.cardDeck.size()  );
			//player two wins
			// move p1 and p2 to the bottom of the main pile
			//take a card from the top and 
			two.addCardToFaceUpPile(   testCard   );
			two.addCardToFaceUpPile(   two.getPlayersMainCard()   );
			two.addCardToFaceUpPile(   one.getPlayersMainCard()   );
			
			two.getPlayersMainPile().addCardToBottom(testCard);

			//System.out.println("Two players " + two);
			System.out.println("P2 FaceUpPile size: " + two.getSizeOfFaceUpPile()  );
			System.out.println("Player Two card size::: " + two.getPlayersMainCard() );
			//two.getPlayersMainPile().addCardToTopOfPile(one.getFaceUpPile().drawCardFromTop() );
//			two.getPlayersMainPile().addCardToTopOfPile(two.getFaceUpPile().drawCardFromTop() );
			
			return 2;
		}else if(one.getPlayersMainPileValue() > two.getPlayersMainPileValue() ){
			System.out.println("P1 WON...Note that all players get a card removed from the main pile, hence the drop in the main pile size");
			System.out.println("P2 main Pile Size"
				     + two.playersMainPile.cardDeck.size()  );
					
			Rank testRank = null; 
			Suit testSuit = null;
			Card testCard = new Card(testRank.KING, testSuit.SPADES);
			System.out.println("P1 MainPileSize: " + one.playersMainPile.cardDeck.size()  );
			one.addCardToFaceUpPile(   testCard   );
			one.addCardToFaceUpPile(   two.getPlayersMainCard()   );
			one.addCardToFaceUpPile(   one.getPlayersMainCard()   );
			
			one.getPlayersMainPile().addCardToBottom(testCard);

			System.out.println("P2 FaceUpPile size: " + one.getSizeOfFaceUpPile()  );
			System.out.println("Player Two card size::: " + one.getPlayersMainCard() );

			return 1;
		}else {
			//need to add card to pull from ideally this would be the "same card" that both players have.
			one.addCardToFaceUpPile(   one.getPlayersMainCard()   );
			two.addCardToFaceUpPile(   two.getPlayersMainCard()   );
			
			System.out.println("Add card to war deck::: " + one.getFaceUpPile().drawCardFromTop() );
			warDeck.add( one.getFaceUpPile().drawCardFromTop() );
			warDeck.add( two.getFaceUpPile().drawCardFromTop() );
			warDeck.add( one.getPlayersMainPile().drawCardFromTop() );
			warDeck.add( two.getPlayersMainPile().drawCardFromTop() );
			
			
			
			///so the call happens many times, however right now it is not pulling card correctly
			//might need a method to draw cards that uses compare. Or something.-migs
			compare(one,two);
			return 0;//tech this will never be hit....
			
		}
	}

	@Override
	public void setUpGame() {
		
		mainDeck.fillDeckContents();
		mainDeck.shuffleDeckContents();
		dealCardsToPlayers(playerOne, playerTwo);
		compare(playerOne,playerTwo);
		
		/*playerOne.playersMainPile.printDeckContents();
		System.out.println();
		playerTwo.playersMainPile.printDeckContents();
		System.out.println();
		addToFaceUpPile(playerOne);
		playerOne.faceUpPile.printDeckContents();
		addToFaceUpPile(playerTwo);
		playerTwo.faceUpPile.printDeckContents();
		System.out.println("  ");
		//System.out.println( playerOne.faceUpPile.drawCardFromTop().getCardValue() );
		System.out.println( playerOne.getFaceUpPile().cardDeck.size() );
		//compare();
*/	}

	@Override
	public void dealCardsToPlayers(Player playerOne, Player playerTwo) {
		// i replaced with card or something
		for(int singleCard = 0; singleCard < orginalDeckSize; singleCard++){//52 = FINALwhatEver
			
			if(singleCard % 2 == 0){
				playerOne.playersMainPile.addCardToTopOfPile(mainDeck.drawCardFromTop());
			}
			else{
				playerTwo.playersMainPile.addCardToTopOfPile(mainDeck.drawCardFromTop());
			}
		}
	}

	@Override
	public void addToFaceUpPile(Player player) {
		player.faceUpPile.addCardToTopOfPile( player.playersMainPile.drawCardFromTop() );
	}

	@Override
	public void addToFaceDownPile(Player player) {
		player.faceDownPile.addCardToTopOfPile(player.playersMainPile.drawCardFromTop());
	}
}
