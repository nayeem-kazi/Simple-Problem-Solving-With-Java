package com.exam;

import java.util.Scanner;

public class NumberToWeekdays {

    public static void main(String[] args) {
        int n = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a numbe to see the weekday's name : ");
        n = input.nextInt();
        
        switch(n) {
            case 1: System.out.println("Saturday");
            break;
            case 2: System.out.println("Sunday");
            break;
            case 3: System.out.println("Monday");
            break;
            case 4: System.out.println("Tuesday");
            break;
            case 5: System.out.println("Wednesday");
            break;
            case 6: System.out.println("Thursday");
            break;
            case 7: System.out.println("Friday");
            break;
            default: System.out.println("Entered value SHould be between 1 and 7");
        }
    }
}
