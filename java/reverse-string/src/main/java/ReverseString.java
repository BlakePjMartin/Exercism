class ReverseString {

    String reverse(String inputString) {
        char[] input = inputString.toCharArray();
        int start = 0;
        int end = input.length - 1;
        char temp;
        while (end > start) {
            temp = input[start];
            input[start] = input[end];
            input[end] = temp;
            start++;
            end--;
        }

        return String.valueOf(input);
    }
  
}
