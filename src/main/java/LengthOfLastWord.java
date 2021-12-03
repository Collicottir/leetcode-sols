public class LengthOfLastWord {
    /**
     * @param s
     * @return
     *
     * 58. Length of Last Word - Easy
     * Given a string s consisting of some words separated by some number of spaces, return the length of the last
     * word in the string. A word is a maximal substring consisting of non-space characters only.
     */
    public static int lengthOfLastWord(String s) {
        if (s == null)
            return 0;

        s = s.trim();
        int lastSpace = s.lastIndexOf(' ') + 1;
        return s.length() - lastSpace;
    }
}
