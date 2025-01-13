import java.util.Scanner;

public class StockDistributionCounter {

    private static int calculateDistributions(int stock) {
        int distributions = 0;
        while (stock > 0) {
            if (stock % 2 == 0) {
                stock /= 2;
            } else {
                stock -= 1;
            }
            distributions++;
        }
        return distributions;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the initial stock value: ");
        int stock = scanner.nextInt();

        if (stock <= 0) {
            System.out.println("Stock value must be greater than 0.");
            return;
        }

        int totalDistributions = calculateDistributions(stock);
        System.out.println(totalDistributions);
        scanner.close();
    }
}
