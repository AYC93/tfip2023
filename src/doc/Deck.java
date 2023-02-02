package doc;

import java.util.LinkedList;
import java.util.List;

public class Deck {
    
    public String[] SUIT = {"Diamond", "Heart", "Spade", "Clubs"}; //don't need assign number here, will derive size of array from this
    public String[] NAME = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"
    };
    
    public int [] RANK = {
    1, 2, 3, 4, 5, 6, 7, 8, 9,
    10, 10, 10, 10
};

    // A private Card[] cards = new Card[52];

    private List<Card> cards = new LinkedList<>();

    public Deck(){
        // A int offset = 0;
        for (int s = 0; s < SUIT.length; s++) { // same as bottom
            for (int j=0; j < NAME.length; j++) {
                Card c = new Card(SUIT[s], NAME[j], RANK[j]);
                cards.add(c);
                //A cards[offset + j] = c;
                //A System.out.printf(">> %s\n", c);
            }
            // A offset += NAME.length;
            for (int s = 0; s< cards.size(); s++) 
            {
                System.out.printf("> %s\n", cards.get(s));
            }
            System.out.printf("> cards.size(): %d\n", cards.size());

        }
    }

    // public shuffle
    
    public Card take() {
        return cards.remove(0);
    }

    /*    public Deck(){
         
        int s = 0; // initialise
        int j = 0;
        while (s < SUIT.length) { //condition
            j = 0;
            while (j < NAME.length) {
                Card c = new Card(SUIT[s],NAME[j],RANK[j]);
                System.out.printf(">> card: %s\n", c);
                j++;
            }
            s++;
        }
    }*/
}
