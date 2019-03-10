package com.company;
import java.util.Scanner;

public class Equations {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("This program solves a system of 2 linear equations \n Enter the coefficients a11 a12 a21 a22 b1 b2");
        int a11 = input.nextInt();
        int a12 = input.nextInt();
        int a21 = input.nextInt();
        int a22 = input.nextInt();
        int b1 = input.nextInt();
        int b2 = input.nextInt();

        // Show the equations after the input
        System.out.println("Eq1: " + a11 + "*x1+" + a12 + "*x2=" + b1);
        System.out.println("Eq2: " + a21 + "*x1+" + a22 + "*x2=" + b2);

        if (((a11 * a22) - (a12 * a21)) != 0) {
            double x1 = ((double) (b1 * a22 - b2 * a12) / (double) (a11 * a22 - a12 * a21));
            double x2 = ((double) (b2 * a11 - b1 * a21) / (double) (a11 * a22 - a12 * a21));
            System.out.println("Single solution: (" + x1 + "," + x2 + ")");
        } else if ((b2 * a11 - b1 * a21 == 0) && (b1 * a22 - b2 * a12 == 0) && !(b1 != 0 && a11 == 0 && a12 == 0) && !(b2 != 0 && a21 == 0 && a22 == 0)) {
            System.out.println("Many solution");
        } else {
            System.out.println("No solution");
        }
    }
}
