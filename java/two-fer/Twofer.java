public class Twofer {
    public String twofer(String name) {
        String finalStr = (name == null) ? "you" : name;
        return "One for " + finalStr + ", one for me.";
    }
}
