package Lab1Task1;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        System.out.println("Hello again! Welcome to Java V2 version.");

        Scanner input = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = input.nextInt();

        System.out.print("Enter second number: ");
        int num2 = input.nextInt();

        int product = num1 * num2;
        System.out.println("The product of " + num1 + " and " + num2 + " is: " + product);

        input.close();
    }
}
