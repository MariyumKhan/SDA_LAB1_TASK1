package Lab1Task1;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        System.out.println("Welcome! Let's calculate area and perimeter of a rectangle.");

        Scanner input = new Scanner(System.in);
        System.out.print("Enter length: ");
        double length = input.nextDouble();

        System.out.print("Enter width: ");
        double width = input.nextDouble();

        double area = length * width;
        double perimeter = 2 * (length + width);

        System.out.println("Area of rectangle: " + area);
        System.out.println("Perimeter of rectangle: " + perimeter);

        input.close();
    }
}
