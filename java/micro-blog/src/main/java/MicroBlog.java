import static java.lang.Math.min;

class MicroBlog {
    public String truncate(String input) {
        return input.substring(0, input.offsetByCodePoints(0, min(5, input.length())));
    }

}
