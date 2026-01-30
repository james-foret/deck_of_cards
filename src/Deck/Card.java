package Deck;

public class Card {

    private Suit suit;
    private String name;
    private int value;
    private boolean isFace;

    public Card(Suit suit, int value){
        this.suit = suit;
        this.value = value;

        if (!(this.value < 11)){
            this.isFace = true;
        }

        this.name = this.assignName();
    }

    private String assignName(){
        StringBuilder sb = new StringBuilder();
        // if card is not greater than 10
        if (!(this.value > 10 || this.value == 1)) {
            sb.append(this.value);
        }else{
            switch(this.value){
                case 1 ->  sb.append("A");
                case 11 -> sb.append("J");
                case 12 -> sb.append("Q");
                case 13 -> sb.append("K");
                default -> sb.append("?");
            }
        }
        switch(this.suit){
            case CLUBS ->  sb.append("C");
            case DIAMONDS -> sb.append("D");
            case HEARTS -> sb.append("H");
            case SPADES -> sb.append("S");
            default -> sb.append("?");
        }
        return sb.toString();
    }

    public String getName(){
        return this.name;
    }

    public int getValue(){
        return this.value;
    }

    public boolean isFace(){
        return this.isFace;
    }

    public Suit getSuit(){
        return this.suit;
    }

    public void changeSuit(Suit suit){
        this.suit = suit;
        this.assignName();
    }

    public void  changeValue(int value){
        this.value = value;
        this.assignName();
    }

    public void changeIsFace(boolean isFace){
        this.isFace = isFace;
    }

    @Override
    public String toString(){
        name = this.getName();
       return ('[' + name + ']');
    }
}
