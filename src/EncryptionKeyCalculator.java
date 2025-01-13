import java.util.Scanner;

public class EncryptionKeyCalculator {

    private static boolean isPrime(int digit) {
        if (digit < 2) return false;
        for (int iterator = 2; iterator <= Math.sqrt(digit); iterator++) {
            if (digit % iterator == 0) return false;
        }
        return true;
    }

    private static int calculateEncryptionKey(String message) {
        int sum = 0;
        for (char character : message.toCharArray()) {
            int digit = Character.getNumericValue(character);
            if (!isPrime(digit)) {
                sum += digit;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the message as a number: ");
        String message = scanner.next();
        int encryptionKey = calculateEncryptionKey(message);
        System.out.println(encryptionKey);
        scanner.close();
    }
}
