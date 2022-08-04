import java.util.Arrays;

class LuhnValidator {

    boolean isValid(String candidate) {
        // remove whitespace and check for sufficient length
        String cleanedCandidate = candidate.replaceAll("\\s+", "");
        if ( cleanedCandidate.length() <= 1 ) return false;

        // copy all numbers to an array
        // if any character is not numeric then return false
        int[] digits = new int[ cleanedCandidate.length() ];

        char c;
        for (int i = 0; i < cleanedCandidate.length(); i++) {
            c = cleanedCandidate.charAt(i);
            if ( !Character.isDigit(c) ) return false;
            digits[i] = Character.getNumericValue(c);
        }

        // double every second digit, starting from the second digit from the right
        // if greater than 9 then subtract 9
        int tempVal;
        for (int i = digits.length - 2; i >= 0; i = i - 2) {
            tempVal = 2 * digits[i];
            if ( tempVal > 9 ) {
                tempVal -= 9;
            }
            digits[i] = tempVal;
        }

        // check that the sum of all the digits is divisible by 10 (which returns true)
        int sum = Arrays.stream(digits).sum();
        return (sum % 10) == 0;
    }

    public static void main(String[] args) {
        String candidate = "055 444 285";
        LuhnValidator lv = new LuhnValidator();
        System.out.println(lv.isValid(candidate));
        System.out.println("DONE!");
    }

}
