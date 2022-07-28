
class BirdWatcher {
    private final int[] birdsPerDay;

    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay.clone();
    }

    public int[] getLastWeek() {
        return birdsPerDay.clone();
    }

    public int getToday() {
        int arrLen = birdsPerDay.length;
        return (arrLen == 0) ? 0 : birdsPerDay[arrLen - 1];
    }

    public void incrementTodaysCount() {
        birdsPerDay[birdsPerDay.length - 1]++;
    }

    public boolean hasDayWithoutBirds() {
        Boolean hasDayWithout = false;
        for (int i = 0; i < birdsPerDay.length; i++) {
            if (birdsPerDay[i] == 0) {
                hasDayWithout = true;
                break;
            }
        }
        return hasDayWithout;
    }

    public int getCountForFirstDays(int numberOfDays) {
        int numBirds = 0;
        for (int i = 0; i < numberOfDays && i < birdsPerDay.length; i++) {
            numBirds += birdsPerDay[i];
        }
        return numBirds;
    }

    public int getBusyDays() {
        int numBusyDays = 0;
        for (int i = 0; i < birdsPerDay.length; i++) {
            numBusyDays += (birdsPerDay[i] >= 5) ? 1 : 0;
        }
        return numBusyDays;
    }
}
