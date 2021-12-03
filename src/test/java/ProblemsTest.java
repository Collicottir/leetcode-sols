import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProblemsTest {

    @Test
    @DisplayName("4. Median of Two Sorted Arrays")
    void findMedianSortedArrays() {
        assertAll(() -> assertEquals(2.0, Problems.findMedianSortedArrays(new int[] {1, 3}, new int[] {2})),
                () -> assertEquals(2.5, Problems.findMedianSortedArrays(new int[] {1, 2}, new int[] {3, 4})),
                () -> assertEquals(0, Problems.findMedianSortedArrays(new int[] {0, 0}, new int[] {0, 0})),
                () -> assertEquals(1.0, Problems.findMedianSortedArrays(new int[] {}, new int[] {1})),
                () -> assertEquals(2.0, Problems.findMedianSortedArrays(new int[] {2}, new int[] {}))
        );
    }
}