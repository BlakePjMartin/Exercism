public class CarsAssemble {

    private static final int PRODUCTION_RATE = 221;

    public double productionRatePerHour(int speed) {
        double success;
        if ( speed <= 4 ) {
            success = 1.0;
        } else if ( speed <= 8 ) {
            success = 0.9;
        } else if ( speed == 9 ) {
            success = 0.8;
        } else {
            success = 0.77;
        }

        return PRODUCTION_RATE * speed * success;
    }

    public int workingItemsPerMinute(int speed) {
        return (int) productionRatePerHour(speed) / 60;
    }
}
