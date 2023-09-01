import java.util.ArrayList;
import java.util.Collections;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        ArrayList<String> cards = card.setupCards();
        Collections.shuffle(cards);

//        for (int i = 0; i < drawnCards.size(); i++) {
//            System.out.println(cards.get(i));
//        }

        Player demi = new Player();
        Player tan = new Player();
        Player greg = new Player();
        Board zzz = new Board();

        demi.hand = card.getRandomCards(2, cards);
        tan.hand = card.getRandomCards(2, cards);
        greg.hand = card.getRandomCards(2, cards);
        zzz.hand  = card.getRandomCards(5, cards);


        System.out.println("Demi has " + demi.hand);
        System.out.println("Tan has " + tan.hand);
        System.out.println("Greg has " + greg.hand);
        System.out.println(zzz.hand);
    }
}