class ResistorColorDuo {

    private static final String[] resistorColours = {
            "black",
            "brown",
            "red",
            "orange",
            "yellow",
            "green",
            "blue",
            "violet",
            "grey",
            "white"
    };

    int value(String[] colors) {
        return 10 * colorCode(colors[0]) + colorCode(colors[1]);
    }

    int colorCode(String color) {
        String lowercaseColor = color.toLowerCase();
        int pos = 0;
        while (pos < resistorColours.length && !resistorColours[pos].equals(lowercaseColor)) {
            pos++;
        }

        if ( pos >= resistorColours.length ) throw new IllegalArgumentException("Colour given was not found");

        return pos;
    }
}
