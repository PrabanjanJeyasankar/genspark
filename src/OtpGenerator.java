import java.util.Scanner;

public class OtpGenerator {

    private static int generateOTP(String orderID) {
        int otp = 1;
        for (char digitChar : orderID.toCharArray()) {
            int digit = Character.getNumericValue(digitChar);
            otp *= digit;
        }
        return otp;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the order ID: ");
        String orderID = scanner.next();

        if (!orderID.matches("\\d+")) {
            System.out.println("Order ID must contain only digits.");
            return;
        }

        int otp = generateOTP(orderID);
        System.out.println(otp);
        scanner.close();
    }
}
