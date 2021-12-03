import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProblemsTest {
    @Test
    @DisplayName("4. Median of Two Sorted Arrays")
    void findMedianSortedArrays() {
        assertAll(() -> assertEquals(2.0, FindMedianSortedArrays.findMedianSortedArrays(new int[] {1, 3}, new int[] {2})),
                () -> assertEquals(2.5, FindMedianSortedArrays.findMedianSortedArrays(new int[] {1, 2}, new int[] {3, 4})),
                () -> assertEquals(0, FindMedianSortedArrays.findMedianSortedArrays(new int[] {0, 0}, new int[] {0, 0})),
                () -> assertEquals(1.0, FindMedianSortedArrays.findMedianSortedArrays(new int[] {}, new int[] {1})),
                () -> assertEquals(2.0, FindMedianSortedArrays.findMedianSortedArrays(new int[] {2}, new int[] {}))
        );
    }

    @Test
    @DisplayName("7. Reverse Integer")
    void reverseInt() {
        assertAll(
                () -> assertEquals(321, ReverseInt.reverseInt(123)),
                () -> assertEquals(-321, ReverseInt.reverseInt(-123)),
                () -> assertEquals(21, ReverseInt.reverseInt(120)),
                () -> assertEquals(0, ReverseInt.reverseInt(0))
        );
    }

    @Test
    @DisplayName("58. Length of Last Word")
    void lengthOfLastWord() {
        assertAll(
                () -> assertEquals(5, LengthOfLastWord.lengthOfLastWord("Hello World")),
                () -> assertEquals(4, LengthOfLastWord.lengthOfLastWord("   fly me   to   the moon  ")),
                () -> assertEquals(6, LengthOfLastWord.lengthOfLastWord("luffy is still joyboy"))
        );
    }

    @Test
    @DisplayName("27. Remove Element")
    void removeElement() {
        assertAll(
                () -> assertEquals(2, RemoveElement.removeElement(new int[] {3, 2, 2, 3}, 3)),
                () -> assertEquals(5, RemoveElement.removeElement(new int[] {0,1,2,2,3,0,4,2}, 2))
        );
    }
}