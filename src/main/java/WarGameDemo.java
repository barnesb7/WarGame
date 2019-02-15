import java.util.ArrayList;

public class WarGameDemo {

    public static void main(String[] args){

        DeckGenerator deckGenerator = new DeckGenerator();
        ArrayList<Card> entireDeck = deckGenerator.generateDeck();
        System.out.println(entireDeck.size());


    }
}
