package LeetCode_JAVA;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class No35Test {
    private final No35_Search_Insert_Position s = new No35_Search_Insert_Position();

    @Test
    void examples() {
        int[] n = {1, 3, 5, 6};
        assertEquals(2, s.searchInsert(n, 5));
        assertEquals(1, s.searchInsert(n, 2));
        assertEquals(4, s.searchInsert(n, 7));
        assertEquals(0, s.searchInsert(n, 0));
    }
}
