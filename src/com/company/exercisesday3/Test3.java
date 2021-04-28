package com.company.exercisesday3;

import java.util.Scanner;

public class test_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("insert Fahreheit");
        double someFahrenheit = scanner.nextDouble();
        double fahrenheitToCelsius = (someFahrenheit - 32)*5/9;
        System.out.println(fahrenheitToCelsius);

        float resultFloat = (float) fahrenheitToCelsius;
        System.out.println(resultFloat);

        int resultInt = (int) resultFloat;
        System.out.println(resultInt);
    }
}
