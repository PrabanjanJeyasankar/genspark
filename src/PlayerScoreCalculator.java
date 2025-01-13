import java.util.Scanner;

public class PlayerScoreCalculator {

    private static int calculateScore(int[] numbers, int divisor) {
        int totalScore = 0;
        for (int number : numbers) {
            totalScore += number / divisor;
        }
        return totalScore;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int numberOfElements = scanner.nextInt();

        if (numberOfElements <= 0) {
            System.out.println("Number of elements must be greater than 0.");
            return;
        }

        int[] numbers = new int[numberOfElements];
        System.out.println("Enter the elements:");
        for (int iterator = 0; iterator < numberOfElements; iterator++) {
            numbers[iterator] = scanner.nextInt();
        }

        System.out.print("Enter the divisor: ");
        int divisor = scanner.nextInt();

        if (divisor <= 0) {
            System.out.println("Divisor must be greater than 0.");
            return;
        }

        int score = calculateScore(numbers, divisor);
        System.out.println(score);
        scanner.close();
    }
}
