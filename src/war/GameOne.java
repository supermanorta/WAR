package war;

import java.util.Comparator;



public class GameOne implements GameEngine, Comparator<Player> {

	public Player playerOne = new Player("Jack");
	public Player playerTwo = new Player("Jill");
	public final int orginalDeckSize  = 52;
	
	@Override
	public void roundResult() {
		int result = compare( playerOne, playerTwo );
		
		int score=0;
		switch(result) {
			case 0:
				// WAR we have to both players place a card in up pile and down pile
				// then call roundResult again....
				break;
			case 1:
//				this.playerOne.updateScore(playerOne.getFaceUpPile().sizeOfPile());
				this.playerOne.updateScore( playerOne.getSizeOfFaceUpPile() + playerTwo.getSizeOfFaceUpPile() );
				break;
			case 2:
				this.playerTwo.updateScore( playerOne.getSizeOfFaceUpPile() + playerTwo.getSizeOfFaceUpPile() );
				break;
		}
		
	}
	
	@Override
	public int gameResult() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	@Override
	public int compare(Player one, Player two) {
		if( one.getFaceUpPileValue() < two.getFaceUpPileValue() ){
			// move p1 and p2 to the bottom of the main pile
			//
			two.getPlayersMainPile().addCardToBottom(one.getFaceUpPile().drawCardFromTop() );
			two.getPlayersMainPile().addCardToBottom(two.getFaceUpPile().drawCardFromTop() );
			return 2;
		}else if(one.getFaceUpPileValue() > two.getFaceUpPileValue() ){
			return 1;
		}else { return 0;}
	}

	@Override
	public void setUpGame() {
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
		System.out.println("  ");
		//System.out.println( playerOne.faceUpPile.drawCardFromTop().getCardValue() );
		System.out.println( playerOne.getFaceUpPile().cardDeck.size() );
		//compare();
	}

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
