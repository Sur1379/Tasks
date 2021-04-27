package com.company.exercises;

import java.nio.channels.ScatteringByteChannel;
import java.util.Scanner;

public class sample3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("input 2 numbers");
        int first = scanner.nextInt();
        int second = scanner.nextInt();
        int remainder = first%second;
        System.out.println(remainder);

    }
}
