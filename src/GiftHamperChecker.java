import java.util.Scanner;

public class GiftHamperChecker {

    private static boolean isPerfectCube(int number) {
        int cubeRoot = (int) Math.round(Math.cbrt(number));
        return cubeRoot * cubeRoot * cubeRoot == number;
    }

    private static int findNextPerfectCube(int totalPrice) {
        int cubeRoot = (int) Math.cbrt(totalPrice);
        int nextCubeRoot = cubeRoot + 1;
        return nextCubeRoot * nextCubeRoot * nextCubeRoot;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of products: ");
        int numberOfProducts = scanner.nextInt();

        if (numberOfProducts <= 0) {
            System.out.println("The number of products must be greater than 0.");
            return;
        }

        int[] prices = new int[numberOfProducts];
        System.out.println("Enter the prices of the products: ");
        int totalPrice = 0;
        for (int i = 0; i < numberOfProducts; i++) {
            prices[i] = scanner.nextInt();
            totalPrice += prices[i];
        }

        if (isPerfectCube(totalPrice)) {
            System.out.println("Yes");
        } else {
            int nextPerfectCube = findNextPerfectCube(totalPrice);
            int additionalPrice = nextPerfectCube - totalPrice;
            System.out.println("The price of the product that you should buy in order to receive a gift hamper is " + additionalPrice);
        }

        scanner.close();
    }
}
