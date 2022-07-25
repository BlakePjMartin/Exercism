class DifferenceOfSquaresCalculator {

    int computeSquareOfSumTo(int input) {
        int sum = sumTo(input);
        return sum * sum;
    }

    private int sumTo(int input) {
        if ( input == 1 ) {
            return 1;
        } else {
            return input + sumTo(input - 1);
        }
    }

    int computeSumOfSquaresTo(int input) {
        return input * (input + 1) * (2*input + 1) / 6;
    }

    int computeDifferenceOfSquares(int input) {
        return computeSquareOfSumTo(input) - computeSumOfSquaresTo(input);
    }

}
