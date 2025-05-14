public class multiple {
    public static void main(String[] args) {
        String input = "t6hj7ui5";
        String output = expandString(input);
        System.out.println(output);
    }

    public static String expandString(String str) {
        StringBuilder result = new StringBuilder();
        char lastChar = '\0';

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (Character.isDigit(ch)) {
                int count = Character.getNumericValue(ch);
                for (int j = 0; j < count; j++) {
                    result.append(lastChar);
                }
            } else {
                result.append(ch);
                lastChar = ch;
            }
        }
        return result.toString();
    }
}
