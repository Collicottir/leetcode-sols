import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FindMedianSortedArrays {
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
            median = ((double) numArray[numArray.length / 2] + (double) numArray[numArray.length / 2 - 1]) / 2;
        else
            median = (double) numArray[numArray.length / 2];

        return median;
    }
}
