import java.math.BigInteger;

class Grains {

    BigInteger grainsOnSquare(final int square) {
        if ( square < 1 || square > 64 ) throw new IllegalArgumentException("square must be between 1 and 64");

        // the number of grains on the square will be 2^(n-1)
        return BigInteger.valueOf(2).pow(square - 1);
    }

    BigInteger grainsOnBoard() {
        // using sum_{k=0}^{n-1} 2^k = 2^n - 1
        // grainsOnSquare(n) returns 2^(n-1)
        return grainsOnSquare(64)
                .multiply(BigInteger.valueOf(2))
                .subtract(BigInteger.valueOf(1));
    }

}
