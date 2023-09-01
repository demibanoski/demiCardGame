import java.util.ArrayList;

public class card {

    public static ArrayList<String> setupCards() {
        String[] suits = {"diamond", "heart", "spade", "club"};
        String[] val = {
                "ace",
                "2",
                "3",
                "4",
                "5",
                "6",
                "7",
                "8",
                "9",
                "10",
                "jack",
                "queen",
                "king",
        };

        ArrayList<String> cards = new ArrayList<String>();



        for (int i = 0; i < suits.length; i++) {
            for (int j = 0; j < val.length; j++) {

                String addMe = "";
                addMe+= suits[i];
                addMe+= " ";
                addMe+= val[j];
                cards.add(addMe);
            }
        }
        
        return cards;
    };

    public static ArrayList<String> getRandomCards(int numberOfCardsToBeDrawn, ArrayList<String> cards) {

        ArrayList<String> poppedCards = new ArrayList<String>();

        for (int i = 0; i < numberOfCardsToBeDrawn; i++) {
            String drawn = cards.remove(i);
            poppedCards.add(drawn);
        }

        return poppedCards;


    }
}
