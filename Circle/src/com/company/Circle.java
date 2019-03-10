package com.company;

import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {
        double radius;
        double arae;
        double perimeter;

        Scanner scan = new Scanner(System.in);
        System.out.println("This program calculates the areas " +
                "and the perimeters of the excircle and the incircle " +
                "of a given rectangle ");
            System.out.println("Please enter the two coordinates of the left-upper point of the rectangle");
        double leftUpX = scan.nextInt();
        double leftUpY = scan.nextInt();
        System.out.println("Please enter the two coordinates of the right-down point of the rectangle");
        double rightDownX = scan.nextInt();
        double rightDownY = scan.nextInt();
        radius = Math.sqrt(Math.pow((leftUpY - rightDownY), 2)) / 2;
        arae = Math.PI * radius * radius;
        perimeter = 2 * Math.PI * radius;
        System.out.println("Incircle: redios is: " + radius + " arae is: " + arae + " perimeter is: " + perimeter);
        radius = Math.sqrt(Math.pow((leftUpX - rightDownX), 2) + Math.pow((leftUpY - rightDownY), 2)) / 2;
        arae = Math.PI * radius * radius;
        perimeter = 2 * Math.PI * radius;
        System.out.println("Excircle: redios is: " + radius + " arae is: " + arae + " perimeter is: " + perimeter);
    }
}

/*
package com.company;

public class Main {
    public static void main(String[] args) {

        int x = 1;
        int y = 10;
        int z = -3;
        //System.out.println(x++);
        //System.out.println(y--);
        int q=(x++ * y--)+ ++z;

        System.out.println(q);

    }
}


/*
 * answar
 * 1:b
 * 2:a
 * 3:b
 * 4:d
 * 5:b
 * 6:d
 * 7:a
 * 8:b
 * 9:
 * 10:a
 * 11:c
 * 12:b
 * 13:c
 * 14:d
 * 15:c
 * 16:d
 * 17:d
 * 18:d
 * 19:d
 *
 */