package com.company.exercises;

import java.util.Scanner;

public class sample14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        System.out.println((num / 100) % 10);
    }
}
