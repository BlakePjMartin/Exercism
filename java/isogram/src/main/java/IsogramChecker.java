import java.util.Arrays;

class IsogramChecker {

    // value of 'a' when typecast to int
    private static final int A_OFFSET = 97;

    // array that will keep track of which letters we've seen
    private static int[] letterCount = new int[26];

    boolean isIsogram(String phrase) {
        // ensure that the array is set to all 0
        Arrays.fill(letterCount, 0);

        // get the lower case of the phrase, uppercase letters have different int values
        String lCase = phrase.toLowerCase();

        int cVal;
        int curCount;
        // iterate over each char in the phrase
        for (char c : lCase.toCharArray()) {
            cVal = ((int) c) - A_OFFSET;  // the int value of the char, adjusted with the 'a' offset
            if ( 0 <= cVal && cVal <= letterCount.length - 1 ) {
                curCount = ++letterCount[cVal];  // if within the range 'a' - 'z' add to the array
                if ( curCount > 1 ) {
                    return false;  // the char has been seen before, not an isogram
                }
            }
        }
        return true;  // went through all the characters in the phrase, is an isogram
    }

}
