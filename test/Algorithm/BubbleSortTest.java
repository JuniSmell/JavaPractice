package Algorithm;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class BubbleSortTest {
    @Test
    void sortsUnordered() {
        int[] a = {5, 2, 9, -1, 2};
        assertArrayEquals(new int[]{-1, 2, 2, 5, 9}, BubbleSort.bubble_sort(a, a.length));
    }

    @Test
    void handlesEmptyAndSingle() {
        assertArrayEquals(new int[]{}, BubbleSort.bubble_sort(new int[]{}, 0));
        assertArrayEquals(new int[]{7}, BubbleSort.bubble_sort(new int[]{7}, 1));
    }
}
