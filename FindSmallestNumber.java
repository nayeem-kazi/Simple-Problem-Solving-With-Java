package com.exam;

import java.util.Scanner;

public class FindSmallestNumber {

    public static void main(String[] args) {
        int n1, n2, n3;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter three number -");

        n1 = input.nextInt();
        n2 = input.nextInt();
        n3 = input.nextInt();

        if (n1 < n2 & n1 < n3) {
            System.out.println("The Smallest Number Is " + n1);
        } else if (n2 < n1 & n2 < n3) {
            System.out.println("The Smallest Number Is " + n2);
        } else {
            System.out.println("The Smallest Number Is " + n3);
        }
    }
}
