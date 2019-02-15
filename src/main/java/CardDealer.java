import java.util.ArrayList;
import java.util.Random;

public class CardDealer {

    Random random = new Random();

    public void dealDeck(ArrayList<Card> entireDeck, Player player1, Player player2){

            ArrayList<Card> deckToDeal = entireDeck;

            ArrayList<Integer>

            for(int i = 51; i >= 0; i--){

                 = random.nextInt(52);

                 if(i % 2 == 0){

                 }

            }
    }
}
