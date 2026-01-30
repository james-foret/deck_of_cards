package Deck;
import java.util.ArrayList;
import java.util.Collections;

public class Deck {

    public ArrayList<Card> Deck;

    // constructor for a standard 52 card deck
    public Deck(){
        Deck = new ArrayList<Card>();
        Suit[] suits = Suit.values();
        int[] ranks ={1,2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13};

        for(Suit suit : suits){
           initSuit(ranks, suit);
        }
    }

    // custom constructor that accepts args to alter the rules of the game.. IE no face cards, only 1 suit, etc...
    public Deck(Suit[] suitsInPlay, int[] ranksInPlay) {
        Deck = new ArrayList<Card>();

        for (Suit suit : suitsInPlay) {
            initSuit(ranksInPlay, suit);
        }
    }

    public void runTests() {
        IO.println("\n\nStandard Deck:");
        IO.println("Size: " + Deck.size());
        IO.println("Suits:");
        IO.println("");
        IO.println(this.suitToString(Suit.HEARTS));
        IO.println(this.suitToString(Suit.SPADES));
        IO.println(this.suitToString(Suit.CLUBS));
        IO.println(this.suitToString(Suit.DIAMONDS));

    }

    private void initSuit(int[] validValues, Suit suit){
        for (int rank : validValues) {
            Deck.add(new Card(suit, rank));
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Card card : Deck) {
            sb.append(card.toString());
        }
        return sb.toString();
    }

    public String suitToString(Suit suit){
        StringBuilder sb = new StringBuilder();

        for (Card c : Deck){
            if (suit == c.getSuit()){
                sb.append(c.toString());
            }
        }
        return sb.toString();
    }

    public int size(){
        return Deck.size();
    }

    public void shuffleDeck(){
        Collections.shuffle(Deck);
    }

    public Card dealCard(){
        return Deck.removeFirst();
    }
}
