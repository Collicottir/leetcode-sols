public class ReverseInt {
    /**
     * @param x
     * @return
     *
     * 7. Reverse Integer - Medium
     * Given a signed 32-bit integer x, return x with its digits reversed. If reversing x causes the value to go
     *  outside the signed 32-bit integer range [-231, 231 - 1], then return 0.
     */
    public static int reverseInt(int x) {
        String s = String.valueOf(x);
        int start = s.startsWith("-") ? 1 : 0;
        byte[] input = s.getBytes();
        byte[] arr = new byte[input.length];
        int idxOffset = start > 0 ? input.length : input.length - 1;

        for (int i = start; i < input.length; i++) {
            arr[i] = input[idxOffset - i];
        }

        String out = new String(arr);
        int outInt;

        try {
            outInt = Integer.parseInt(out.trim());
        } catch (NumberFormatException e) {
            return 0;
        }

        if (start > 0)
            outInt *= -1;

        return outInt;
    }
}
