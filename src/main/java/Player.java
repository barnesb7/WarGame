import java.util.ArrayList;

public class Player {

    private String name;
    private ArrayList<Card> cardHand;

    public Player(String name){
        this.name = name;
        this.cardHand = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Card> getCardHand() {
        return cardHand;
    }

    public void setCardHand(ArrayList<Card> cardHand) {
        this.cardHand = cardHand;
    }
}
