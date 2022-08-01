class LargestSeriesProductCalculator {

    private final int[] arrNums;

    LargestSeriesProductCalculator(String inputNumber) {
        // create and populate the array with the digits from the input number
        arrNums = new int[inputNumber.length()];
        char c;
        for (int i = 0; i < inputNumber.length(); i++) {
            c = inputNumber.charAt(i);
            if ( !Character.isDigit(c) ) throw new IllegalArgumentException(
                    "String to search may only contain digits.");
            arrNums[i] = Character.getNumericValue(c);
        }
    }

    long calculateLargestProductForSeriesLength(int numberOfDigits) {
        // check that the number of digits for the series is non-negative and not larger than the array of numbers
        if (numberOfDigits < 0 ) throw new IllegalArgumentException("Series length must be non-negative.");
        if (numberOfDigits > arrNums.length ) throw new IllegalArgumentException(
                "Series length must be less than or equal to the length of the string to search.");

        long largestProduct = 0;
        long curProduct;
        for (int i = 0; i < arrNums.length - numberOfDigits + 1; i++) {
            curProduct = 1;
            for (int j = 0; j < numberOfDigits; j++) {
                curProduct = curProduct * arrNums[i + j];
            }
            largestProduct = Math.max(curProduct, largestProduct);
        }

        return largestProduct;
    }
}


