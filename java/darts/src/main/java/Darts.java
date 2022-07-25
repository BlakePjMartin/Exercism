class Darts {

    private double x;
    private double y;

    Darts(double x, double y) {
        this.x = x;
        this.y = y;
    }

    int score() {

        int pts = 0;
        double dist = Math.sqrt(this.x * this.x + this.y * this.y);
        if ( dist <= 1.0 ) {
            pts = 10;
        } else if ( dist <= 5.0 ) {
            pts = 5;
        } else if ( dist <= 10.0 ) {
            pts = 1;
        }

        return pts;
    }

}
