package com.company.exercisesday3;

import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("input number");
        byte someByte = scanner.nextByte();
        System.out.println(" someByte " + someByte);
        short someByteToShort = someByte;
        System.out.println(" someByteToShort " + someByteToShort);
        int someShortToInt = someByteToShort;
        System.out.println(" someShortToInt " + someShortToInt);
        long someIntToLong = someShortToInt;
        System.out.println(" someIntToLong " + someIntToLong);
        float someLongToFloat = someIntToLong;
        System.out.println(" someLongToFloat " + someLongToFloat);
        double someFloatToDouble = someLongToFloat;
        System.out.println(" someFloatToDouble " + someFloatToDouble);

    }
}

