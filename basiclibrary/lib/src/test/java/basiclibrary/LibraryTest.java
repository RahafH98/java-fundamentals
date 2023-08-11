package basiclibrary;

import basiclibrary.Library;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

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

    @Test
    public void testFindMissingTemperatures() {
        Library library = new Library();

        int[][] weeklyMonthTemperatures = {
                {66, 64, 58, 65, 71, 57, 60},
                {57, 65, 65, 70, 72, 65, 51},
                {55, 54, 60, 53, 59, 57, 61},
                {65, 56, 55, 52, 55, 62, 57}
        };

        String expectedMissingTemps =
                "Never saw temperature: 63\n" +
                        "Never saw temperature: 67\n" +
                        "Never saw temperature: 68\n" +
                        "Never saw temperature: 69\n";

        String missingTemps = library.findMissingTemperatures(weeklyMonthTemperatures);
        assertEquals(expectedMissingTemps, missingTemps);
    }

    @Test
    public void testTally() {
        Library library = new Library();
        List<String> votes = new ArrayList<>();
        votes.add("Bush");
        votes.add("Bush");
        votes.add("Bush");
        votes.add("Shrub");
        votes.add("Hedge");
        votes.add("Shrub");
        votes.add("Bush");
        votes.add("Hedge");
        votes.add("Bush");

        String winner = library.tally(votes);
        assertEquals("Bush", winner);
    }
}
