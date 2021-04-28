package com.company.exercisesday3;

import java.util.Scanner;

public class test_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("input number");
        double someDouble = scanner.nextDouble();
        System.out.println(" someDouble " + someDouble);
        float someDoubleToFloat = (float) someDouble;
        System.out.println(" someDoubleToFloat " + someDoubleToFloat);
        long someFloatToLong = (long) someDoubleToFloat;
        System.out.println(" someFloatToLong " + someFloatToLong);
        int someLongToInt = (int) someFloatToLong;
        System.out.println(" someLongToInt " + someLongToInt);
        short someIntToShort = (short) someLongToInt;
        System.out.println(" someIntToShort " + someIntToShort);
        byte someShortToByte = (byte) someIntToShort;
        System.out.println(" someShortToByte " + someShortToByte);

    }
}
