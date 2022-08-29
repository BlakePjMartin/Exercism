public class ElonsToyCar {

    // current car status
    private int distance;
    private int battery = 100;

    // usage during drive
    private final int DISTANCE_FOR_DRIVE = 20;
    private final int BATTERY_FOR_DRIVE = 1;

    public ElonsToyCar() {
        distance = 0;
    }

    public static ElonsToyCar buy() {
        ElonsToyCar elonsToyCar = new ElonsToyCar();
        return elonsToyCar;
    }

    public String distanceDisplay() {
        String s = "Driven " + distance + " meters";
        return s;
    }

    public String batteryDisplay() {
        String s;
        if ( battery > 0 ) {
            s = "Battery at " + battery + "%";
        } else {
            s = "Battery empty";
        }
        return s;
    }

    public void drive() {
        if ( battery > 0 ) {
            battery -= BATTERY_FOR_DRIVE;
            distance += DISTANCE_FOR_DRIVE;
        }
    }
}
