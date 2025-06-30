package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static double calculateCircleArea(double radius){
        return Math.PI*radius*radius;
    }
    public static double calculateTriangleArea(double base, double height){
        return 0.5*base*height;
    }
    public static double calculateRectangleArea(double length, double width){
        return length*width;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=====Area Calculator=====");
        System.out.println("1. Circle");
        System.out.println("2. Triangle");
        System.out.println("3. Rectangle");

        System.out.print("Choose a shape (1-3): ");
        int shape = scanner.nextInt();

        switch (shape){
            case 1:
                System.out.print("Enter the radius: ");
                double radius = scanner.nextInt();
                double circle = calculateCircleArea(radius);
                System.out.printf("Area of the circle: %.2f%n", circle);
                break;
            case 2:
                System.out.print("Enter the base: ");
                double base = scanner.nextInt();
                System.out.print("Enter the height: ");
                double height = scanner.nextInt();
                double triangle = calculateTriangleArea(base, height);
                System.out.printf("Area of the triangle: %.2f%n", triangle);
                break;
            case 3:

                System.out.print("Enter the length: ");
                double length = scanner.nextInt();
                System.out.print("Enter the width: ");
                double width = scanner.nextInt();
                double rectangle = calculateRectangleArea(length, width);
                System.out.printf("Area of the rectangle: %.2f%n", rectangle);
                break;
            default:
                break;
        }
    }
}