class IsbnVerifier {

    boolean isValid(String stringToVerify) {
        // ISBN has 10 digits
        if ( stringToVerify.length() < 10 ) return false;

        // search for 10 digits or X (in final position) starting from the start of the string
        // if a letter (other than X) is found before finding 10 valid entries then return false
        int[] digits = new int[10];
        int digitsPos = 0;
        int stringPos = 0;
        char c;
        while ( stringPos < stringToVerify.length() && digitsPos < 10 ) {
           c = stringToVerify.charAt(stringPos);
           if ( c == '-' ) {
               stringPos++;
           } else if ( c == 'X' && digitsPos == 9 ) {
                digits[digitsPos] = 10;
                digitsPos++;
                stringPos++;
           } else if ( Character.isDigit(c) ) {
               digits[digitsPos] = Character.getNumericValue(c);
               digitsPos++;
               stringPos++;
           } else {
               return false;
           }
        }

        // if we didn't find enough digits then not a valid ISBN
        if ( digitsPos < 10 ) return false;

        // if there is more to the string then flag as invalid ISBN
        if ( stringPos < stringToVerify.length() ) return false;

        // calculate the check number
        int checkNum = 0;
        for (int i = 0; i < 10; i++) {
            checkNum += digits[i] * (10 - i);
        }

        return (checkNum % 11) == 0;
    }

}
