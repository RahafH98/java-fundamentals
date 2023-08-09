package basiclibrary;

import basiclibrary.Library;
import org.junit.jupiter.api.Test;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class LibraryTest {

    @Test
    public void testRoll() {
        Library library = new Library();
        int[] rolls = library.roll(5);
        assertEquals(5, rolls.length);

        for (int roll : rolls) {
            assertTrue(roll >= 1 && roll <= 6);
        }
    }

    @Test
    public void testContainsDuplicates() {
        Library library = new Library();
        int[] arrWithDuplicates = {1, 2, 3, 4, 5, 3};
        assertTrue(library.containsDuplicates(arrWithDuplicates));

        int[] arrWithoutDuplicates = {1, 2, 3, 4, 5, 6};
        assertFalse(library.containsDuplicates(arrWithoutDuplicates));
    }

    @Test
    public void testCalculateAverage() {
        Library library = new Library();
        int[] arr = {1, 2, 3, 4, 5};
        assertEquals(3.0, library.calculateAverage(arr));
    }

    @Test
    public void testFindArrayWithLowestAverage() {
        Library library = new Library();
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {2, 3, 4, 5, 6};
        int[] arr3 = {1, 1, 1, 1, 1};

        int[][] arrays = {arr1, arr2, arr3};
        assertEquals(2, library.findArrayWithLowestAverage(arrays));
    }
}
