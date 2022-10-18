package com.exam;

import java.util.Scanner;

public class ReadNumber {

    public static void main(String[] args) {
        Double number;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a Number");
        number = input.nextDouble();
        if (number > 0) {
            if (number<1) {
                System.out.println("Positive Small Number");
            } else if (number > 1000000){
                System.out.println("Positive Large Number");
            }
            else {
                System.out.println("Positive Number");
            }

        } else if (number < 0) {
            if (Math.abs(number)<1) {
                System.out.println("Negetive Small Number");
            } else if (Math.abs(number) > 1000000){
                System.out.println("Negetive Large Number");
            }
            else {
                System.out.println("Negetive Number");
            }
            
        } else {
            System.out.println("Zero");
        }
        
    }
}
