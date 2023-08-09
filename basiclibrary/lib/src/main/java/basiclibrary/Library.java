package basiclibrary;
import java.util.HashSet;
import java.util.Set;
import java.util.Random;

public class Library {

    public static int[] roll(int n) {
        Random random = new Random();
        int[] rolls = new int[n];

        for (int i = 0; i < n; i++) {
            rolls[i] = random.nextInt(6) + 1;
        }

        return rolls;
    }

    public boolean containsDuplicates(int[] arr) {
        Set<Integer> uniqueElements = new HashSet<>();

        for (int num : arr) {
            if (uniqueElements.contains(num)) {
                return true;
            }
            uniqueElements.add(num);
        }

        return false;
    }

    public static double calculateAverage(int[] arr) {
        if (arr.length == 0) {
            return 0.0;
        }

        int sum = 0;
        for (int num : arr) {
            sum += num;
        }

        return (double) sum / arr.length;
    }

    public static int findArrayWithLowestAverage(int[][] arrays) {
        if (arrays.length == 0) {
            return -1;
        }

        int lowestIndex = 0;
        double lowestAverage = calculateAverage(arrays[0]);

        for (int i = 1; i < arrays.length; i++) {
            double currentAverage = calculateAverage(arrays[i]);
            if (currentAverage < lowestAverage) {
                lowestAverage = currentAverage;
                lowestIndex = i;
            }
        }

        return lowestIndex;
    }

    public static void main(String[] args) {
        Library library = new Library();

        int[] rolls = library.roll(5);
        System.out.println("Rolls: " + java.util.Arrays.toString(rolls));

        int[] duplicatesTest = { 1, 2, 3, 4, 5, 3 };
        System.out.println("Contains duplicates: " + library.containsDuplicates(duplicatesTest));

        int[] averageTest1 = { 1, 2, 3, 4, 5 };
        int[] averageTest2 = { 2, 3, 4, 5, 6 };
        int[][] averageTests = { averageTest1, averageTest2 };
        int index = library.findArrayWithLowestAverage(averageTests);
        System.out.println("Array with lowest average: " + java.util.Arrays.toString(averageTests[index]));
    }
}
