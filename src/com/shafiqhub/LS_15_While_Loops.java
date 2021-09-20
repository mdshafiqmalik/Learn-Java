//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package com.shafiqhub;

import java.util.Scanner;

public class LS_15_While_Loops {
    public static void main(String[] args) {
        int i = 1;
        int myScore = 0;
        int compScore = 0;
        System.out.println("Enter 1 to 3 for five times to check your luck");

        for(; i <= 5; ++i) {
            int randomNumber = (int)Math.floor(Math.random() * 3.0D + 1.0D);
            Scanner scan = new Scanner(System.in);
            byte number = scan.nextByte();
            System.out.println(randomNumber);
            boolean isTrue = number == randomNumber;
            if (isTrue) {
                ++myScore;
            } else {
                ++compScore;
            }
        }

        System.out.println("Your Score is :" + myScore);
        System.out.println("Computer Score: "+compScore);
    }
}
