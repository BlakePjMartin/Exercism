
public class PigLatinTranslator {

    public PigLatinTranslator() {
        // do nothing
    }

    public String translate(String words) {
        // for each of the words given perform the translation
        String[] wordsToTranslate = words.split(" ");
        String[] wordsTranslated = wordsToTranslate.clone();
        for (int i = 0; i < wordsToTranslate.length; i++) {
            wordsTranslated[i] = translateWord(wordsToTranslate[i]);
        }
        return String.join(" ", wordsTranslated);
    }

    public String translateWord(String word) {
        String translation;
        if ( beginsWithVowelSound( word ) ) {
            translation = word + "ay";
        } else {
            // beginning with a consonant sound we always need to move letters to the end of the word
            int lettersToMove = lettersToMoveForConsonantSound(word);
            translation = word.substring(lettersToMove) +
                    word.substring(0, lettersToMove) + "ay";
        }

        return translation;
    }

    private boolean beginsWithVowelSound(String word){
        boolean hasVowelSound = false;
        char firstLetter = word.charAt(0);
        String firstTwoLetters = word.substring(0, 2);

        if ( firstLetter == 'a' || firstLetter == 'e' || firstLetter == 'i' ||
                firstLetter == 'o' || firstLetter == 'u') {
            hasVowelSound = true;
        } else if ( firstTwoLetters.equals("xr") || firstTwoLetters.equals("yt") ) {
            hasVowelSound = true;
        }

        return hasVowelSound;
    }

    private int lettersToMoveForConsonantSound(String word){
        int consonantPos = 0;
        char curChar = word.charAt(consonantPos);
        while ( curChar != 'a' && curChar != 'e' && curChar != 'i' &&
                curChar != 'o' && curChar != 'u' && curChar != 'y') {
            consonantPos++;
            curChar = word.charAt(consonantPos);
        }

        // determine how many letters need to move
        int lettersInConsonantSound = consonantPos;

        // check if the consonant sound includes a 'qu'
        if ( curChar == 'u' && word.charAt(consonantPos - 1) == 'q' ) {
            lettersInConsonantSound++;
        } else if ( curChar == 'y' && lettersInConsonantSound == 0 ) {
            lettersInConsonantSound++;
        }

        return lettersInConsonantSound;
    }

}
