
package com.exam;

import java.util.Scanner;

public class DaysOfMonth {
    public static void main(String[] args) {
        int month, year;
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter the YEAR");
        year = input.nextInt();
        
        System.out.println("Enter the Number of Month");
        month = input.nextInt();
        
        switch (month) {
            case 1: System.out.println("January of "+year+" has 31 Days");
            break;
            case 2: 
                if ((year%4==0 && year%100 !=0) || year%400==0) {
                    System.out.println("February of "+year+" has 29 Days");
                } else {
                    System.out.println("February of "+year+" has 28 Days");
                }
                System.out.println("February of "+year+" has 31 Days");
            break;
            case 3: System.out.println("March of "+year+" has 31 Days");
            break;
            case 4: System.out.println("April of "+year+" has 30 Days");
            break;
            case 5: System.out.println("May of "+year+" has 31 Days");
            break;
            case 6: System.out.println("June of "+year+" has 30 Days");
            break;
            case 7: System.out.println("July of "+year+" has 31 Days");
            break;
            case 8: System.out.println("August of "+year+" has 31 Days");
            break;
            case 9: System.out.println("September of "+year+" has 30 Days");
            break;
            case 10: System.out.println("October of "+year+" has 31 Days");
            break;
            case 11: System.out.println("November of "+year+" has 30 Days");
            break;
            case 12: System.out.println("December of "+year+" has 31 Days");
            break;
            default:System.out.println("Month value should be between 1 and 12");
        }
        
    }
}
