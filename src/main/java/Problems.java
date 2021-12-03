import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Problems {
    static class RemoveElement {
        private static void swap(int[] nums, int i, int j) {
            int swap = 0;

            swap = nums[i];
            nums[i] = nums[j];
            nums[j] = swap;

            return;
        }

        /**
         * @param nums
         * @param val
         * @return
         *
         *  27. Remove Element - Easy
         *  Given an integer array nums and an integer val, remove all occurrences of val in nums in-place. The
         *  relative order of the elements may be changed. Since it is impossible to change the length of the array in
         *  some languages, you must instead have the result be placed in the first part of the array nums. More
         *  formally, if there are k elements after removing the duplicates, then the first k elements of nums should
         *  hold the final result. It does not matter what you leave beyond the first k elements.
         *  Return k after placing the final result in the first k slots of nums.
         *  Do not allocate extra space for another array. You must do this by modifying the input array
         *  in-place with O(1) extra memory.
         *  NOTE - Tests only test length return
         */
        public static int removeElement(int[] nums, int val) {
            int occurrences = 0;

            for (int i = 0; i < nums.length; i++) {
                if (nums[i] == val) {
                    occurrences++;
                    nums[i] = -1;
                }
            }

            int resultLen = nums.length - occurrences;

            for (int i = 0; i < resultLen; i++)
                if (nums[i] == -1)
                    for (int j = i; j < nums.length; j++)
                        if (nums[j] != -1)
                            swap(nums, i, j);

            return resultLen;
        }
    }


    /**
     * @param nums1
     * @param nums2
     * @return
     *
     * 4. Median of Two Sorted Arrays - Hard
     *  Given two sorted arrays nums0 and nums2 of size m and n respectively, return the median of the two sorted arrays.
     *  The overall run time complexity should be O(log (m+n)).
     */
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        List<Integer> set = new ArrayList<Integer>();
        set.addAll(IntStream.of(nums1).boxed().collect(Collectors.toList()));
        set.addAll(IntStream.of(nums2).boxed().collect(Collectors.toList()));

        Integer[] numArray = set.toArray(new Integer[0]);
        Arrays.sort(numArray);
        double median;

        if (numArray.length % 2 == 0)
            median = ((double)numArray[numArray.length/2] + (double)numArray[numArray.length/2 - 1])/2;
        else
            median = (double) numArray[numArray.length/2];

        return median;
    }

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
