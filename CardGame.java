/*
 * Name:-Nikhil Lanje
 * Class SY-A
 * Roll No:-113
 * Subject:-OOPs in Java
 */
import java.util.Random;

class Card {
    private String face;
    private String suit;

    public Card(String cardFace, String cardSuit) {
        face = cardFace;
        suit = cardSuit;
    }

    @Override
    public String toString() {
        return face + " of " + suit;
    }
}

class DeckOfCard {
    private Card[] deck;
    private int currentCard;
    private static final int NUMBER_OF_CARDS = 52;
    private static final Random randomNumbers = new Random();

    public DeckOfCard() {
        String[] faces = {"Ace", "Deuce", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King"};
        String[] suit = {"Hearts", "Diamonds", "Clubs", "Spades"};

        deck = new Card[NUMBER_OF_CARDS];
        currentCard = 0;

        for (int count = 0; count < deck.length; count++) {
            deck[count] = new Card(faces[count % 13], suit[count / 13]);
        }
    }

    public void shuffle() {
        currentCard = 0;

        for (int first = 0; first < deck.length; first++) {
            int second = randomNumbers.nextInt(NUMBER_OF_CARDS);
            Card temp = deck[first];
            deck[first] = deck[second];
            deck[second] = temp;
        }
    }

    public Card dealCard() {
        if (currentCard < deck.length) {
            return deck[currentCard++];
        } else {
            return null;
        }
    }
}

public class CardGame {  // Renamed the main class to CardGame
    public static void main(String[] args) {
        DeckOfCard myDeckOfCard = new DeckOfCard();
        myDeckOfCard.shuffle();

        for (int i = 0; i < 52; i++) {
            System.out.printf("%19s", myDeckOfCard.dealCard());

            if (i % 4 == 0) {
                System.out.println();
            }
        }
    }
}

//output//
/*
 PS C:\Users\nikhi\OneDrive\Desktop\My Java> cd "c:\Users\nikhi\OneDrive\Desktop\My Java\" ; if ($?) { javac CardGame.java } ; if ($?) { java CardGame }
      
     King of Hearts    Queen of Hearts  Eight of Diamonds    Eight of Hearts
     Deuce of Clubs  Queen of Diamonds    Seven of Spades   Four of Diamonds
   Jack of Diamonds      Six of Hearts     Five of Hearts  Deuce of Diamonds
   King of Diamonds    Deuce of Hearts     Four of Hearts     Nine of Hearts
       Six of Clubs      Four of Clubs    Ace of Diamonds   Nine of Diamonds
  Three of Diamonds      Jack of Clubs    Seven of Hearts       Ten of Clubs
      Nine of Clubs    Three of Hearts     King of Spades      King of Clubs
    Deuce of Spades     Five of Spades    Three of Spades    Six of Diamonds
    Ten of Diamonds      Ten of Spades      Five of Clubs    Queen of Spades
     Eight of Clubs     Jack of Spades      Ace of Spades  Seven of Diamonds
      Six of Spades     Three of Clubs     Queen of Clubs   Five of Diamonds
    Eight of Spades     Jack of Hearts       Ace of Clubs     Nine of Spades
      Ace of Hearts     Seven of Clubs     Four of Spades      Ten of Hearts
PS C:\Users\nikhi\OneDrive\Desktop\My Java>
 */

