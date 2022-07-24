class SqueakyClean {
    static String clean(String identifier) {
        // copy the given string and replace all lower case greek letters with nothing
        String cpyStr = identifier;
        cpyStr = cpyStr.replaceAll("[\\u03b1-\\u03ce]", "");

        // StringBuilder to form formatted string
        StringBuilder str = new StringBuilder();

        // convert the string to an array of chars, over which we will iterate
        char[] charsStr = cpyStr.toCharArray();

        for (int i = 0; i < charsStr.length; i++) {
            // get the codepoint for the current char
            int cps = Character.codePointAt(charsStr, i);

            // decide what to do with the current char
            if ( charsStr[i] == ' ' ) {
                str.append("_");
            }
            else if ( charsStr[i] == '-' ) {
                if ( i + 1 < charsStr.length && Character.isLetter(charsStr[i + 1]) ) {
                    str.append(Character.toUpperCase(charsStr[i + 1]));
                    i++;
                }
            }
            else if ( Character.isISOControl(cps) ) {
                str.append("CTRL");
            }
            else if ( Character.isLetter(cps) ) {
                str.append(charsStr[i]);
            }
        }

        return str.toString();
    }

}
