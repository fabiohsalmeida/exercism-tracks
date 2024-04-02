class ReverseString {

    String reverse(String inputString) {
        if (inputString.isEmpty()) {
            return inputString;
        }

        char[] inputCharlist = inputString.toCharArray();
        int lastPos = inputCharlist.length-1;
        int maxRange = lastPos/2;

        for (int i = 0; i <= maxRange; i++) {
            char temp = inputCharlist[i];
            int posByEnd = lastPos - i;
            inputCharlist[i] = inputCharlist[posByEnd];
            inputCharlist[posByEnd] = temp;
        }

        return String.valueOf(inputCharlist);
    }
}
