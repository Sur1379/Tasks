package com.company.exercisesday3;

import java.util.Scanner;

public class Test4 {
    public static void main(String[] args) {
        double p = 3.14159;
        Scanner scanner = new Scanner(System.in);
        System.out.println("input radius value");
        double radius = scanner.nextDouble();
         double area = p * radius * radius;
        System.out.println(" area = " +area);
         double perimetre = 2 * p * radius;
        System.out.println(" perimetre = " +perimetre);
    }
}
