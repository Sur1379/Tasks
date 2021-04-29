package com.company.exercisesday3;

import org.w3c.dom.ls.LSOutput;

public class Test8 {
    public static void main(String[] args) {
//       char s = 'S';
//       char u = 'u';
//       char r = 'r';
//       char e = 'e';
//       char n = 'n';
//       int average = (s + u + r + e + n)/5;
//        System.out.println(" Suren - " +average);
        String name = "Suren";
        int average = (name.charAt(0) + name.charAt(1) + name.charAt(2) + name.charAt(3) + name.charAt(4)) / 5;
        System.out.println("Suren - " + average);
    }
}
