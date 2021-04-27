package com.company.exercises;

import java.util.Scanner;

public class sample2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("insert 2 numbers");
            double first = scanner.nextDouble();
        double second = scanner.nextDouble();
        double product = first * second;
        System.out.println(product);

    }
}
