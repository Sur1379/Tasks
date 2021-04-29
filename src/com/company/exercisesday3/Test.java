package com.company.exercisesday3;

import java.util.Scanner;

public class Test {
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

//        Scanner scanner = new Scanner(System.in);
//        System.out.println("insert x");
//        int inputNum = scanner.nextInt();
//        String stringNum = String.valueOf(inputNum);
//        char ch = stringNum.charAt(stringNum.length()/2);
//        System.out.println(ch);

//        Scanner scanner = new Scanner(System.in);
//        System.out.println("insert x");
//        int inputNum = scanner.nextInt();
//        String stringNum = String.valueOf(inputNum);
////        System.out.println(stringNum.charAt(stringNum.length()/2));
//    //        System.out.println(x);

//        Scanner scanner = new Scanner(System.in);
//        System.out.println("insert x");
//        int inputNum = scanner.nextInt();
//        String someString = String.valueOf(inputNum) ;
//        System.out.println(someString.indexOf((someString.charAt((someString.length()-1)/2))));

        Scanner scanner = new Scanner(System.in);
        System.out.println("insert x");
        long x = scanner.nextLong();
        System.out.println("insert y");
        long y = scanner.nextLong();
        String xString = String.valueOf(x);
        String yString = String.valueOf(y);
        char xStringChar = xString.charAt((xString.length()-1)/2);
        char yStringChar = yString.charAt((yString.length()-1)/2);
//        int ixS = (xStringChar) - '0';
//        int iyS = (yStringChar) - '0';
        long ixS = Integer.parseInt(String.valueOf(xStringChar));
        long iyS = Integer.parseInt(String.valueOf(yStringChar));
        boolean bx = ixS != iyS ;



        System.out.println(bx);



    }
}
