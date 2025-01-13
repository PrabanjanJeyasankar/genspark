import java.util.Scanner;

public class LargestTrussArea {

    private static double calculateArea(double base, double height) {
        return (base * height) / 2;
    }

    private static double findLargestArea(double[] bases, double[] heights) {
        if (bases.length != heights.length || bases.length == 0) {
            throw new IllegalArgumentException("Invalid input: bases and heights arrays must have the same non-zero length.");
        }

        double largestArea = 0;
        for (int i = 0; i < bases.length; i++) {
            double area = calculateArea(bases[i], heights[i]);
            if (area > largestArea) {
                largestArea = area;
            }
        }

        return largestArea;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of trusses: ");
        int numberOfTrusses = scanner.nextInt();

        if (numberOfTrusses <= 0) {
            System.out.println("The number of trusses must be greater than 0.");
            return;
        }

        double[] bases = new double[numberOfTrusses];
        double[] heights = new double[numberOfTrusses];

        System.out.println("Enter the bases and heights of the trusses:");
        for (int iterator = 0; iterator < numberOfTrusses; iterator++) {
            System.out.print("Base of truss " + (iterator + 1) + ": ");
            bases[iterator] = scanner.nextDouble();
            System.out.print("Height of truss " + (iterator + 1) + ": ");
            heights[iterator] = scanner.nextDouble();
        }

        double largestArea = findLargestArea(bases, heights);

        System.out.printf("The largest area is: %.6f\n", largestArea);

        scanner.close();
    }
}
