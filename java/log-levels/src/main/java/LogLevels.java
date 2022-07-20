import java.util.Locale;

public class LogLevels {
    
    public static String message(String logLine) {
        // find the start of the message by searching for the colon
        int start = logLine.indexOf(":");

        // get the substring and trim the whitespace
        String msg = logLine.substring(start + 1);
        return msg.trim();
    }

    public static String logLevel(String logLine) {
        // find the start and end of the level by searching for brackets
        int start = logLine.indexOf("[");
        int end = logLine.indexOf("]");

        // get the substring with the level and make lowercase
        String level = logLine.substring(start + 1, end);
        return level.toLowerCase();
    }

    public static String reformat(String logLine) {
        // get the formatted level and message
        String level = LogLevels.logLevel(logLine);
        String msg = LogLevels.message(logLine);

        // create the reformatted string
        return msg + " (" + level + ")";
    }

}
