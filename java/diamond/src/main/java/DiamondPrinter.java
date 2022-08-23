import java.util.ArrayList;
import java.util.List;

class DiamondPrinter {

    List<String> printToList(char a) {
        int aValue = 'A';
        int charDistFromA = (int) a - aValue;
        List<String> diamondStrings = new ArrayList<String>();

        // build the top of the diamond first, then the middle line, and then the bottom
        for (int i = 0 ; i <= charDistFromA ; i++) {
            int curCharInt = aValue + i;
            diamondStrings.add(createLine((char) curCharInt, charDistFromA - i, 2 * i - 1));
        }
        for (int i = charDistFromA - 1; i >= 0 ; i--) {
            int curCharInt = aValue + i;
            diamondStrings.add(createLine((char) curCharInt, charDistFromA - i, 2 * i - 1));
        }
        return diamondStrings;
    }

    private String createLine(char c, int spacesSides, int spacesMiddle) {
        StringBuilder line = new StringBuilder("");
        line.append(" ".repeat(spacesSides));
        line.append(c);
        if ( spacesMiddle > 0 ) {
            line.append(" ".repeat(spacesMiddle));
            line.append(c);
        }
        line.append(" ".repeat(spacesSides));
        return line.toString();
    }

}
