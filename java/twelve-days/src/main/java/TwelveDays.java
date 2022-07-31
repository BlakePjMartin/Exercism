class TwelveDays {

    private final String[] gifts = new String[] {
            "a Partridge in a Pear Tree",
            "two Turtle Doves",
            "three French Hens",
            "four Calling Birds",
            "five Gold Rings",
            "six Geese-a-Laying",
            "seven Swans-a-Swimming",
            "eight Maids-a-Milking",
            "nine Ladies Dancing",
            "ten Lords-a-Leaping",
            "eleven Pipers Piping",
            "twelve Drummers Drumming"
    };

    private final String[] numbers = new String[] {
            "first",
            "second",
            "third",
            "fourth",
            "fifth",
            "sixth",
            "seventh",
            "eighth",
            "ninth",
            "tenth",
            "eleventh",
            "twelfth"
    };

    String verse(int verseNumber) {
        String verse = "On the " + numbers[verseNumber - 1] + " day of Christmas my true love gave to me: ";
        verse = verse + giftIterator(verseNumber, verseNumber > 1) + "\n";
        return verse;
    }

    String giftIterator(int verseNumber, boolean hasMultipleGifts) {
        String gift = this.gifts[verseNumber - 1];
        if ( verseNumber == 1 ) {
            if ( hasMultipleGifts ) {
                return "and " + gift + ".";
            } else {
                return gift + ".";
            }
        } else {
            return gift + ", " + giftIterator(verseNumber - 1, hasMultipleGifts);
        }
    }

    String verses(int startVerse, int endVerse) {
        String songVerses = "";
        for (int i = startVerse; i < endVerse; i++) {
            songVerses = songVerses + verse(i) + "\n";
        }
        songVerses = songVerses + verse(endVerse);

        return songVerses;
    }
    
    String sing() {
        return verses(1, 12);
    }
}
