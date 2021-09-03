package org.launchcode.java.studios.areaofacircle;
import java.util.Scanner;
public class Area {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a radius:");
        Double radius = input.nextDouble();
        while (radius < 0){
            System.out.println("Do not enter negative number:");
            radius = input.nextDouble();
        }
        String radiusNum = String.valueOf(radius);
        Double areaOfCircle = Circle.getArea(radius);
        System.out.println("The area of a circle of radius" + radius + " is:" + areaOfCircle);
        input.close();
    }
}

