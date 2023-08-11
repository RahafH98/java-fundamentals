package basiclibrary;

import java.util.HashSet;
import java.util.Set;
import java.util.Random;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

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

    public static String findMissingTemperatures(int[][] temperatures) {
        int minTemp = Integer.MAX_VALUE;
        int maxTemp = Integer.MIN_VALUE;
        Set<Integer> uniqueTemps = new HashSet<>();

        for (int[] weekTemps : temperatures) {
            for (int temp : weekTemps) {
                if (temp < minTemp) {
                    minTemp = temp;
                }
                if (temp > maxTemp) {
                    maxTemp = temp;
                }
                uniqueTemps.add(temp);
            }
        }

        StringBuilder missingTemps = new StringBuilder();
        for (int temp = minTemp; temp <= maxTemp; temp++) {
            if (!uniqueTemps.contains(temp)) {
                missingTemps.append("Never saw temperature: ").append(temp).append("\n");
            }
        }

        return missingTemps.toString();
    }

    public static String tally(List<String> votes) {
        Map<String, Integer> voteCount = new HashMap<>();

        for (String vote : votes) {
            voteCount.put(vote, voteCount.getOrDefault(vote, 0) + 1);
        }

        int maxVotes = 0;
        String winner = "";

        for (Map.Entry<String, Integer> entry : voteCount.entrySet()) {
            if (entry.getValue() > maxVotes) {
                maxVotes = entry.getValue();
                winner = entry.getKey();
            }
        }

        return winner;
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

        // October Seattle weather data
        int[][] weeklyMonthTemperatures = {
                {66, 64, 58, 65, 71, 57, 60},
                {57, 65, 65, 70, 72, 65, 51},
                {55, 54, 60, 53, 59, 57, 61},
                {65, 56, 55, 52, 55, 62, 57}
        };
        String missingTemps = findMissingTemperatures(weeklyMonthTemperatures);
        System.out.println(missingTemps);

        // Tallying Election
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

        String winner = tally(votes);
        System.out.println(winner + " received the most votes !! ");
    }
}
