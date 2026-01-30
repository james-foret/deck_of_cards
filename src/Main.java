import Deck.Deck;
import Deck.Suit;
import Deck.Card;
import static Deck.Suit.*;

void main() {
    // standard init | 4 suits, 52 cards
    Deck deck1 = new Deck();
    deck1.runTests();
    deck1.shuffleDeck();

    Card[] hand1 = {
            deck1.dealCard(),
            deck1.dealCard(),
            deck1.dealCard(),
            deck1.dealCard(),
            deck1.dealCard(),
    };

    deck1.runTests();
    IO.println("\n\n Hand1: " + Arrays.toString(hand1));

    // 2 - 10 |
    Suit[] deck2Suits = {HEARTS, SPADES, SPADES, HEARTS};
    int[] deck2ranks = {2,3,4,5,6,7,8,9,10};
    Deck deck2 = new Deck(deck2Suits, deck2ranks);

    deck2.runTests();
    deck2.shuffleDeck();

    Card[] hand2 = {
            deck2.dealCard(),
            deck2.dealCard(),
            deck2.dealCard(),
            deck2.dealCard(),
            deck2.dealCard(),
    };

    deck2.runTests();
    IO.println("\n\n Hand2: " + Arrays.toString(hand2));

    Suit[] deck3Suits = {HEARTS, SPADES, CLUBS, DIAMONDS};
    int [] deck3ranks = {1, 3, 5, 7, 9, 11, 13};
    Deck deck3 = new Deck(deck3Suits, deck3ranks);
    deck3.runTests();
    deck3.shuffleDeck();

    Card[] hand3 = {
    deck3.dealCard(),
    deck3.dealCard(),
    deck3.dealCard(),
    deck3.dealCard(),
    deck3.dealCard(),
    };

    deck3.runTests();
    IO.println("\n\n Hand3: " + Arrays.toString(hand3));
}
