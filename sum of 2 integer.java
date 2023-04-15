import java.util.Scanner;

public class SumOfTwoIntegers {
    public static void main(String[] args) {
        int num1, num2, sum;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first integer:");
        num1 = scanner.nextInt();
        System.out.println("Enter second integer:");
        num2 = scanner.nextInt();
        scanner.close();
        sum = num1 + num2;
        System.out.println("Sum of two integers is: " + sum);
    }
}
