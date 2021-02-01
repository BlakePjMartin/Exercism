public class Hamming {
    private final int hammingDist;

    public Hamming(String leftStrand, String rightStrand) {
        // if the strings are equal then the Hamming distance is 0
        if (leftStrand.equals(rightStrand)) {
            hammingDist = 0;
            return;
        }

        // check that the left or sright strand is not empty
        if (leftStrand.isEmpty())
            throw new IllegalArgumentException("left strand must not be empty.");
        if (rightStrand.isEmpty())
            throw new IllegalArgumentException("right strand must not be empty.");

        // check that the strands are the same length
        if (leftStrand.length() != rightStrand.length())
            throw new IllegalArgumentException("leftStrand and rightStrand must be of equal length.");

        // calculate the distance
        int dist = 0;
        for (int i = 0; i < leftStrand.length(); i++) {
            if (leftStrand.charAt(i) != rightStrand.charAt(i))
                dist++;
        }
        hammingDist = dist;

    }

    public int getHammingDistance() {
        return hammingDist;
    }

}
