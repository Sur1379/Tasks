package com.company.exercises;

import java.util.Scanner;

public class sample15 {
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
       int firstNum = scanner.nextInt();
        int secondNum = scanner.nextInt();
        firstNum = firstNum - secondNum;
        secondNum = firstNum + secondNum;
        firstNum = secondNum - firstNum;
                System.out.println(firstNum);
        System.out.println(secondNum);

    }
}
