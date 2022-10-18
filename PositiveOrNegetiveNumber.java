
package com.exam;

import java.util.Scanner;

public class PositiveOrNegetiveNumber {
    public static void main(String[] args) {
        int n=0;
        System.out.println("Enter a Number");
        Scanner input = new Scanner(System.in);
        n=input.nextInt();
        if (n<0) {
            System.out.println("Negetive");
        } else if(n>0){
            System.out.println("Positive");
        }else{
            System.out.println("Nutrul");
        }
    }
}
