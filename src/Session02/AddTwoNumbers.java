package Session02;

import java.util.Scanner;

public class AddTwoNumbers {
    public static void main(String[] args) {

        boolean response;

        Scanner scanner = new Scanner(System.in);

        do {
            // What we need
            System.out.println("Please Enter First Number");
            int num1 = scanner.nextInt();

            System.out.println("Please Enter Second Number");
            int num2 = scanner.nextInt();

            // Calculation
            int sum = num1 + num2;

            System.out.println("The sum is " + sum);

            System.out.println("Do you want to continue? 1-true 2-false");

            response = scanner.nextBoolean();

        } while (response);

        scanner.close();
    }
}
