public class Array_Score {
    public static void main(String[] args) {
        int[] score = {72, 85, 90, 78, 99, 92, 88, 75, 82, 74};

        System.out.println("First Element: " + score[0]);
        System.out.println("Last Element: " + score[score.length - 1]);

        // Finding lowest and highest
        int lowest = score[0];
        int highest = score[0];

        for (int s : score) {
            if (s < lowest) lowest = s;
            if (s > highest) highest = s;
        }

        System.out.println("Lowest Element: " + lowest);
        System.out.println("Highest Element: " + highest);

        System.out.println("\nScores with Index:");
        for (int i = 0; i < score.length; i++) {
            System.out.println("Index " + i + ": " + score[i]);
        }

        System.out.println("\nValues only:");
        for (int s : score) {
            System.out.println(s);
        }

        int sum = 0;
        for (int s : score) {
            sum += s;
        }
        double average = (double) sum / score.length;
        System.out.println("\nAverage Score: " + average);
    }
}
