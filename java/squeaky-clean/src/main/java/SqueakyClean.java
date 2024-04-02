class SqueakyClean {
    static String clean(String identifier) {
        StringBuilder sb = new StringBuilder();
        boolean nextIsCaps = false;
        boolean wasDefault = false;

        for(char c : identifier.toCharArray()) {

            switch (c) {
                case ' ' -> sb.append('_');
                case '-' -> nextIsCaps = true;
                case '4' -> sb.append('a');
                case '3' -> sb.append('e');
                case '0' -> sb.append('o');
                case '1' -> sb.append('l');
                case '7' -> sb.append('t');
                default -> wasDefault = true;
            }

            if (wasDefault && Character.isLetter(c)) {
                String s = String.valueOf(c);
                if (nextIsCaps && Character.isLowerCase(c)) {
                    s = s.toUpperCase();

                    nextIsCaps = false;
                }

                sb.append(s);
            }
        }

        return sb.toString();
    }
}
