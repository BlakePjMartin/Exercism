import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.temporal.*;

public class Gigasecond {

    private LocalDateTime futureTime;
    private static final int OFFSET = 1000000000;

    public Gigasecond(LocalDate moment) {
        LocalDateTime curTime = moment.atStartOfDay();
        futureTime = curTime.plusSeconds(OFFSET);
    }

    public Gigasecond(LocalDateTime moment) {
        futureTime = moment.plusSeconds(OFFSET);
    }

    public LocalDateTime getDateTime() {
        return futureTime;
    }

}
