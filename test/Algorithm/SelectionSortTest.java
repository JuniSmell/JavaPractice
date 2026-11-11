package Algorithm;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class SelectionSortTest {
    @Test
    void sorts() {
        int[] a = {3, 1, 2, 0};
        Selection_Sort.selectionSort(a);
        assertArrayEquals(new int[]{0, 1, 2, 3}, a);
    }
}
