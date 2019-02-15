import java.util.ArrayList;
import java.util.Random;

public class CardDealer {

    Random random = new Random();

    public void dealDeck(ArrayList<Card> entireDeck, Player player1, Player player2){

            ArrayList<Card> deckToDeal = entireDeck;

            for(int i = 51; i >= 0; i--){

                int randomNumber = random.nextInt(i + 1);

                int indexToPullCardFromEntireDeck;

                if(randomNumber != 0){
                    indexToPullCardFromEntireDeck = randomNumber - 1;

                } else {
                    indexToPullCardFromEntireDeck = randomNumber;
                }


                 if(i % 2 == 0){
                     Card cardToAddToHand = entireDeck.remove(indexToPullCardFromEntireDeck);
                     player1.addCardToHand(cardToAddToHand);
                 } else {
                     Card cardToAddToHand = entireDeck.remove(indexToPullCardFromEntireDeck);
                     player2.addCardToHand(cardToAddToHand);
                 }
            }
        System.out.println("PLAYER 1 HAND: " + player1.getCardHand() + "\n");
        System.out.println("PLAYER 2 HAND: " + player2.getCardHand());

    }
}
