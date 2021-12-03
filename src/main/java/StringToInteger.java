public class StringToInteger {
    private static final int MAX = (int) (Math.pow(2, 31) - 1);
    private static final int MIN = (int) (Math.pow(2, 31) * -1);

    /**
     * @param s
     * @return
     *
     * 8. String to Integer (atoi) - Medium
     * Implement the myAtoi(string s) function, which converts a string to a 32-bit signed integer
     *   (similar to C/C++'s atoi function).
     */
    public static int aToI(String s) {
        StringBuilder sb = new StringBuilder();
        Character sign = null;
        int count = 0;

        for (char c : s.toCharArray()) {
            if (count == 0 && c == ' ')
                continue;
            else {
                if (count == 0) {
                    if ('+' == c || '-' == c)
                        sign = c;
                    else if (Character.isDigit(c)) {
                        sign = '+';
                        sb.append(c);
                    } else {
                        return 0;
                    }
                } else {
                    if (!Character.isDigit(c))
                        break;
                    else
                        sb.append(c);
                }

                count++;
            }
        }

        if (sb.length() == 0)
            return 0;

        String result = sb.toString();
        int resultInt;

        try {
            resultInt = Integer.parseInt(result);
        } catch (NumberFormatException e) {
            if ('-' == sign)
                return MIN;

            return MAX;
        }

        if ('-' == sign)
            resultInt = -1 * resultInt;

        return resultInt;
    }
}
