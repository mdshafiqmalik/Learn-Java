package com.shafiqhub;

import java.util.Scanner;

public class LS_14_Switch {

    public static void main(String[] args) {
        System.out.println("Enter any number between 1 to 7");
        Scanner scan = new Scanner(System.in);
        int dayNum = scan.nextByte();
        switch(dayNum) {
            case 1:
                System.out.println("Moday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thrusday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
            default:
                System.out.println("Please enter the number in the range");
        }

    }
}
