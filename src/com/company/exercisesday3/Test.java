package com.company.exercisesday3;

import java.util.Scanner;

public class test1 {
    public static void main(String[] args) {
//         int x = 15;
//         int y = 1245;
//         String s = String.valueOf(x);
//        System.out.println(x+1);
//        System.out.println(s);

//        Scanner scanner = new Scanner(System.in);
//        System.out.println("insert x");
//        int inputNum = scanner.nextInt();
//        int x = inputNum / 100;
//        int z = inputNum % 10;
//         int y = (inputNum % 100) / 10;
//         int s = x + y + z;
//        System.out.println(s);

        Scanner scanner = new Scanner(System.in);
        System.out.println("insert x");
        int inputNum = scanner.nextInt();
        String stringNum = String.valueOf(inputNum);
        char ch = stringNum.charAt(stringNum.length()/2);
        System.out.println(ch);




    }
}
