import java.util.ArrayList;

public class WarGameDemo {

    public static void main(String[] args){

        Player playerOne = new Player("Brian");
        Player playerComputer = new Player("computer");

        DeckGenerator deckGenerator = new DeckGenerator();
        CardDealer cardDealer = new CardDealer();

        ArrayList<Card> entireDeck = deckGenerator.generateDeck();
        cardDealer.dealDeck(entireDeck, playerOne, playerComputer);




    }
}
