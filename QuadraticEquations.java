package com.exam;

import java.util.Scanner;

public class QuadraticEquations {

    public static void main(String[] args) {
        Double a = 0.0, b = 0.0, c = 0.0, r1 = 0.0, r2 = 0.0;

        Scanner input = new Scanner(System.in);

        System.out.println("Enter The Value of a : ");
        a = input.nextDouble();
        System.out.println("Enter The Value of b : ");
        b = input.nextDouble();
        System.out.println("Enter The Value of c : ");
        c = input.nextDouble();

        Double result = (Double) (b * b - 4 * a * c);
        System.out.println(result);

        if (result > 0.0) {
            r1 = (Double) (-b + Math.sqrt(result)) / (2 * a);
            r2 = (Double) (-b - Math.sqrt(result)) / (2 * a);
            System.out.println("The Roots are " + r1 + " and " + r2);
        } else if (result == 0.0) {
            r1 = (Double) (-b) / (2 * a);
            System.out.println("The Root is " + r1);
        } else {
            System.out.println("There is no root.");
        }

    }

}
