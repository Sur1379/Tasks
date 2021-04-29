package com.company.exercisesday3;

import java.util.Scanner;

public class Test9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input number from 32 to 127 range");
        int inputNum = scanner.nextInt();
        char ch = (char) inputNum;
        System.out.println(ch);
    }
}
