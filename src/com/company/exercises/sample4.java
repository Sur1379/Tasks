package com.company.exercises;

import java.util.Scanner;

  public class sample4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("insert 3 numbers");
                int first = scanner.nextInt();
                   int second = scanner.nextInt();
                      int third = scanner.nextInt();
                           int sum = first + second + third;
                         int dif = first - second - third;
                     int ave = (first + second + third)/3;
            System.out.println("sum = " +sum);
               System.out.println("difference = " +dif);
                  System.out.println("average = " +ave);

    }
}
