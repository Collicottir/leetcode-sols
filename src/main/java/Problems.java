import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Problems {
    /**
     *
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
     * 7. Reverse Integer - Medium
     * Given a signed 32-bit integer x, return x with its digits reversed. If reversing x causes the value to go
     *  outside the signed 32-bit integer range [-231, 231 - 1], then return 0.
     * @param x
     * @return
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
