class Proverb {

    private String[] words;

    Proverb(String[] words) {
        this.words = words;
    }

    String recite() {
        String proverb = "";

        // check that we have words for the proverb
        if ( words.length == 0 ) { return proverb; }

        // iterate over the words to create the proverb
        for (int i = 0; i < words.length - 1; i++) {
            proverb = proverb + "For want of a " + words[i] + " the " + words[i + 1] + " was lost.\n";
        }

        // add the final line of the proverb
        proverb = proverb + "And all for the want of a " + words[0] + ".";

        return proverb;
    }

}
