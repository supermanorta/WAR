package war;

public interface GameEngine {
	
	/*public Player playerOne = new Player("Jack");
	public Player playerTwo = new Player("Jill");
	public final int orginalDeckSize  = 52;
	public Deck mainDeck = new Deck();*/
	public Deck mainDeck = new Deck();
	public void setUpGame();
	public void roundResult();
	public int gameResult();
	/*{
		
		mainDeck.fillDeckContents();
		mainDeck.shuffleDeckContents();
		dealCardsToPlayers(playerOne, playerTwo);
		
		playerOne.playersMainPile.printDeckContents();
		System.out.println();
		playerTwo.playersMainPile.printDeckContents();
		System.out.println();
		addToFaceUpPile(playerOne);
		playerOne.faceUpPile.printDeckContents();
		addToFaceUpPile(playerTwo);
		playerTwo.faceUpPile.printDeckContents();
		
	}*/
	
	public void dealCardsToPlayers(Player playerOne, Player playerTwo);
	/*{
		// i replaced with card or something
		for(int singleCard = 0; singleCard < orginalDeckSize; singleCard++){//52 = FINALwhatEver
			
			if(singleCard % 2 == 0){
				playerOne.playersMainPile.addCardToTopOfPile(mainDeck.drawCardFromTop());
			}
			else{
				playerTwo.playersMainPile.addCardToTopOfPile(mainDeck.drawCardFromTop());
			}
		}
	}*/
	
	public void addToFaceUpPile(Player player);/*{
		
		player.faceUpPile.addCardToTopOfPile(player.playersMainPile.drawCardFromTop());
	}
	*/
	public void addToFaceDownPile(Player player);/*{
	
		player.faceDownPile.addCardToTopOfPile(player.playersMainPile.drawCardFromTop());
	}*/
}
