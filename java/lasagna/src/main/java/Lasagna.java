public class Lasagna {

    private final int COOKING_TIME = 40;
    private final int TIME_PER_LAYER = 2;

    // Returns the total time the lasagna should be in the oven
    public int expectedMinutesInOven() {
        return COOKING_TIME;
    }

    // Returns for how much longer the lasagna needs to be in the oven
    public int remainingMinutesInOven(int timeElapsed) {
        return expectedMinutesInOven() - timeElapsed;
    }

    // Returns the amount of preparation time based on the number of layers
    public int preparationTimeInMinutes(int nLayers) {
        return nLayers * TIME_PER_LAYER;
    }

    // Returns the sum of the preparation time and the time spent in the oven
    public int totalTimeInMinutes(int nLayers, int timeElapsed) {
        return preparationTimeInMinutes(nLayers) + timeElapsed;
    }
}
