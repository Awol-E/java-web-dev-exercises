package exercises;

import java.util.Scanner;

public class AreaOfRectangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter length of the rectangle :");
        Double lengthRect = input.nextDouble();

        System.out.println("Enter width of the rectangle :");
        Double widthRect = input.nextDouble();

        Double areaOfRectangle = lengthRect / widthRect;
        System.out.println("Area of a rectangle: " + areaOfRectangle + " area.");
    }
}