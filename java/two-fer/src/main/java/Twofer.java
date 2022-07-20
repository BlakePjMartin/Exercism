public class Twofer {
    public String twofer(String name) {
        String displayName = ((name == null) || name.equals("")) ? "you" : name;
        return "One for " + displayName + ", one for me.";
    }
}
