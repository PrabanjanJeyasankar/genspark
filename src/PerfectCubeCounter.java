import java.util.Scanner;

public class PerfectCubeCounter {

    private static boolean isPerfectCube(int number) {
        int cubeRoot = (int) Math.round(Math.cbrt(number));
        return cubeRoot * cubeRoot * cubeRoot == number;
    }

    private static int countPerfectCubes(int[] dimensions) {
        int count = 0;
        for (int dimension : dimensions) {
            if (isPerfectCube(dimension)) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of dimensions: ");
        int numberOfDimensions = scanner.nextInt();

        if (numberOfDimensions <= 0) {
            System.out.println("The number of dimensions must be greater than 0.");
            return;
        }

        int[] dimensions = new int[numberOfDimensions];
        System.out.println("Enter the dimensions:");
        for (int i = 0; i < numberOfDimensions; i++) {
            dimensions[i] = scanner.nextInt();
        }

        int perfectCubeCount = countPerfectCubes(dimensions);
        System.out.println(perfectCubeCount);

        scanner.close();
    }
}
