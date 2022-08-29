import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Anagram {

    private final String word;

    public Anagram(String word) {
        this.word = word;
    }

    public List<String> match(List<String> searchWords) {
        // modify the originally given word in ways that will be used for comparison\
        String lowercaseWordToMatch = word.toLowerCase();
        char[] wordToMatch = lowercaseWordToMatch.toCharArray();
        Arrays.sort(wordToMatch);

        // the matches that will be returned
        List<String> matches = new ArrayList<String>();

        // iterate over each of the search words to find matches
        for ( String searchWord : searchWords ) {
            String currentLowercaseWord = searchWord.toLowerCase();
            char[] currentWord = currentLowercaseWord.toCharArray();
            Arrays.sort(currentWord);
            if ( !lowercaseWordToMatch.equals(currentLowercaseWord) && Arrays.equals(currentWord, wordToMatch) ) {
                matches.add(searchWord);
            }
        }

        return matches;
    }

}
