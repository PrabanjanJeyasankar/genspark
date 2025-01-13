import java.util.Scanner;

public class ProfitableDaysCounter {

    private static int countProfitableDays(int[] sales) {
        int count = 0;
        for (int sale : sales) {
            if (sale > 0) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of days: ");
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("Number of days must be greater than 0.");
            return;
        }

        int[] sales = new int[n];
        System.out.println("Enter the sales values:");
        for (int i = 0; i < n; i++) {
            sales[i] = scanner.nextInt();
        }

        int profitableDays = countProfitableDays(sales);
        System.out.println(profitableDays);
        scanner.close();
    }
}
