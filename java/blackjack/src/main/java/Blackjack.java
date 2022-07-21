public class Blackjack {

    private static final int BLACKJACK = 21;
    private static final String STAND = "S";
    private static final String HIT = "H";
    private static final String SPLIT = "P";
    private static final String WIN = "W";

    public int parseCard(String card) {
        switch (card) {
            case "ace":
                return 11;

            case "two":
                return 2;

            case "three":
                return 3;

            case "four":
                return 4;

            case "five":
                return 5;

            case "six":
                return 6;

            case "seven":
                return 7;

            case "eight":
                return 8;

            case "nine":
                return 9;

            case "ten":
            case "jack":
            case "queen":
            case "king":
                return 10;

            default:
                return 0;
        }

    }

    public boolean isBlackjack(String card1, String card2) {
        int card1val = parseCard(card1);
        int card2val = parseCard(card2);
        return (card1val + card2val) == BLACKJACK;
    }

    public String largeHand(boolean isBlackjack, int dealerScore) {
        String action;
        if (isBlackjack) {
            if  (dealerScore < 10) {
                action = WIN;
            } else {
                action = STAND;
            }
        } else {
            action = SPLIT;
        }

        return action;
    }

    public String smallHand(int handScore, int dealerScore) {
        String action;
        if (handScore <= 11) {
            action = HIT;
        } else if ( handScore <= 16) {
            if (dealerScore < 7) {
                action = STAND;
            } else {
                action = HIT;
            }
        } else {
            action = STAND;
        }

        return action;
    }

    // FirstTurn returns the semi-optimal decision for the first turn, given the cards of the player and the dealer.
    // This function is already implemented and does not need to be edited. It pulls the other functions together in a
    // complete decision tree for the first turn.
    public String firstTurn(String card1, String card2, String dealerCard) {
        int handScore = parseCard(card1) + parseCard(card2);
        int dealerScore = parseCard(dealerCard);

        if (20 < handScore) {
            return largeHand(isBlackjack(card1, card2), dealerScore);
        } else {
            return smallHand(handScore, dealerScore);
        }
    }
}
