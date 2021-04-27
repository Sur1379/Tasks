package com.company;

import java.util.Scanner;

public class rrrrrrr{

    public static void main(String []args){
        Scanner user = new Scanner(System.in);
        System.out.println("Input an integer");
        int x = user.nextInt();
        x = x / 45;
        switch(x) {
            case 0:
                System.out.println("number is in 0 -> 45 range");
                break;
            case 1:
                System.out.println("number is in 45 -> 90 range");
                break;
            case 2:
                System.out.println("number is in 90 -> 135 range");
                break;
            default:
                System.out.println("number is in other range");
                break;
        }

    }
}