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

    @Test
    @DisplayName("7. Reverse Integer")
    void reverseInt() {
        assertAll(
                () -> assertEquals(321, Problems.reverseInt(123)),
                () -> assertEquals(-321, Problems.reverseInt(-123)),
                () -> assertEquals(21, Problems.reverseInt(120)),
                () -> assertEquals(0, Problems.reverseInt(0))
        );
    }
}