class RotationalCipher {

    private final int shiftKey;

    RotationalCipher(int shiftKey) {
        this.shiftKey = shiftKey;
    }

    String rotate(String data) {
        // new shifted string
        StringBuilder shiftedData = new StringBuilder();

        // iterate over each character and shift when it's a letter
        char c;
        for (int i = 0; i < data.length(); i++) {
            c = data.charAt(i);
            if ( Character.isLetter(c) ) {
                shiftedData.append(shiftLetter(c));
            } else {
                shiftedData.append(c);
            }
        }

        return shiftedData.toString();
    }

    private char shiftLetter(char c) {
        // get numeric values for lowercase and uppercase letters
        int aVal = Character.isLowerCase(c) ? 'a' : 'A';

        return (char) (aVal + (c - aVal + shiftKey) % 26);
    }

}
