import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Problems {
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        List<Integer> set = new ArrayList<Integer>();
        set.addAll(IntStream.of(nums1).boxed().collect(Collectors.toList()));
        set.addAll(IntStream.of(nums2).boxed().collect(Collectors.toList()));

        Integer[] numArray = set.toArray(new Integer[0]);
        Arrays.sort(numArray);
        double median;

        System.out.println(Arrays.toString(numArray));
        if (numArray.length % 2 == 0)
            median = ((double)numArray[numArray.length/2] + (double)numArray[numArray.length/2 - 1])/2;
        else
            median = (double) numArray[numArray.length/2];

        return median;
    }
}
