import java.util.Locale;

class Scrabble {

    private final String word;

    Scrabble(String word) {
        this.word = word.toLowerCase();
    }

    int getScore() {
        int score = 0;

        char c;
        for (int i = 0; i < word.length(); i++) {
            c = word.charAt(i);
            score += pointsForLetter(c);
        }
        return score;
    }

    private int pointsForLetter(char c) {
        int points = 0;

        switch (c) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
            case 'l':
            case 'n':
            case 'r':
            case 's':
            case 't':
                points = 1;
                break;

            case 'd':
            case 'g':
                points = 2;
                break;

            case 'b':
            case 'c':
            case 'm':
            case 'p':
                points = 3;
                break;

            case 'f':
            case 'h':
            case 'v':
            case 'w':
            case 'y':
                points = 4;
                break;

            case 'k':
                points = 5;
                break;

            case 'j':
            case 'x':
                points = 8;
                break;

            case 'q':
            case 'z':
                points = 10;
                break;
        }

        return points;
    }

}
